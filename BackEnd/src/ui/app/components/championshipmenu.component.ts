import { Component } from '@angular/core';
import { MenuItem } from 'primeng/api';


@Component({
	selector: 'championship-menu', 
	templateUrl: './championshipMenu.component.html',
})
export class ChampionshipmenuComponent {
	
	items:MenuItem[]
	
	activeItem:MenuItem;
	
	 ngOnInit() {
		 
		 this.items = [
           {label: 'Serie A', icon: 'pi pi-fw pi-seriea'},
           {label: 'Serie B', icon: 'pi pi-fw pi-serieb'},
           {label: 'Serie C', icon: 'pi pi-fw pi-seriec'},
          
       ];

		 this.activeItem = this.items[0];
	}
}
	