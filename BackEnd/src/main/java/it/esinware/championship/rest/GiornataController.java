package it.esinware.championship.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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

}
