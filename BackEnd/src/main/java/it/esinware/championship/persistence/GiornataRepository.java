package it.esinware.championship.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import it.esinware.championship.domain.Giornata;

@Repository
public interface GiornataRepository extends JpaRepository<Giornata, Long>{
}
