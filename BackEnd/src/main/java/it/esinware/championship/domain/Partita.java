package it.esinware.championship.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Partita {

	@Id
	private Long id;
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
	private String gethomeTeam() {
		return homeTeam;
	}

	private String getguestTeam() {
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