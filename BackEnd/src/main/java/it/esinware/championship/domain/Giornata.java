package it.esinware.championship.domain;

public class Giornata {
	private int date;
	private String match;
	private int numberRound;
	//get/set
	public int getDate() {
		return date;
	}
	
	public void setDate(int date) {
		this.date = date;
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
	//costruttore
	public Giornata(int date, String match, int numberRound) {
		this.date=date;
		this.match=match;
		this.numberRound=numberRound;
		
	}
	//costruttore di copia profonda
	 public Giornata(Giornata g) {
		 date=g.date;
		 match=g.match;
		 numberRound=g.numberRound;
	 }
	
	

}