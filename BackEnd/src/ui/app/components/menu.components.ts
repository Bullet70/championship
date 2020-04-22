import { Component } from '@angular/core';
import { MenuItem } from 'primeng/api';


@Component({
	selector: 'app-menu', 
	templateUrl: './menu.component.html',
	styleUrls: ['./menu.component.css']
})
export class MenuComponent {
	
	items:MenuItem[]
	
	activeItem:MenuItem;
	

    ngOnInit() {
        this.items = [
            {label: 'Italia', icon: 'pi pi-fw pi-italia', routerLink: 'championships', fragment: '1'},
            {label: 'Germania', icon: 'pi pi-fw pi-germania', routerLink: 'championships', fragment: '2'},
            {label: 'Inghilterra', icon: 'pi pi-fw pi-Inghilterra', routerLink: 'championships', fragment: '3'},
            {label: 'Spagna', icon: 'pi pi-fw pi-spagna', routerLink: 'championships', fragment: '4'},
			{label: 'Francia', icon: 'pi pi-fw pi-francia', routerLink: 'championships', fragment: '5'},
			{label: 'Olanda', icon: 'pi pi-fw pi-olanda', routerLink: 'championships', fragment: '6'}
        ];

		 this.activeItem = this.items[0];

		}
}
