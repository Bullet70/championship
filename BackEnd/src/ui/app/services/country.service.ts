import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { CountryModel } from 'app/models';

@Injectable()
export class CountryService {
	
	constructor(private http: HttpClient) {}
	
	public loadCountries(): Observable<CountryModel[]> {
		return this.http.get<CountryModel[]>('http://localhost:8080/ChampionshipBE/countries');
	}
}