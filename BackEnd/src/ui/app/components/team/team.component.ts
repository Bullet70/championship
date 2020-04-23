import { Component, OnInit } from '@angular/core';
import { TeamModel } from 'app/models';
import { TeamService } from 'app/services/team.service';

@Component({
	templateUrl: 'team.component.html'
})
export class TeamComponent implements OnInit {
	
	squadra: TeamModel;
	squadre: TeamModel[];
	
	constructor(private service: TeamService) {}
	
	ngOnInit() {
		this.service.loadTeams(2).subscribe(response => this.squadre = response);
	}
}