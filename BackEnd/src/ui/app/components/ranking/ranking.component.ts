import { Component, Input, OnInit } from '@angular/core';
import { TeamModel } from 'app/models';
@Component({
	selector: 'ranking',
	templateUrl: 'ranking.component.html'
})
export class RankingComponent implements OnInit {
	@Input() championship;
	squadra: TeamModel = new TeamModel();
	squadre: TeamModel[]= new Array();
	
	constructor() {}
	
	ngOnInit() {
		
	}
}