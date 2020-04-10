package it.esinware.championship.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import it.esinware.championship.domain.Partita;
import it.esinware.championship.dto.PartitaModel;
import it.esinware.championship.persistence.PartitaRepository;




@Service
public class PartitaService {
	
	@Autowired
	private PartitaRepository reposPartita;

	public PartitaModel loadPartita(Long id) {
		PartitaModel model = new PartitaModel();
		Partita partita = reposPartita.getOne(id);
		model.setDescription(partita.getHomeTeam().getName() + "/" + partita.getGuestTeam().getName());
		partita.getScore().forEach(minute -> {
			PartitaModel scoreModel = new PartitaModel();
			scoreModel.setMinute(scoreModel.getMinute());
			model.addScore(scoreModel);
		});
		
		return model;
		}
	
	public PartitaModel savePartita(Long id){
		PartitaModel model= new PartitaModel();
		Partita partita = reposPartita.getOne(id);
		model.setDescription(partita.getHomeTeam().getName() + "/" + partita.getGuestTeam().getName());
		partita.getScore().forEach(minute -> {
			PartitaModel scoreModel = new PartitaModel();
			scoreModel.setMinute(scoreModel.getMinute());
			model.addScore(scoreModel);
		});
		return model;
	}
	
	public void deletePartita(Long id ) {
		reposPartita.deleteById(id);
	}

	public Optional <Partita> findByIdPartita(Long id) {

        return reposPartita.findById(id);
    }
}
