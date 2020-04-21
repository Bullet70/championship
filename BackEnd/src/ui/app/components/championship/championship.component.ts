import { Component } from '@angular/core';
import { ChampionshipModel } from 'app/models';

@Component({
	templateUrl: 'championship.component.html'
})
export class ChampionshipComponent {
	
	championship: ChampionshipModel;
	championships: ChampionshipModel[]= new Array();
	
	constructor() {
		this.championship = new ChampionshipModel();
		}
	
	
	bo() {
		this.championships = [...this.championships, this.championship];
		this.championship = new ChampionshipModel();
	
	}
}

