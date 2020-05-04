import { Component, Input, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { RoundModel } from 'app/models/round.model';
import { RoundService } from 'app/services/round.service';

@Component({
	selector: 'privatefixtures',
	templateUrl: 'privatefixtures.component.html'
})
export class PrivatefixturesComponent implements OnInit {
	@Input() team;
	rounds: RoundModel[];
	
	constructor(private snapshot: ActivatedRoute, private service: RoundService) {}
	ngOnInit() {
		this.service.loadRounds().subscribe(response => this.rounds = response);
	}
}