import { Component, Input, OnInit } from '@angular/core';
import { RankingModel } from 'app/models/ranking.model'
@Component({
	selector: 'ranking',
	templateUrl: 'ranking.component.html'
})
export class RankingComponent implements OnInit {
	@Input() championship;
	ranking: RankingModel = new RankingModel();
	rankings: RankingModel[]= new Array();
	
	constructor() {}
	
	ngOnInit() {
		
	}
}


//import { Component, OnInit } from '@angular/core';
//import { RankingModel } from 'app/models/ranking.model';
//import { RankingService } from 'app/services/ranking.service';

//@Component({
//	selector: 'ranking',
//	templateUrl: 'ranking.component.html'
//})
//export class RankingComponent implements OnInit {

//rankings: RankingModel[];	
	
//	constructor(private service: RankingService) {}
	
//	ngOnInit() {
//		this.service.getRankings().subscribe(rankings => this.rankings = rankings);
//	}
//}