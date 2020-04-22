package it.esinware.championship.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import it.esinware.championship.domain.Championship;

@Repository
public interface ChampionshipRepository extends JpaRepository<Championship, Long> {
	
	}