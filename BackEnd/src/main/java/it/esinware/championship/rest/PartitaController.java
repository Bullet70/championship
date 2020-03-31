package it.esinware.championship.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.esinware.championship.dto.ChampionshipModel;
import it.esinware.championship.service.PartitaService;


@SuppressWarnings("unused")
public class PartitaController {
	
	@Autowired
	private PartitaService service;
	
	
	@GetMapping(path = "{id}")
	public ResponseEntity<ChampionshipModel> loadPartita(@PathVariable Long id) {
		return ResponseEntity.ok(service.loadPartita(id));
	}

}
