package it.esinware.championship.rest;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import it.esinware.championship.domain.Giornata;
import it.esinware.championship.dto.GiornataModel;
import it.esinware.championship.service.GiornataService;


@RestController
@RequestMapping
public class GiornataController {
	
	@Autowired
	private GiornataService service;
	
	
	@GetMapping(path = "{id}")
	public ResponseEntity<GiornataModel> loadGiornata(@PathVariable Long id) {
		return ResponseEntity.ok(service.loadGiornata(id));
	}
	
	public ResponseEntity<GiornataModel> saveGiornata(@PathVariable Long id) {
		return ResponseEntity.ok(service.saveGiornata(id));
	}
	
	public void deleteByIdGiornata(@PathVariable Long id) {
		service.deleteGiornata(id);
		
	}
	
	public ResponseEntity<Optional<Giornata>> findbyIdGiornata(@PathVariable Long id) {
		return ResponseEntity.ok(service.findByIdGiornata(id));
	}
	
	
	

}
