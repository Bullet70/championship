import { Component, OnInit, Input, OnChanges, SimpleChanges } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { TeamModel } from 'app/models';
import { TeamService } from 'app/services/team.service';

@Component({
	selector: 'team',
	templateUrl: 'team.component.html'
})
export class TeamComponent implements OnInit {
	@Input() informationchampionship: number;
	teams: TeamModel[];
	

	constructor(private snapshot: ActivatedRoute, private service: TeamService) {}
	
	ngOnChanges(changes: SimpleChanges): void {}
	
	
	ngOnInit() {
		this.service.loadTeams(this.informationchampionship).subscribe(response => this.teams = response);
	}
}