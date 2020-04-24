import { Component } from '@angular/core';
import { MenuItem } from 'primeng/api';


@Component({
	selector: 'championship-menu', 
	templateUrl: './championshipmenu.component.html',
})
export class ChampionshipmenuComponent {
	
	items1:MenuItem[]
	
	activeItem:MenuItem;
	
	 ngOnInit() {
		 
		 this.items1 = [
           {label: 'Rosa', icon: 'pi pi-fw pi-rosa'},
           {label: 'Calendario', icon: 'pi pi-fw pi-calendario'},
           {label: 'Società', icon: 'pi pi-fw pi-società'},
          
       ];

	}
}
	