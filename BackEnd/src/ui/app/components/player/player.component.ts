import { Component } from '@angular/core';
import { PlayerModel } from 'app/models';

@Component({
	templateUrl: 'player.component.html'
})
export class PlayerComponent {
	
	giornata: PlayerModel;
	giornate: PlayerModel[]= new Array();
	
	constructor(private service: TeamService) {}
	
	ngOnInit() {
		this.service.loadPlayers().subscribe(response => this.player = response);
	}
}