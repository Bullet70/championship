package it.esinware.championship.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import it.esinware.championship.domain.Player;

@Repository
public interface PlayerRepository  extends JpaRepository<Player, Long> {

}
