import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable, of } from 'rxjs';
import { TeamModel, TEAMS } from 'app/models';

@Injectable()
export class TeamService {
	
	constructor(private http: HttpClient) {}
	
	public loadTeams(league: number): Observable<TeamModel[]> {
		return of(TEAMS.filter(item => item.league == league));
//		return this.http.get<TeamModel[]>('teams');
	}
}