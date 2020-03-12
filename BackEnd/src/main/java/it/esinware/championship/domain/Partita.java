package it.esinware.championship.domain;

public class Partita {

	private String homeTeam;
	private String guestTeam;
	int homeScore;
	int guestScore;

	public Partita(String homeTeam,String guestTeam) {
		this.homeTeam = homeTeam;
		this.guestTeam = guestTeam;
		homeScore = -1;
		guestScore = -1;
	} // costruttore

	public Partita(Partita p) {
		homeTeam = p.homeTeam;
		guestTeam= p.guestTeam;
	}

	// metodi get e set
	public Squadra gethomeTeam() {
		return homeTeam;
	}

	public Squadra getguestTeam() {
		return guestTeam;
	}

	public void setRisultato(int homeScore, int guestScore) {
		this.homeScore = homeScore;
		this.guestScore = guestScore;
	}

	// metodo che manda in output una stringa con il risultato
	public String toString() {
		return homeTeam + "-" + guestTeam + ":" + homeScore + "-" + guestScore;
	}
} // classe