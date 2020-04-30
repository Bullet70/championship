import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable, of } from 'rxjs';
import { RoundModel, ROUNDS } from 'app/models/round.model';

@Injectable()
export class RoundService {
	
	constructor(private http: HttpClient) {}
	
	public loadRounds(): Observable<RoundModel[]> {
		return of(ROUNDS);
//		return this.http.get<RoundModel[]>('rounds');
	}
}