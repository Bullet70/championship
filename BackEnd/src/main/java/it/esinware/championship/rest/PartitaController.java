package it.esinware.championship.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import it.esinware.championship.dto.PartitaModel;
import it.esinware.championship.service.PartitaService;


@RestController
@RequestMapping
public class PartitaController {
	
	@Autowired
	private PartitaService service;
	
	
	@GetMapping(path = "{id}")
	public ResponseEntity<PartitaModel> loadPartita(@PathVariable Long id) {
		return ResponseEntity.ok(service.loadPartita(id));
	}

	public ResponseEntity<PartitaModel> savePartita(@PathVariable Long id) {
		return ResponseEntity.ok(service.savePartita(id));
	}
	
	public void deleteByIdPartita(@PathVariable Long id) {
		service.deletePartita(id);
		
	}
	
}

