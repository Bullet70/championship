package it.esinware.championship.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import it.esinware.championship.dto.PlayerModel;
import it.esinware.championship.service.PlayerService;


@RestController
@RequestMapping
public class PlayerController {
	
	@Autowired
	private PlayerService service;
	
	
	@GetMapping(path = "{id}")
	public ResponseEntity<PlayerModel> loadPlayer(@PathVariable Long id) {
		return ResponseEntity.ok(service.loadPlayer(id));
	}

	public ResponseEntity<PlayerModel> savePlayer(@PathVariable Long id) {
		return ResponseEntity.ok(service.savePlayer(id));
	}
	
	public void deleteByIdPlayer(@PathVariable Long id) {
		service.deletePlayer(id);
		
	}
	

}
