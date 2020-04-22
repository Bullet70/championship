import { Component, OnInit } from '@angular/core';
import { MenuItem } from 'primeng/api';
import { CountryService } from 'app/services/country.service';

@Component({
	selector: 'app-root',
	templateUrl: './app.component.html',
	styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
	
	countries: MenuItem[];
	
	constructor(private service: CountryService) {}

	ngOnInit() {
		this.service.loadCountries().subscribe(response => {
			this.countries = [];
			response.forEach(item => this.countries.push({label: item.name, routerLink: 'championships', fragment: item.id}));
		});
	}
}