import { Component } from '@angular/core';
import { MenuItem } from 'primeng/api';


@Component({
	selector: 'app-menu',
	templateUrl: './menu.component.html',
	styleUrls: ['./menu.component.css']
})
export class MenuComponent {
	
	items1:MenuItem[];
	
	activeItem:MenuItem;
	

    ngOnInit() {
        this.items1 = [
            {label: 'Squadre', icon: 'pi pi-fw pi-squadre', routerLink: 'teams'},
            {label: 'Calendario', icon: 'pi pi-fw pi-calendario', routerLink: 'fixtures'},
            {label: 'Classifica', icon: 'pi pi-fw pi-classifica'},
            {label: 'Marcatori', icon: 'pi pi-fw pi-marcatori'},
        ];


		
    }
}