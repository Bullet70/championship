package it.esinware.championship.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.esinware.championship.domain.Giornata;
import it.esinware.championship.domain.Player;
import it.esinware.championship.dto.PlayerModel;
import it.esinware.championship.persistence.PlayerRepository;

@Service
public class PlayerService {
	
	@Autowired
	private PlayerRepository reposPlayer;

	public PlayerModel loadPlayer(Long id) {
		PlayerModel model = new PlayerModel();
		Player player = reposPlayer.getOne(id);
		return model;
		
	}
	
	public PlayerModel savePlayer(Long id){
		PlayerModel model= new PlayerModel();
		Player player=reposPlayer.getOne(id);
		return model;
	}
	
	public void deletePlayer(Long id ) {
		reposPlayer.deleteById(id);
	}
	
	public Optional <Player> findByIdPlayer(Long id) {

        return reposPlayer.findById(id);
    }

}
