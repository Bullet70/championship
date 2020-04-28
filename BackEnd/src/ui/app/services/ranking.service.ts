import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable, of } from 'rxjs';
import { RankingModel, RANKINGS } from 'app/models/ranking.model'

@Injectable()
export class RankingService {
	
	constructor(private http: HttpClient) {}
	
//	public loadRankings(championship: number): Observable<RankingModel[]> {
//		return of(RANKINGS.filter(item => item.championship == championship));
//	}

public getRankings(): Observable<RankingModel[]> {
		return this.http.get<RankingModel[]>('rankings');
	}
}