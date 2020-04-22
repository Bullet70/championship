package it.esinware.championship.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import it.esinware.championship.dto.CountryModel;
import it.esinware.championship.service.CountryService;

@RestController
@RequestMapping(path = "country")
public class CountryController {
	@Autowired
	private CountryService service;

	@GetMapping(path = "{countries}")
	public ResponseEntity<CountryModel> loadCountry(@PathVariable Long countries) {
		return ResponseEntity.ok(service.loadCountry(countries));
	}
}
