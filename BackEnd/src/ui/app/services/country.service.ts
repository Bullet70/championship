import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable, of } from 'rxjs';
import { first } from 'rxjs/operators';
import { CountryModel, COUNTRIES } from 'app/models';

@Injectable()
export class CountryService {
	
	constructor(private http: HttpClient) {}
	
	public loadCountries(): Observable<CountryModel[]> {
		return of(COUNTRIES).pipe(first());
		//return this.http.get<CountryModel[]>('countries');
	}
}