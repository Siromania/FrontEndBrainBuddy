import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AccueilComponent } from './components/accueil/accueil.component';
import { MonkeyTestTutorielComponent } from './components/monkey-test-tutoriel/monkey-test-tutoriel.component';
import { ConnexionComponent } from './components/connexion/connexion.component';
import { ProfileComponent } from './components/profile/profile.component';
import { DonneepersoComponent } from './components/donneeperso/donneeperso.component';
import { HistoriqueComponent } from './components/historique/historique.component';
import { TrophesComponent } from './components/trophes/trophes.component';
import { LeaderboardComponent } from './components/leaderboard/leaderboard.component';

const routes: Routes = [
  {
    path: "",
    component: AccueilComponent
  },
  {
    path: "app-monkey-test-tutoriel",
    component: MonkeyTestTutorielComponent
  },
  {
    path: "connexion",
    component: ConnexionComponent
  },
  {
    path: "leaderboard",
    component: LeaderboardComponent
  },
  {
    path: "profile",
    component: ProfileComponent,
    children: [
      {path: "donneeperso", component: DonneepersoComponent},
      {path: "historique", component: HistoriqueComponent},
      {path: "trophes", component: TrophesComponent},
    ]
  }
 
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
