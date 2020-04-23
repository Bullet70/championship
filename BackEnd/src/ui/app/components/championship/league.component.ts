import { Component, OnInit, Input, OnChanges, SimpleChanges } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { LeagueModel } from 'app/models';
import { LeagueService } from 'app/services/league.service';

@Component({
	selector: 'league',
	templateUrl: 'league.component.html'
})
export class LeagueComponent implements OnChanges, OnInit {
	@Input() country: number;
	leagues: LeagueModel[];

	constructor(private snapshot: ActivatedRoute, private service: LeagueService) {
		
	}
	
	ngOnChanges(changes: SimpleChanges): void {
		console.log(changes);
	}

	ngOnInit() {
		this.service.loadLeagues(this.country).subscribe(response => this.leagues = response);
//		console.log(this.snapshot.snapshot.fragment);
//		this.cService.loadChampionshipsIta().subscribe(response => {
//			this.championship
//			this.championships = [];
//			response.forEach(item => this.championships.push({ label: item.description }))
//		});

	}
}