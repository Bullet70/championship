import { Component, Input, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { RoundModel } from 'app/models/round.model';
import { RoundService } from 'app/services/round.service';

@Component({
	selector: 'fixtures',
	templateUrl: 'fixtures.component.html'
})
export class FixturesComponent implements OnInit {
	@Input() championship;
	rounds: RoundModel[];
	
	constructor(private snapshot: ActivatedRoute, private service: RoundService) {}
	ngOnInit() {
		this.service.loadRounds().subscribe(response => this.rounds = response);
	}
}