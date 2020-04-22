import { Component } from '@angular/core';
import { MenuItem } from 'primeng/api';
import { map } from 'rxjs/operators';
import { CountryModel } from 'app/models';
import { CountryService } from 'app/services/country.service';

@Component({
	selector: 'app-menu', 
	templateUrl: './menu.component.html',
	styleUrls: ['./menu.component.css']
})
export class MenuComponent {
	items: MenuItem[];
	activeItem: MenuItem;
	constructor(private service: CountryService) {}

	ngOnInit() {
		this.service.loadCountries().subscribe(response => {
			this.items = [];
			response.forEach(item => this.items.push({label: item.name, routerLink: 'championships', fragment: item.id}));
		});
	}
}