export class LeagueModel {
	id: number;
	name: string;
	country: number
}

export const LEAGUES: LeagueModel[] = [
  	{id: 1, name: 'Serie A', country: 1},
  	{id: 2, name: 'Serie B', country: 1},
  	{id: 3, name: 'Lega Pro A', country: 1},
	{id: 4, name: 'Lega Pro B', country: 1},
	{id: 5, name: 'Lega Pro C', country: 1},
  	{id: 6, name: 'Bundesliga', country: 2},
	{id: 7, name: 'Zweite Bundesliga', country: 2},
	{id: 8, name: '3.Liga', country: 2},
  	{id: 9, name: 'Premier League', country: 3},
	{id: 10, name: 'Championship', country: 3},
	{id: 11, name: 'League One', country: 3},  
  	{id: 12, name: 'La Liga', country: 4},
	{id: 13, name: 'Segunda Division', country: 4},
	{id: 14, name: 'Segunda Division B', country: 4},
  	{id: 15, name: 'Ligue 1', country: 5},
	{id: 16, name: 'Ligue 2', country: 5},
	{id: 17, name: 'Championnat National', country: 5},
	{id: 18, name: 'Eredivise', country: 6},
	{id: 19, name: 'Eerste Divisie', country: 6},
	{id: 20, name: 'Derde Divisie', country: 6}
	
]