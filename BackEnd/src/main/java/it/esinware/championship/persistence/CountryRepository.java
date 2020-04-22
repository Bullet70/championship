package it.esinware.championship.persistence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import it.esinware.championship.domain.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long>  {

}
