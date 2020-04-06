package it.esinware.championship.service;

import org.springframework.beans.factory.annotation.Autowired;
import it.esinware.championship.domain.Score;
import it.esinware.championship.dto.ScoreModel;
import it.esinware.championship.persistence.ScoreRepository;

public class ScoreService {
	
	@Autowired
	private ScoreRepository repos;

	public ScoreModel loadScore(Long id) {
		ScoreModel model = new ScoreModel();
		Score score = repos.getOne(id);
		return model;
		
	}
	
	public ScoreModel saveScore(Long id){
		ScoreModel model= new ScoreModel();
		Score score=repos.getOne(id);
		return model;
	}
	



}
