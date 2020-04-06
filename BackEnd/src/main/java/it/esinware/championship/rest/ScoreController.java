package it.esinware.championship.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.esinware.championship.dto.ScoreModel;
import it.esinware.championship.service.ScoreService;


@RestController
@RequestMapping
public class ScoreController {
	
	@Autowired
	private ScoreService service;

	@GetMapping(path = "{id}")
	public ResponseEntity<ScoreModel> loadScore(@PathVariable Long id) {
		return ResponseEntity.ok(service.loadScore(id));
	}
	
	public ResponseEntity<ScoreModel> saveScore(@PathVariable Long id) {
		return ResponseEntity.ok(service.saveScore(id));
	}

}
