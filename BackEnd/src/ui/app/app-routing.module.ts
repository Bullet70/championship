import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { TeamComponent } from 'app/components/team/team.component';
import { PlayerComponent } from 'app/components/player/player.component';
import { RankingComponent } from 'app/components/ranking/ranking.component';
import { ChampionshipComponent } from 'app/components/championship/championship.component';
import { InformationchampionshipComponent } from 'app/components/championship/informationchampionship.component';
import { RankinggoalComponent } from 'app/components/ranking/rankinggoal.component';
import { FixturesComponent } from 'app/components/fixtures/fixtures.component';

const routes: Routes = [
	{ path: 'teams', component: TeamComponent },
	{ path: 'players', component: PlayerComponent },
	{ path: 'rankings', component: RankingComponent },
	{ path: 'championships', component: ChampionshipComponent },
	{ path: 'informationchampionships', component: InformationchampionshipComponent },
	{ path: 'rankinggoals', component: RankinggoalComponent },
	{ path: 'fixtures', component: FixturesComponent},
	
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