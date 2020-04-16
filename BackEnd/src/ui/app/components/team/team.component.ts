import { Component, OnInit } from '@angular/core';
import { SquadraModel } from 'app/models';
import { TeamService } from 'app/services/team.service';

@Component({
	templateUrl: 'team.component.html'
})
export class TeamComponent implements OnInit {
	
	squadra: SquadraModel;
	squadre: SquadraModel[];
	
	constructor(private service: TeamService) {}
	
	ngOnInit() {
		this.service.loadTeams().subscribe(response => this.squadre = response);
	}
}