package it.esinware.championship.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import it.esinware.championship.domain.Partita;
import it.esinware.championship.dto.PartitaModel;
import it.esinware.championship.persistence.PartitaRepository;




@Service
public class PartitaService {
	
	@Autowired
	private PartitaRepository repos;

	public PartitaModel loadPartita(Long id) {
		PartitaModel model = new PartitaModel();
		Partita partita = repos.getOne(id);
		return model;
		
	}
	
	public PartitaModel savePartita(Long id){
		PartitaModel model= new PartitaModel();
		Partita partita=repos.getOne(id);
		return model;
	}
	

}
