package it.esinware.championship.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import it.esinware.championship.domain.Squadra;

@Repository
public interface SquadraRepository extends JpaRepository<Squadra, Long> {
}
