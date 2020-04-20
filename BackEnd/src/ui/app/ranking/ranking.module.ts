import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { ButtonModule } from 'primeng/button';
import { TableModule } from 'primeng/table';
import { RankingRoutingModule } from './ranking-routing.module';
import { RankingComponent } from 'app/components/ranking/ranking.component';

@NgModule({
  declarations: [
		RankingComponent
  ],
  imports: [
    CommonModule,
    FormsModule,
		TableModule,
		ButtonModule,
		RankingRoutingModule
  ],
	exports: [
		RankingRoutingModule
	],
  providers: [

	]
})
export class rankingModule {}