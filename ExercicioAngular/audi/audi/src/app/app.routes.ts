import { Routes } from '@angular/router';
import {HomeComponent} from "./pages/home/home.component";
import {ContactUsComponent} from "./pages/contact-us/contact-us.component";
import {GalleryComponent} from "./pages/gallery/gallery.component";
import {BlogComponent} from "./pages/blog/blog.component";


export const routes: Routes = [
  { path:"",component:HomeComponent},
  { path:"contact-us",component:ContactUsComponent},
  {path:"gallery", component:GalleryComponent},
  {path:"blog", component:BlogComponent},
];
