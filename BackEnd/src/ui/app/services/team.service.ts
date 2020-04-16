import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { SquadraModel } from 'app/models';

@Injectable()
export class TeamService {
	
	constructor(private http: HttpClient) {}
	
	public loadTeams(): Observable<SquadraModel[]> {
		return this.http.get<SquadraModel[]>('http://localhost:8080/ChampionshipBE/teams');
	}
}