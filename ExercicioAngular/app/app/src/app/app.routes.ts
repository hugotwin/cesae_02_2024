import { Routes } from '@angular/router';
import {HomeComponent} from "./pages/home/home.component";
import {GalleryComponent} from "./pages/gallery/gallery.component";
import {ContactUsComponent} from "./pages/contact-us/contact-us.component";

export const routes: Routes = [


  {path: '', component: HomeComponent,


  },
  {path: 'gallery', component: GalleryComponent},

  {path: 'contact-us', component: ContactUsComponent},
];
