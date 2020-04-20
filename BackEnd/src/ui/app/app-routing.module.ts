import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { TeamComponent } from 'app/components/team/team.component';
import { PlayerComponent } from 'app/components/player/player.component';
import { RankingComponent } from 'app/components/ranking/ranking.component';

const routes: Routes = [
	{ path: 'teams', component: TeamComponent },
	{ path: 'players', component: PlayerComponent },
	{ path: 'rankings', component: RankingComponent }
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