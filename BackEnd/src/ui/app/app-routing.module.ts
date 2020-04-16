import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { TeamComponent } from 'app/components/team/team.component';

const routes: Routes = [
	{ path: 'teams', component: TeamComponent }
	
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