import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable, of } from 'rxjs';
import { CountryModel } from 'app/models';

@Injectable()
export class CountryService {
	
	constructor(private http: HttpClient) {}
	
	public loadCountries(): Observable<CountryModel[]> {
		return of([
            {id: '1', name: 'Italia'},
            {id: '2', name: 'Germania'},
            {id: '3', name: 'Inghilterra'},
            {id: '4', name: 'Spagna'},
			{id: '5', name: 'Francia'},
			{id: '6', name: 'Olanda'}
        ]);
		//return this.http.get<CountryModel[]>('countries');
	}
}