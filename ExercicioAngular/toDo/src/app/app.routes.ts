import { Routes } from '@angular/router';
import {PageComponent} from "./components/page/page.component";

export const routes: Routes = [

  {path:'',component:PageComponent},
  {path:':id',component:PageComponent}
];
