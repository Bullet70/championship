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
  	{id: 5, name: 'Premier League', country: 3},
  	{id: 6, name: 'La Liga', country: 4},
  	{id: 7, name: 'Ligue 1', country: 5}
]