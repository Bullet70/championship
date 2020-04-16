import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { ButtonModule } from 'primeng/button';
import { TableModule } from 'primeng/table';
import { FixturesRoutingModule } from './fixtures-routing.module';
import { FixturesComponent } from 'app/components/fixtures/fixtures.component';

@NgModule({
  declarations: [
		FixturesComponent
  ],
  imports: [
    CommonModule,
    FormsModule,
		TableModule,
		ButtonModule,
		FixturesRoutingModule
  ],
	exports: [
		FixturesRoutingModule
	],
  providers: [

	]
})
export class FixturesModule {}