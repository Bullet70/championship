import { Component } from '@angular/core';
import { ChampionshipModel } from 'app/models';
import { PlayerModel } from 'app/models';

@Component({
	selector: 'app-root',
	templateUrl: './app.component.html',
	styleUrls: ['./app.component.css']
})
export class AppComponent {
	
	championship: ChampionshipModel;
	championships: ChampionshipModel[] = new Array();
	player: PlayerModel;
	players: PlayerModel[]= new Array();
	
	constructor() {
		this.championship = new ChampionshipModel();
		this.player= new PlayerModel();
	}
	
	
	bo() {
		this.championships = [...this.championships, this.championship];
		this.championship = new ChampionshipModel();
		this.players =[...this.players, this.player];
		this.player = new PlayerModel();
	}
}