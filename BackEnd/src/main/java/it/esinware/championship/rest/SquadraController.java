package it.esinware.championship.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import it.esinware.championship.dto.ChampionshipModel;
import it.esinware.championship.service.SquadraService;


@SuppressWarnings("unused")
public class SquadraController {
	
	@Autowired
	private SquadraService service;

	@GetMapping(path = "{id}")
	public ResponseEntity<ChampionshipModel> loadSquadra(@PathVariable Long id) {
		return ResponseEntity.ok(service.loadSquadra(id));
	}
}
