package it.esinware.championship.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import it.esinware.championship.domain.Squadra;

@SuppressWarnings("unused")
public interface SquadraRepository extends JpaRepository<Squadra, Long> {
}
