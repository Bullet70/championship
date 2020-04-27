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


//import { Component, Input, OnInit, OnChanges, SimpleChanges } from '@angular/core';
//import { ActivatedRoute } from '@angular/router';
//import { RankingModel } from 'app/models/ranking.model';
//import { RankingService } from 'app/services/ranking.service';

//@Component({
//	selector: 'ranking',
//	templateUrl: 'ranking.component.html'
//})
//export class RankingComponent implements OnInit {
//	@Input() championship: number;
//	rankings: RankingModel[]= new Array();
	
//	constructor(private snapshot: ActivatedRoute, private service: RankingService) {}
//	ngOnChanges(changes: SimpleChanges): void {}
	
//	ngOnInit() {
//		this.service.loadRankings(this.championship).subscribe(response => this.rankings = response);
//	}
//}