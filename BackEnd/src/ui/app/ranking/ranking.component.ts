import { Component } from '@angular/core';
import { SquadraModel } from 'app/models';
@Component({
	templateUrl: 'ranking.component.html'
})
export class RankingComponent {
	squadra: SquadraModel;
	squadre: SquadraModel[]= new Array();
}