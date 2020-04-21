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
            {label: 'Italia', icon: 'pi pi-fw pi-squadre', routerLink: 'championships'},
            {label: 'Germania', icon: 'pi pi-fw pi-calendario', routerLink: 'championships'},
            {label: 'Inghilterra', icon: 'pi pi-fw pi-classifica', routerLink: 'championships'},
            {label: 'Spagna', icon: 'pi pi-fw pi-marcatori', routerLink: 'championships'},
        ];

		 
	

        this.items = [
            {label: 'Serie A', icon: 'pi pi-fw pi-seriea'},
            {label: 'Serie B', icon: 'pi pi-fw pi-serieb'},
            {label: 'Serie C', icon: 'pi pi-fw pi-seriec'},
           
        ];

		 this.activeItem = this.items[1];




		
    }
}

