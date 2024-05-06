import {Component, Input} from '@angular/core';
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

  @Input() imageCard : string = "https://fastly.picsum.photos/id/49/1280/792.jpg?hmac=NnUJy0O9-pXHLmY2loqVs2pJmgw9xzuixgYOk4ALCXU";

}
