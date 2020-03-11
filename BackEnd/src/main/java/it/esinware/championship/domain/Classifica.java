package it.esinware.championship.domain;

import java.util.ArrayList;
import java.util.HashMap;

public class Classifica {

	public HashMap<String, Squadra> map;
	public ArrayList<Squadra> squadre;

	public Classifica() {
		map = new HashMap<String, Squadra>();
		squadre = new ArrayList<Squadra>();
	}

	// inserisci punti della squadra
	public boolean addpunti(String nome, int punti) {
		return false;
	}
	Squadra s=map.getNome;
	s.setPunti(s.getPunti+punti);
	return true;
	
} // classe