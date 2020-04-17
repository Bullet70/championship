import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { ButtonModule } from 'primeng/button';
import { TableModule } from 'primeng/table';
import { PlayerRoutingModule } from './player-routing.module';
import { PlayerComponent } from 'app/components/player/player.component';

@NgModule({
  declarations: [
		PlayerComponent
  ],
  imports: [
    CommonModule,
    FormsModule,
		TableModule,
		ButtonModule,
		PlayerRoutingModule
  ],
	exports: [
		PlayerRoutingModule
	],
  providers: [

	]
})
export class PlayerModule {}