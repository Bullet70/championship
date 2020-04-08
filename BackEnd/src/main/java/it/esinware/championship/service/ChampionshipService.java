package it.esinware.championship.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import it.esinware.championship.domain.Campionato;
import it.esinware.championship.dto.ChampionshipModel;
import it.esinware.championship.dto.GiornataModel;
import it.esinware.championship.persistence.ChampionshipRepository;

@Service
public class ChampionshipService {

	
	@Autowired
	private ChampionshipRepository reposCampionato;
	
	
	public ChampionshipModel loadCampionato(Long id) {
		ChampionshipModel model = new ChampionshipModel();
		Campionato campionato = reposCampionato.getOne(id);
		model.setDescription(campionato.getStartYear().getYear() + "/" + campionato.getEndYear().getYear());
		campionato.getFixtures().forEach(round -> {
			GiornataModel roundModel = new GiornataModel();
			roundModel.setRoundNumber(round.getNumberRound());
			model.addRound(roundModel);
		});
		return model;
	}
	
	
	public ChampionshipModel saveCampionato(Long id){
		ChampionshipModel model= new ChampionshipModel();
		Campionato campionato=reposCampionato.getOne(id);
		model.setDescription(campionato.getStartYear().getYear() + "/" + campionato.getEndYear().getYear());
		campionato.getFixtures().forEach(round -> {
			GiornataModel roundModel = new GiornataModel();
			roundModel.setRoundNumber(round.getNumberRound());
			model.addRound(roundModel);
		});
		
		return model;
	}
	
	public void deleteCampionato(Long id ) {
		reposCampionato.deleteById(id);
	}
	
	
	
	
	
	
	
}