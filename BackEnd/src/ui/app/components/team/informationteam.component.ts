import { Component, OnInit, Input, OnChanges, SimpleChanges } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { InformationteamModel } from 'app/models/informationteam.model';
import { InformationteamService } from 'app/services/informationteam.service';

@Component({
	selector: 'informationteam',
	templateUrl: 'informationteam.component.html'
})
export class InformationteamComponent implements OnChanges, OnInit {
	@Input() team: number;
	informationteams: InformationteamModel[];

	constructor(private snapshot: ActivatedRoute, private service: InformationteamService) {
		
	}
	
	ngOnChanges(changes: SimpleChanges): void {
		
	}

	ngOnInit() {
		this.service.loadInformationteams(this.team).subscribe(response => this.informationteams = response);		
	}
}