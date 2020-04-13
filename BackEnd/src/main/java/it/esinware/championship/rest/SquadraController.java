package it.esinware.championship.rest;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import it.esinware.championship.domain.Squadra;
import it.esinware.championship.dto.SquadraModel;
import it.esinware.championship.service.SquadraService;


@RestController
@RequestMapping
public class SquadraController {
	
	@Autowired
	private SquadraService service;

	@GetMapping(path = "{id}")
	public ResponseEntity<SquadraModel> loadSquadra(@PathVariable Long id) {
		return ResponseEntity.ok(service.loadSquadra(id));
	}
	
	public ResponseEntity<SquadraModel> saveSquadra(@PathVariable Long id) {
		return ResponseEntity.ok(service.saveSquadra(id));
	}
	
	public void deleteByIdSquadra(@PathVariable Long id) {
		service.deleteSquadra(id);
		}
	
	public ResponseEntity<Optional<Squadra>> findbyIdSquadra(@PathVariable Long id) {
		return ResponseEntity.ok(service.findByIdSquadra(id));
	}
	
}
