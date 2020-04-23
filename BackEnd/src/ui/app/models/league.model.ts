export class LeagueModel {
	id: number;
	name: string;
	country: number
}

export const LEAGUES: LeagueModel[] = [
  	{id: 1, name: 'Serie A', country: 1},
  	{id: 2, name: 'Serie B', country: 1},
  	{id: 3, name: 'Lega Pro', country: 1},
  	{id: 4, name: 'Bundesliga', country: 2},
	{id: 5, name: 'Zweite Bundesliga', country: 2},
	{id: 6, name: '3.Liga', country: 2},
  	{id: 7, name: 'Premier League', country: 3},
	{id: 8, name: 'Championship', country: 3},
	{id: 9, name: 'League One', country: 3},  
  	{id: 10, name: 'La Liga', country: 4},
	{id: 11, name: 'Segunda Division', country: 4},
	{id: 12, name: 'Segunda Division B', country: 4},
  	{id: 13, name: 'Ligue 1', country: 5},
	{id: 14, name: 'Ligue 2', country: 5},
	{id: 15, name: 'Championnat National', country: 5},
	{id: 16, name: 'Eredivise', country: 6},
	{id: 17, name: 'Eerste Divisie', country: 6},
	{id: 18, name: 'Derde Divisie', country: 6}
	
]