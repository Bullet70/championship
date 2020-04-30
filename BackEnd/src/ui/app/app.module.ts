import { BrowserModule } from '@angular/platform-browser';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { HttpClientModule, HTTP_INTERCEPTORS } from '@angular/common/http';
import { RouterModule } from '@angular/router';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { DropdownModule } from 'primeng/dropdown';
import { ButtonModule } from 'primeng/button';
import { TableModule } from 'primeng/table';
import { AppComponent } from 'app/app.component';
import { TabMenuModule } from 'primeng/tabmenu';
import { TabViewModule } from 'primeng/tabview';
import { SplitButtonModule } from 'primeng/splitbutton';
import { MenuComponent } from 'app/components/menu.components';
import { TeamComponent } from 'app/components/team/team.component';
import { AppRoutingModule } from './app-routing.module';
import { TeamService } from 'app/services/team.service';
import { PlayerComponent } from 'app/components/player/player.component';
import { PlayerService } from 'app/services/player.service';
import { RankingComponent } from 'app/components/ranking/ranking.component';
import { OrderListModule } from 'primeng/orderlist';
import { LeagueComponent } from 'app/components/championship/league.component';
import { ChampionshipService } from 'app/services/championship.service';
import { CountryService } from 'app/services/country.service';
import { BackEndInterceptor } from 'app/extension/backend.interceptor';
import { ChampionshipmenuComponent } from 'app/components/championshipmenu.component';
import { LeagueService } from 'app/services/league.service';
import { ChampionshipComponent } from 'app/components/championship/championship.component';
import { CountryEditComponent } from 'app/components/country/country-edit.component';
import { RankingService } from 'app/services/ranking.service';
import { InformationchampionshipComponent } from 'app/components/championship/informationchampionship.component';
import { InformationchampionshipService } from 'app/services/informationchampionship.service';
import { RankinggoalComponent } from 'app/components/ranking/rankinggoal.component';
import { FixturesComponent } from 'app/components/fixtures/fixtures.component';
import { RoundService } from 'app/services/round.service';



@NgModule({
	declarations: [
		AppComponent,
		MenuComponent,
		TeamComponent,
		PlayerComponent,
		RankingComponent,
		LeagueComponent,
		ChampionshipComponent,
		ChampionshipmenuComponent,
		CountryEditComponent,
		InformationchampionshipComponent,
		RankinggoalComponent,
		FixturesComponent,
	
		
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
		OrderListModule,
		TabViewModule


	],

	providers: [
		TeamService,
		PlayerService,
		ChampionshipService,
		CountryService,
		LeagueService,
		RankingService,
		InformationchampionshipService,
		RoundService,
		{ provide: HTTP_INTERCEPTORS, useClass: BackEndInterceptor, multi: true }
	],
	bootstrap: [AppComponent],
	entryComponents: []
})
export class AppModule { }
