import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { PlayerModel } from 'app/models';

@Injectable()
export class PlayerService {
	
	constructor(private http: HttpClient) {}
	
	public loadPlayers(): Observable<PlayerModel[]> {
		return this.http.get<PlayerModel[]>('http://localhost:8080/ChampionshipBE/players');
	}
}