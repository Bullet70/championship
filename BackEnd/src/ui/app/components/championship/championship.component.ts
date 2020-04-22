import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { MenuItem } from 'primeng/api';
import { ChampionshipModel } from 'app/models';
import { ChampionshipService } from 'app/services/championship.service';

@Component({
	templateUrl: 'championship.component.html'
})
export class ChampionshipComponent implements OnInit {
	
	championship: ChampionshipModel;
	championships: MenuItem[];
	
	constructor(private snapshot: ActivatedRoute, private cService: ChampionshipService) {
		this.championship = new ChampionshipModel();
		}
	
	ngOnInit() {
		console.log(this.snapshot.snapshot.fragment);
		this.cService.loadChampionships().subscribe(response => {
			this.championships = [];
			response.forEach(item => this.championships.push({label: item.description}))
		});
	}
	
	bo() {
		this.championships = [...this.championships, this.championship];
		this.championship = new ChampionshipModel();
	
	}
}

