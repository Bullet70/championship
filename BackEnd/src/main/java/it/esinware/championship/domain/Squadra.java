package it.esinware.championship.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Squadra implements Comparable<Squadra> {

	@Id
	private Long id;
	private String name;

	// costruttore
	public Squadra(String name) {
		this.name = name;
	}
	private Squadra () {
		
	} //costruttore senza parametri

	// metodi get e set
	private String getName() {
		return name;
	}

	// metodo toString
	public String tostring(){
		return name+"p";
	}
	
	// ordinamento oggetti di tipo squadra
//	if(nome.equals(s.getNome))return 0;
//	int risultato = punti - s.getPunti();

	@Override
	public int compareTo(Squadra o) {
		// TODO Auto-generated method stub
		return 0;
	}
//	if(risultato==0)risultato=nome.compareTo(s.getNome());return risultato;
}// classe