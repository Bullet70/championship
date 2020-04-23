import { Component, OnInit, Input } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { ChampionshipModel } from 'app/models';
import { ChampionshipService } from 'app/services/championship.service';

@Component({
	selector: 'championship',
	templateUrl: 'championship.component.html'
})
export class ChampionshipComponent implements OnInit {
	@Input() league: number;
	@Input() team: number;
	championships: ChampionshipModel[];

	constructor(private snapshot: ActivatedRoute, private cService: ChampionshipService) {
	}

	ngOnInit() {
		console.log(this.snapshot.snapshot.fragment);
		this.cService.loadChampionships(this.league).subscribe(response => this.championships = response);
	}
}