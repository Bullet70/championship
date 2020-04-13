package it.esinware.championship.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import it.esinware.championship.domain.Score;
import it.esinware.championship.dto.ScoreModel;
import it.esinware.championship.persistence.ScoreRepository;

public class ScoreService {
	
	@Autowired
	private ScoreRepository reposScore;

	public ScoreModel loadScore(Long id) {
		ScoreModel model = new ScoreModel();
		Score score = reposScore.getOne(id);
		return model;
		
	}
	
	public ScoreModel saveScore(Long id){
		ScoreModel model= new ScoreModel();
		Score score=reposScore.getOne(id);
		return model;
	}
	
	public void deleteScore(Long id ) {
		reposScore.deleteById(id);
	}
	
	public Optional <Score> findByIdScore(Long id) {

        return reposScore.findById(id);
    }
	



}
