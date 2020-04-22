package it.esinware.championship.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import it.esinware.championship.domain.Game;
import it.esinware.championship.dto.GameModel;
import it.esinware.championship.persistence.PartitaRepository;




@Service
public class PartitaService {
	
	@Autowired
	private PartitaRepository reposPartita;

	public GameModel loadPartita(Long id) {
		GameModel model = new GameModel();
		Game partita = reposPartita.getOne(id);
		model.setDescription(partita.getHomeTeam().getName() + "/" + partita.getGuestTeam().getName());
		partita.getScore().forEach(minute -> {
			GameModel scoreModel = new GameModel();
			scoreModel.setMinute(scoreModel.getMinute());
			model.addScore(scoreModel);
		});
		
		return model;
		}
	
	public GameModel savePartita(Long id){
		GameModel model= new GameModel();
		Game partita = reposPartita.getOne(id);
		model.setDescription(partita.getHomeTeam().getName() + "/" + partita.getGuestTeam().getName());
		partita.getScore().forEach(minute -> {
			GameModel scoreModel = new GameModel();
			scoreModel.setMinute(scoreModel.getMinute());
			model.addScore(scoreModel);
		});
		return model;
	}
	
	public void deletePartita(Long id ) {
		reposPartita.deleteById(id);
	}

	public Optional <Game> findByIdPartita(Long id) {

        return reposPartita.findById(id);
    }
}
