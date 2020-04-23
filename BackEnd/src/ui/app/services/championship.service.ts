import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable, of } from 'rxjs';
import { ChampionshipModel, CHAMPIONSHIPS } from 'app/models';

@Injectable()
export class ChampionshipService {
	
	constructor(private http: HttpClient) {}
	
	public loadChampionships(league: number): Observable<ChampionshipModel[]> {
		return of(CHAMPIONSHIPS.filter(item => item.league == league));
	}
	
//	public loadChampionshipsIta(): Observable<ChampionshipModel[]>{
//		return of([
//            {id: '7', description: 'Serie A', startYear: 2019, endYear: 2020},
//           {id: '8', description: 'Serie B', startYear: 2019, endYear: 2020},
//            {id: '9', description: 'Serie C', startYear: 2019, endYear: 2020},
//        ]);
//	}
//	public loadChampionshipsIng(): Observable<ChampionshipModel[]>{
//		return of([
//            {id: '10', description: 'Premier League', startYear: 2019, endYear: 2020},
//           {id: '11', description: 'Championship', startYear: 2019, endYear: 2020},
//            {id: '12', description: 'League One', startYear: 2019, endYear: 2020},
//        ]);
//	}
//	public loadChampionshipsGer(): Observable<ChampionshipModel[]>{
//		return of([
//            {id: '13', description: 'Bundesliga', startYear: 2019, endYear: 2020},
//           {id: '14', description: 'Zweite Bundesliga', startYear: 2019, endYear: 2020},
//            {id: '15', description: '3.Liga', startYear: 2019, endYear: 2020},
//        ]);
//	}
//	public loadChampionshipSpa(): Observable<ChampionshipModel[]>{
//		return of([
//            {id: '13', description: 'LaLiga', startYear: 2019, endYear: 2020},
//           {id: '14', description: 'Segunda Division', startYear: 2019, endYear: 2020},
//            {id: '15', description: 'Segunda Division B', startYear: 2019, endYear: 2020},
//        ]);
//	}
//	public loadChampionshipsFra(): Observable<ChampionshipModel[]>{
//		return of([
//            {id: '13', description: 'Ligue 1', startYear: 2019, endYear: 2020},
//           {id: '14', description: 'Ligue 2', startYear: 2019, endYear: 2020},
//            {id: '15', description: 'Championnat National', startYear: 2019, endYear: 2020},
//        ]);
//	}
//	public loadChampionshipsOla(): Observable<ChampionshipModel[]>{
//		return of([
//            {id: '13', description: 'Eredivise', startYear: 2019, endYear: 2020},
//           {id: '14', description: 'Eerste Divisie', startYear: 2019, endYear: 2020},
//            {id: '15', description: 'Derde Divisie', startYear: 2019, endYear: 2020},
//        ]);
//	}
	
}