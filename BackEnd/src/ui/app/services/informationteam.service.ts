import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable, of } from 'rxjs';
import { InformationteamModel, INFORMATIONTEAMS } from 'app/models/informationteam.model';

@Injectable()
export class InformationteamService {
	
	constructor(private http: HttpClient) {}
	
	public loadInformationteams(team:number): Observable<InformationteamModel[]> {
		return of(INFORMATIONTEAMS.filter(item => item.team == team));
	}
}