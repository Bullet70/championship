import { Component, OnInit, Input } from '@angular/core'
import { RankinggoalModel } from 'app/models/rankinggoal.model'

@Component({
	selector: 'rankinggoal',
	templateUrl: 'rankinggoal.component.html'
})
export class RankinggoalComponent implements OnInit {
	@Input() championship;
	rankinggoal: RankinggoalModel = new RankinggoalModel();
	rankinggoals: RankinggoalModel[]= new Array();
	
	constructor() {}
	
	ngOnInit() {
		
	}
}