import { Routes } from '@angular/router';
import {MovieComponent} from "./components/movie/movie.component";
import {PageComponent} from "./components/page/page.component";

export const routes: Routes = [

  {path:'',component:MovieComponent,},
  {path:'movie/:id',component:PageComponent,},
  {path:'page',component:PageComponent,}
];
