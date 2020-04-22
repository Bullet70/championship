package it.esinware.championship.rest;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import it.esinware.championship.domain.Team;
import it.esinware.championship.dto.TeamModel;
import it.esinware.championship.service.SquadraService;


@RestController
@RequestMapping
public class SquadraController {
	
	@Autowired
	private SquadraService service;

	@GetMapping(path = "{teams}")
	public ResponseEntity<TeamModel> loadSquadra(@PathVariable Long teams) {
		return ResponseEntity.ok(service.loadSquadra(teams));
	}
	
	public ResponseEntity<TeamModel> saveSquadra(@PathVariable Long id) {
		return ResponseEntity.ok(service.saveSquadra(id));
	}
	
	public void deleteByIdSquadra(@PathVariable Long id) {
		service.deleteSquadra(id);
		}
	
	public ResponseEntity<Optional<Team>> findbyIdSquadra(@PathVariable Long id) {
		return ResponseEntity.ok(service.findByIdSquadra(id));
	}
	
}
