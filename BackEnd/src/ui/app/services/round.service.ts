import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { RoundModel } from 'app/models/round.model';

@Injectable()
export class RoundService {
	
	constructor(private http: HttpClient) {}
	
	public loadRounds(): Observable<RoundModel[]> {
		return this.http.get<RoundModel[]>('rounds');
	}
}