package it.esinware.championship.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import it.esinware.championship.domain.Player;
import it.esinware.championship.dto.PlayerModel;
import it.esinware.championship.persistence.PlayerRepository;

@Service
public class PlayerService {
	
	@Autowired
	private PlayerRepository repos;

	public PlayerModel loadPlayer(Long id) {
		PlayerModel model = new PlayerModel();
		Player player = repos.getOne(id);
		return model;
		
	}
	
	public PlayerModel savePlayer(Long id){
		PlayerModel model= new PlayerModel();
		Player player=repos.getOne(id);
		return model;
	}

}
