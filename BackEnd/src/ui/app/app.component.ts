import { Component, OnInit } from '@angular/core';
import { MenuItem } from 'primeng/api';
import { CountryService } from 'app/services/country.service';
import { CountryModel } from 'app/models';

@Component({
	selector: 'app-root',
	templateUrl: './app.component.html',
	styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
	
	countries: CountryModel[];
	country: CountryModel;
	currentIndex: number;
	isEditing: boolean = false;
	
	constructor(private service: CountryService) {}

	ngOnInit() {
		this.service.loadCountries().subscribe(response => {
			this.countries = response;
//			this.countries = [];
//			response.forEach(item => this.countries.push({label: item.name, routerLink: 'championships', fragment: item.id}));
		});
	}
	
	new(): CountryModel {
		this.isEditing = true;
		return new CountryModel();
	}
	
	edit(event, country: CountryModel) {
		console.log(event);
		event.stopPropagation();
		console.log(event);
		this.isEditing = true;
		this.country = country;
	}
	
	changeTab(event) {
		console.log('Tab');
		if(this.currentIndex != event.index) {
			this.country = null;
		}
		this.currentIndex = event.index;
	}
}