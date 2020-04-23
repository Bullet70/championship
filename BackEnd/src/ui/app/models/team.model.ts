export class TeamModel {
	id: number;
	league: number;
	name: string;
	points: number;
}

export const TEAMS: TeamModel[] = [
	{ id: 1, league: 1, name: 'Atalanta', points: 0 },
	{ id: 2, league: 1, name: 'Bologna', points: 0 }
]