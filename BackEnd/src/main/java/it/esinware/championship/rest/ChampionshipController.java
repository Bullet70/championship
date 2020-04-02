package it.esinware.championship.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import it.esinware.championship.dto.ChampionshipModel;
import it.esinware.championship.service.ChampionshipService;

@RestController
@RequestMapping(path = "championship")
public class ChampionshipController {

	@Autowired
	private ChampionshipService service;
	
	
	@GetMapping(path = "{id}")
	public ResponseEntity<ChampionshipModel> loadChampionship(@PathVariable Long id) {
		return ResponseEntity.ok(service.loadCampionato(id));
	}
	
	public ResponseEntity<ChampionshipModel> deleteByIdChampionship(@PathVariable Long id) {
		return ResponseEntity.ok(service.deleteByIdCampionato(id));
	}
	
	public ResponseEntity<ChampionshipModel> saveChampionship(@PathVariable Long id) {
		return ResponseEntity.ok(service.saveCampionato(id));
	}
	
	
	
	
}