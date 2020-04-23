export class ChampionshipModel {
	id: number;
	league: number;
	description: string;
	startYear: number;
	endYear: number;
}

export const CHAMPIONSHIPS: ChampionshipModel[] = [
	{id: 1, league: 1, description: 'Serie A 2019/2020', startYear: 2019, endYear: 2020}
]