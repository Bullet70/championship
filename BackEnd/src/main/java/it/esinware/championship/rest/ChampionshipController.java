package it.esinware.championship.rest;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import it.esinware.championship.domain.Championship;
import it.esinware.championship.dto.ChampionshipModel;
import it.esinware.championship.service.ChampionshipService;

@RestController
@RequestMapping(path = "championship")
public class ChampionshipController {
	@Autowired
	private ChampionshipService service;

	@GetMapping(path = "{championships}")
	public ResponseEntity<ChampionshipModel> loadChampionship(@PathVariable Long championships) {
		return ResponseEntity.ok(service.loadCampionato(championships));
	}

	public ResponseEntity<ChampionshipModel> saveChampionship(@PathVariable Long id) {
		return ResponseEntity.ok(service.saveCampionato(id));
	}

	public void deleteByIdCampionato(@PathVariable Long id) {
		service.deleteCampionato(id);
	}

	public ResponseEntity<Optional<Championship>> findbyIdChampionship(@PathVariable Long id) {
		return ResponseEntity.ok(service.findByIdCampionato(id));
	}
}