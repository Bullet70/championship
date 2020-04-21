package it.esinware.championship.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import it.esinware.championship.domain.Country;
import it.esinware.championship.dto.CountryModel;
import it.esinware.championship.persistence.CountryRepository;

@Service
public class CountryService {

	
	@Autowired
	private CountryRepository reposCountry;
	
	public CountryModel loadCountry(Long id) {
		CountryModel model = new CountryModel();
		Country country = reposCountry.getOne(id);
		return model;
	}
}