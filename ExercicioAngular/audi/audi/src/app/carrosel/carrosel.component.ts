import { Component } from '@angular/core';
import {MdbCarouselModule} from "mdb-angular-ui-kit/carousel";

@Component({
  selector: 'app-carrosel',
  standalone: true,
  imports: [
    MdbCarouselModule
  ],
  templateUrl: './carrosel.component.html',
  styleUrl: './carrosel.component.css'
})
export class CarroselComponent {

}
