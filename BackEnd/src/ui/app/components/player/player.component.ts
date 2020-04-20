import { Component } from '@angular/core';
import { PlayerModel } from 'app/models';
import { PlayerService } from 'app/services/player.service';

@Component({
	templateUrl: 'player.component.html'
})
export class PlayerComponent {
	
	player: PlayerModel;
	players: PlayerModel[]= new Array();
	
	constructor(private service: PlayerService) {}
	
	ngOnInit() {
		this.service.loadPlayers().subscribe(response => this.players = response);
	}
}