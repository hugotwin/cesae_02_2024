import { Routes } from '@angular/router';
import {NewsComponent} from "./components/news/news.component";
import {NewComponent} from "./components/new/new.component";

export const routes: Routes = [

  {path:'',component:NewsComponent},
  { path: 'new/:title', component: NewComponent },
  { path: 'news/:search2', component: NewsComponent },
];
