package it.esinware.championship.domain;
public class Squadra implements Comparable<Squadra> {

	private String nome;

	// costruttore
	public Squadra(String nome) {
		this.nome = nome;
	}

	// metodi get e set
	private String getNome() {
		return nome;
	}

	// metodo toString
	public String tostring(){
		return nome+"p";
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