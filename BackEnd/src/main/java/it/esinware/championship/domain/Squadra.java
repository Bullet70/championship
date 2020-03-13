package it.esinware.championship.domain;
public class Squadra implements Comparable<Squadra> {

	private String name;

	// costruttore
	public Squadra(String name) {
		this.name = name;
	}

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