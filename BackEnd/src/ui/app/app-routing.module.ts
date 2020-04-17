import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { TeamComponent } from 'app/components/team/team.component';
import { PlayerComponent } from 'app/components/player/player.component';

const routes: Routes = [
	{ path: 'teams', component: TeamComponent }
	{ path: 'players', component: PlayerComponent }
]

@NgModule( {
  imports: [
    RouterModule.forRoot(routes)
  ],
  exports: [
    RouterModule
  ],
} )
export class AppRoutingModule {}