package it.esinware.championship.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Giornata {
	@Id
	private Long id;
	private int day;
	private String match;
	private int numberRound;
	
	//costruttore
		public Giornata(int day, String match, int numberRound) {
			this.day=day;
			this.match=match;
			this.numberRound=numberRound;
			}
		
		private Giornata() {
			
		} //costruttore senza parametri
		
		//costruttore di copia profonda
		 public Giornata(Giornata g) {
			 day=g.day;
			 match=g.match;
			 numberRound=g.numberRound;
		 }
		
	//get/set
	public int getDay() {
		return day;
	}
	
	public void setDay(int day) {
		this.day = day;
	}

	public String getMatch() {
		return match;
	}

	public void setMatch(String match) {
		this.match = match;
	}

	public int getNumberRound() {
		return numberRound;
	}

	public void setNumberRound(int numberRound) {
		this.numberRound = numberRound;
	}
	
} //classe