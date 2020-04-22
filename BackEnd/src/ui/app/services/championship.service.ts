import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable, of } from 'rxjs';
import { ChampionshipModel } from 'app/models';

@Injectable()
export class ChampionshipService {
	
	constructor(private http: HttpClient) {}
	
	public loadChampionships(): Observable<ChampionshipModel[]>{
		return of([
            {id: '7', description: 'Serie A'},
           {id: '8', description: 'Serie B'},
            {id: '9', description: 'Serie C'},
        ]);
	}
}