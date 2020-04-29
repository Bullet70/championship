import { Component, Input, OnInit } from '@angular/core';
import { GiornataModel } from 'app/models';

@Component({
	selector: 'fixtures',
	templateUrl: 'fixtures.component.html'
})
export class FixturesComponent implements OnInit {
	@Input() championship;
	giornata: GiornataModel= new GiornataModel();
	giornate: GiornataModel[]= new Array();
	
	constructor() {}
	ngOnInit() {
		
	}
}