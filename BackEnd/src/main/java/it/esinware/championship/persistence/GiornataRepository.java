package it.esinware.championship.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import it.esinware.championship.domain.Round;

@Repository
public interface GiornataRepository extends JpaRepository<Round, Long>{
}
