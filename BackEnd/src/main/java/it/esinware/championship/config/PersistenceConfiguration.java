package it.esinware.championship.config;

import java.util.Properties;
import javax.persistence.EntityManagerFactory;
import javax.persistence.spi.PersistenceProvider;
import javax.sql.DataSource;
import org.eclipse.persistence.config.PersistenceUnitProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.LoadTimeWeavingConfigurer;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.instrument.classloading.LoadTimeWeaver;
import org.springframework.instrument.classloading.SimpleLoadTimeWeaver;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
@PropertySource(value = "classpath:championship.properties")
public class PersistenceConfiguration extends SimpleLoadTimeWeaver implements LoadTimeWeavingConfigurer {

	@Autowired
	Environment env;

	@Bean("dataSource")
	public DataSource getDataSource() {
		HikariConfig config = new HikariConfig();
		config.setDriverClassName(env.getProperty("datasource.driver"));
		config.setJdbcUrl(env.getProperty("datasource.url"));
		config.setUsername(env.getProperty("datasource.username"));
		config.setPassword(env.getProperty("datasource.password"));
		config.setMaximumPoolSize(10);
		config.setMinimumIdle(5);
		return new HikariDataSource(config);
	}

	@Bean("transactionManager")
	@Autowired
	public PlatformTransactionManager transactionManager(EntityManagerFactory entityManagerFactoryFel) {
		JpaTransactionManager txManager = new JpaTransactionManager();
		txManager.setEntityManagerFactory(entityManagerFactoryFel);
		return txManager;
	}

	@Bean("entityManagerFactory")
	@Autowired
	public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource dataSourceFel) {
		LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
		factory.setDataSource(dataSourceFel);
		factory.setPersistenceUnitName("championship");
		factory.setPackagesToScan("it.esinware.championship.domain");
		try {
			factory.setPersistenceProvider(
					(PersistenceProvider) Class.forName(env.getProperty("datasource.provider")).newInstance());
		} catch(InstantiationException | IllegalAccessException | ClassNotFoundException e) {}
		Properties prop = new Properties();
		if(env.containsProperty("datasource.createTable")) {
			prop.setProperty("javax.persistence.schema-generation.database.action",
					env.getProperty("datasource.createTable"));
		}
		if(env.containsProperty("datasource.showSQL"))
			prop.setProperty("eclipselink.logging.level.sql", env.getProperty("datasource.fel.showSQL"));
		if(env.containsProperty("datasource.showSQLParams"))
			prop.setProperty("eclipselink.logging.parameters", env.getProperty("datasource.fel.showSQLParams"));
		prop.setProperty("javax.persistence.sharedCache.mode", "NONE");
		prop.setProperty(PersistenceUnitProperties.WEAVING, Boolean.FALSE.toString());
		prop.setProperty(PersistenceUnitProperties.WEAVING_INTERNAL, Boolean.FALSE.toString());
		factory.setJpaProperties(prop);
		return factory;
	}

	@Override
	public LoadTimeWeaver getLoadTimeWeaver() {
		return this;
	}

	@Override
	public ClassLoader getInstrumentableClassLoader() {
		ClassLoader instrumentableClassLoader = super.getInstrumentableClassLoader();
    if (instrumentableClassLoader.getClass().getName().endsWith("SimpleInstrumentableClassLoader")) {
        return instrumentableClassLoader.getParent();
    } else {
        return instrumentableClassLoader;
    }
	}
}