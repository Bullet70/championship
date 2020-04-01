package it.esinware.championship.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import it.esinware.championship.domain.Partita;


@Repository
public interface PartitaRepository extends JpaRepository<Partita, Long>  {
}
