import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { ChampionshipModel } from 'app/models';

@Injectable()
export class ChampionshipService {
	
	constructor(private http: HttpClient) {}
	
	public loadChampionships(): Observable<ChampionshipModel[]> {
		return this.http.get<ChampionshipModel[]>('championships');
	}
}