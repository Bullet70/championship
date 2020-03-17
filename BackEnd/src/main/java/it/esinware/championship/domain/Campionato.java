package it.esinware.championship.domain;

public class Campionato {
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
	
	public Campionato (String nameChampionship,int startYear,int endYear) {
		this.nameChampionship=nameChampionship;
		this.startYear=startYear;
		this.endYear=endYear;
		
	}
	
	
	
	

}
