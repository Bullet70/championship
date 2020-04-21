import { BrowserModule } from '@angular/platform-browser';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { HttpClientModule } from '@angular/common/http';
import { RouterModule } from '@angular/router';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { DropdownModule } from 'primeng/dropdown';
import { ButtonModule } from 'primeng/button';
import { TableModule } from 'primeng/table';
import { AppComponent } from 'app/app.component';
import { TabMenuModule } from 'primeng/tabmenu';
import { SplitButtonModule } from 'primeng/splitbutton';
import { MenuComponent } from 'app/components/menu.components';
import { TeamComponent } from 'app/components/team/team.component';
import { AppRoutingModule } from './app-routing.module';
import { FixturesModule } from 'app/components/fixtures/fixtures.module';
import { TeamService } from 'app/services/team.service';
import { PlayerComponent } from 'app/components/player/player.component';
import { PlayerService } from 'app/services/player.service';
import { RankingComponent } from 'app/components/ranking/ranking.component';
import { OrderListModule } from 'primeng/orderlist';
import { ChampionshipComponent } from 'app/components/championship/championship.component';
import { ChampionshipService } from 'app/services/championship.service';
import { CountryService } from 'app/services/country.service';


@NgModule({
	declarations: [
		AppComponent,
		MenuComponent,
		TeamComponent,
		PlayerComponent,
		RankingComponent,
		ChampionshipComponent,
	],
	imports: [
		BrowserModule,
		BrowserAnimationsModule,
		CommonModule,
		FormsModule,
		RouterModule,
		HttpClientModule,
		ReactiveFormsModule,
		DropdownModule,
		ButtonModule,
		TableModule,
		TabMenuModule,
		SplitButtonModule,
		AppRoutingModule,
		FixturesModule, 
		OrderListModule,
		
		
		
  ],
 
	providers: [
		TeamService,
		PlayerService,
		ChampionshipService,
		CountryService,
		
	],
	bootstrap: [AppComponent],
	entryComponents: []
})
export class AppModule { }
