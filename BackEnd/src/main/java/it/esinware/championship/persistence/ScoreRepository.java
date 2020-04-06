package it.esinware.championship.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import it.esinware.championship.domain.Score;

@Repository
public interface ScoreRepository  extends JpaRepository<Score, Long> {

}
