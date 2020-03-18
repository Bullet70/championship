package it.esinware.championship.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Campionato {
	
	@Id
	private String nameChampionship;
	private int startYear;
	private int endYear;
	
	public String getNameChampionship() {
		return nameChampionship;
	}
	public void setNameChampionship(String nameChampionship) {
		this.nameChampionship = nameChampionship;
	}
	public int getStartYear() {
		return startYear;
	}
	public void setStartYear(int startYear) {
		this.startYear = startYear;
	}
	public int getEndYear() {
		return endYear;
	}
	public void setEndYear(int endYear) {
		this.endYear = endYear;
	}
	//costruttore
	public Campionato (String nameChampionship,int startYear,int endYear) {
		this.nameChampionship=nameChampionship;
		this.startYear=startYear;
		this.endYear=endYear;
		
	}
	//costruttore di copia profonda
	public Campionato (Campionato campionato) {
		nameChampionship=campionato.nameChampionship;
		startYear=campionato.startYear;
		endYear=campionato.endYear;
		
		
		
	}
	
	
	

}
