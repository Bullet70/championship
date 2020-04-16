import { Component } from '@angular/core';
import { GiornataModel } from 'app/models';

@Component({
	templateUrl: 'fixtures.component.html'
})
export class FixturesComponent {
	
	giornata: GiornataModel;
	giornate: GiornataModel[]= new Array();
}