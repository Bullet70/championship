package it.esinware.championship.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import it.esinware.championship.domain.Campionato;

@Repository
public interface ChampionshipRepository extends JpaRepository<Campionato, Long> {
}