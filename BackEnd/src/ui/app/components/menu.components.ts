import { Component } from '@angular/core';
import { MenuItem } from 'primeng/api';
import { CountryModel } from 'app/models';
import { CountryService } from 'app/services/country.service';

@Component({
	selector: 'app-menu',
	templateUrl: './menu.component.html',
	styleUrls: ['./menu.component.css']
})
export class MenuComponent {

	items: CountryModel[];
	activeItem: MenuItem;

	constructor(private service: CountryService) {}

	ngOnInit() {
		this.service.loadCountries().subscribe(response => this.items = response);
	}
}