package it.esinware.championship.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.esinware.championship.domain.Round;
import it.esinware.championship.domain.Team;
import it.esinware.championship.dto.TeamModel;
import it.esinware.championship.persistence.SquadraRepository;

@Service
public class SquadraService<reposSquadra> {
	
	@Autowired
	private SquadraRepository reposSquadra;
	
	
	public TeamModel loadSquadra(Long teams) {
		TeamModel model = new TeamModel();
		Team squadra = reposSquadra.getOne(teams);
		model.setDescription(squadra.getName());
		squadra.getPlayers().forEach( player -> {
			TeamModel playerModel = new TeamModel();
				playerModel.setName(playerModel.getName());
				playerModel.setSurname(playerModel.getSurname());
				model.addPlayer(playerModel);
			});
		
		
		return model;
	}
		
	
	public TeamModel saveSquadra (Long id){
		TeamModel model= new TeamModel();
		Team squadra=reposSquadra.getOne(id);
		model.setDescription(squadra.getName());
		squadra.getPlayers().forEach( player -> {
			TeamModel playerModel = new TeamModel();
				playerModel.setName(playerModel.getName());
				playerModel.setSurname(playerModel.getSurname());
				model.addPlayer(playerModel);
			});
		return model;
	}
	
	public void deleteSquadra(Long id ) {
		reposSquadra.deleteById(id);
	}
	
	public Optional <Team> findByIdSquadra(Long id) {

        return reposSquadra.findById(id);
    }
	
	
}
