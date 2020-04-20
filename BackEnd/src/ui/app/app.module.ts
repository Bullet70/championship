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
import {TabMenuModule} from 'primeng/tabmenu';
import {SplitButtonModule} from 'primeng/splitbutton';
import { MenuComponent } from 'app/components/menu.components';
import { TeamComponent } from 'app/components/team/team.component';
import { AppRoutingModule } from './app-routing.module';
import { FixturesModule } from 'app/components/fixtures/fixtures.module';
import { TeamService } from 'app/services/team.service';
import { PlayerComponent } from 'app/components/player/player.component';
import { RankingModule } from 'app/components/ranking/ranking.module';
import {DataViewModule} from 'primeng/dataview';



@NgModule({
  declarations: [
		AppComponent,
		MenuComponent,
		TeamComponent,
		PlayerComponent
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
		Playermodule,
		RankingModule,
		DataViewModule
		
		
  ],
  providers: [
		TeamService
		PlayerService
	],
  bootstrap: [AppComponent],
	entryComponents: []
})
export class AppModule {}
