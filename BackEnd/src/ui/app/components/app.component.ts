import { Component } from '@angular/core';
import { ChampionshipModel } from 'models';
import { SquadraModel } from 'models';
import { GiornataModel} from 'models';

@Component({
	selector: 'app-root',
	templateUrl: './app.component.html',
	styleUrls: ['./app.component.css']
})
export class AppComponent {
	
	championship: ChampionshipModel;
	championships: ChampionshipModel[] = new Array();
	squadra: SquadraModel;
	squadre: SquadraModel[]= new Array();
	giornata: GiornataModel;
	giornate: GiornataModel[]= new Array();
	
	constructor() {
		this.championship = new ChampionshipModel();
		this.squadra= new SquadraModel();
		this.giornata= new GiornataModel();
	}
	

	
	
	bo() {
		this.championships = [...this.championships, this.championship];
		this.championship = new ChampionshipModel();
		this.squadre = [...this.squadre, this.squadra];
		this.squadra = new SquadraModel();
		this.giornate =[...this.giornate, this.giornata];
		this.giornata = new GiornataModel();
	}
}