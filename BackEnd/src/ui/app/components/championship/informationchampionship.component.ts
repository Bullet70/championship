import { Component, OnInit, Input, OnChanges, SimpleChanges } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { InformationchampionshipModel } from 'app/models/informationchampionship.model';
import { InformationchampionshipService } from 'app/services/informationchampionship.service';


@Component({
	selector: 'informationchampionship',
	templateUrl: 'informationchampionship.component.html'
})
export class InformationchampionshipComponent implements OnChanges, OnInit {
	@Input() championship: number;
	informationchampionships: InformationchampionshipModel[];

	constructor(private snapshot: ActivatedRoute, private service: InformationchampionshipService) {
		
	}
	
	ngOnChanges(changes: SimpleChanges): void {
		
	}

	ngOnInit() {
		this.service.loadInformationchampionships(this.championship).subscribe(response => this.informationchampionships = response);		
	}
}