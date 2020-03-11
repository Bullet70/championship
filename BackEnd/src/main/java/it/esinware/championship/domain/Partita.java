package it.esinware.championship.domain;

public class Partita {

	private Squadra a;
	private Squadra b;
	int goalCasa;
	int goalOspite;

	public Partita(Squadra a, Squadra b) {
		this.a = a;
		this.b = b;
		goalCasa = -1;
		goalOspite = -1;
	} // costruttore

	public Partita(Partita p) {
		a = p.a;
		b = p.b;
	}

	// metodi get e set
	public Squadra getSquadraCasa() {
		return a;
	}

	public Squadra getSquadraOspite() {
		return b;
	}

	public void setRisultato(int goalCasa, int goalOspite) {
		this.goalCasa = goalCasa;
		this.goalOspite = goalOspite;
	}

	// metodo che manda in output una stringa con il risultato
	public String toString() {
		return a + "-" + b + ":" + goalCasa + "-" + goalOspite;
	}
} // classe