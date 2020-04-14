import { Component } from '@angular/core';
import { ChampionshipModel } from 'models';

@Component({
	selector: 'app-root',
	templateUrl: './app.component.html',
	styleUrls: ['./app.component.css']
})
export class AppComponent {
	
	championship: ChampionshipModel;
	championships: ChampionshipModel[] = new Array();
	
	constructor() {
		this.championship = new ChampionshipModel();
	}
	
	bo() {
		this.championships = [...this.championships, this.championship];
		this.championship = new ChampionshipModel();
	}
}