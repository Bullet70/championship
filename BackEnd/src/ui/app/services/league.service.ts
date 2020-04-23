import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable, of } from 'rxjs';
import { LeagueModel, LEAGUES } from 'app/models';

@Injectable()
export class LeagueService {
	
	constructor(private http: HttpClient) {}
	
	public loadLeagues(country: number): Observable<LeagueModel[]> {
		return of(LEAGUES.filter(item => item.country == country));
	}
}