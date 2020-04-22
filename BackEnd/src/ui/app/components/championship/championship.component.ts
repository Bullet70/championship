import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { ChampionshipModel } from 'app/models';

@Component({
	templateUrl: 'championship.component.html'
})
export class ChampionshipComponent implements OnInit {
	
	championship: ChampionshipModel;
	championships: ChampionshipModel[]= new Array();
	
	constructor(private snapshot: ActivatedRoute) {
		this.championship = new ChampionshipModel();
		}
	
	ngOnInit() {
		console.log(this.snapshot.snapshot.fragment);
	}
	
	bo() {
		this.championships = [...this.championships, this.championship];
		this.championship = new ChampionshipModel();
	
	}
}

