package it.esinware.championship.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import it.esinware.championship.domain.Round;
import it.esinware.championship.dto.RoundModel;
import it.esinware.championship.dto.GameModel;
import it.esinware.championship.persistence.GiornataRepository;


@Service
public class GiornataService {
	
	@Autowired
	private GiornataRepository reposGiornata;
	
	public RoundModel loadGiornata(Long id) {
		RoundModel model = new RoundModel();
		Round giornata= reposGiornata.getOne(id);
		model.setDescription(giornata.getDay().getDay());
		giornata.getGames().forEach( game-> {
			GameModel gameModel = new GameModel();
			gameModel.getHomeTeam();
			gameModel.getGuestTeam();
			model.addGame(game);
		
			
		});
		return model;
	}
	
	public RoundModel saveGiornata(Long id){
		RoundModel model= new RoundModel();
		Round giornata=reposGiornata.getOne(id);
		model.setDescription(giornata.getDay().getDay());
		giornata.getGames().forEach( game-> {
			GameModel gameModel = new GameModel();
			gameModel.getHomeTeam();
			gameModel.getGuestTeam();
			model.addGame(game);
		});
		
		return model;
	}
	
	public void deleteGiornata(Long id ) {
		reposGiornata.deleteById(id);
	}
	
	public Optional <Round> findByIdGiornata(Long id) {

        return reposGiornata.findById(id);
    }
	
}
