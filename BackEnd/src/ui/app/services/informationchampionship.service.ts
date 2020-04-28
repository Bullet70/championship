import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable, of } from 'rxjs';
import { InformationchampionshipModel, INFORMATIONCHAMPIONSHIPS } from 'app/models/informationchampionship.model';

@Injectable()
export class InformationchampionshipService {
	
	constructor(private http: HttpClient) {}
	
	public loadInformationchampionships(league: number): Observable<InformationchampionshipModel[]> {
		return of(INFORMATIONCHAMPIONSHIPS.filter(item => item.league == league));
	}
}