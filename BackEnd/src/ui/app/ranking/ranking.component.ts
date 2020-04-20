import { Component } from '@angular/core';
import { SquadraModel } from 'app/models';

@Component ({
	templateUrl: 'ranking.component.html'
})
export class FixturesComponent {
	
	giornata: SquadraModel;
	giornate: SquadraModel[]= new Array();
}