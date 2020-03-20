package it.esinware.championship.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Giornata {
	@Id
	private Long id;
	private int day;
	private String partita;
	private int numberRound;
	
	//costruttore
		public Giornata(int day, String partita, int numberRound) {
			this.day=day;
			this.partita=partita;
			this.numberRound=numberRound;
			}
		
		private Giornata() {
			
		} //costruttore senza parametri
		
		//costruttore di copia profonda
		 public Giornata(Giornata g) {
			 day=g.day;
			 partita=g.partita;
			 numberRound=g.numberRound;
		 }
		
	//get/set
	public int getDay() {
		return day;
	}
	
	public void setDay(int day) {
		this.day = day;
	}

	public String getPartita() {
		return partita;
	}

	public void setPartita(String partita) {
		this.partita = partita;
	}

	public int getNumberRound() {
		return numberRound;
	}

	public void setNumberRound(int numberRound) {
		this.numberRound = numberRound;
	}
	
} //classe