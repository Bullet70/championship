package it.esinware.championship.rest;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import it.esinware.championship.domain.Player;
import it.esinware.championship.dto.PlayerModel;
import it.esinware.championship.service.PlayerService;


@RestController
@RequestMapping
public class PlayerController {
	
	@Autowired
	private PlayerService service;
	
	
	@GetMapping(path = "{players}")
	public ResponseEntity<PlayerModel> loadPlayer(@PathVariable Long players) {
		return ResponseEntity.ok(service.loadPlayer(players));
	}

	public ResponseEntity<PlayerModel> savePlayer(@PathVariable Long id) {
		return ResponseEntity.ok(service.savePlayer(id));
	}
	
	public void deleteByIdPlayer(@PathVariable Long id) {
		service.deletePlayer(id);
		
	}
	
	public ResponseEntity<Optional<Player>> findbyIdPlayer(@PathVariable Long id) {
		return ResponseEntity.ok(service.findByIdPlayer(id));
	}
	

}
