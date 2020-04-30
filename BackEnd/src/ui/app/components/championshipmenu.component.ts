import { Component } from '@angular/core';
import { MenuItem } from 'primeng/api';


@Component({
	selector: 'championship-menu', 
	templateUrl: './championshipmenu.component.html',
})
export class ChampionshipmenuComponent {
	
	items:MenuItem[]
	
	activeItem:MenuItem;
	
	 ngOnInit() {
		 
		 this.items = [
           {label: 'Rosa', icon: 'pi pi-fw pi-rosa'},
           {label: 'Calendario', icon: 'pi pi-fw pi-calendario'},
           {label: 'Societ�', icon: 'pi pi-fw pi-societ�'},
          
       ];

	}
}
	