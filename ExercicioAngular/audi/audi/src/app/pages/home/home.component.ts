import {Component, Input} from '@angular/core';
import {CardComponent} from "../../card/card.component";
import {CarroselComponent} from "../../carrosel/carrosel.component";

@Component({
  selector: 'app-home',
  standalone: true,
    imports: [
        CardComponent,
        CarroselComponent
    ],
  templateUrl: './home.component.html',
  styleUrl: './home.component.css'
})
export class HomeComponent {
  title = 'audi';
  imageCardOne: string="https://fastly.picsum.photos/id/866/200/300.jpg?hmac=rcadCENKh4rD6MAp6V_ma-AyWv641M4iiOpe1RyFHeI";
  imageCardTwo: string="https://fastly.picsum.photos/id/237/200/300.jpg?hmac=TmmQSbShHz9CdQm0NkEjx1Dyh_Y984R9LpNrpvH2D_U";
  imageCardThree: string="https://fastly.picsum.photos/id/853/200/300.jpg?grayscale&hmac=Bs44G9azTX9pQyU0jMq2wLUK_0cmDKNDW_gS8BVz7vM";
  cardTextOne : string ="Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed vestibulum, ipsum nec tincidunt sollicitudin, nulla libero venenatis libero, id bibendum tortor elit et libero. Integer sit amet feugiat lorem. Sed eleifend diam eget augue bibendum, vel consectetur velit tincidunt. Sed convallis libero id diam viverra, sed lacinia ex tempus";
  cardTextTwo : string =" Vivamus commodo malesuada arcu, non mattis ligula consequat eget. Suspendisse potenti. Vivamus scelerisque justo eu ligula lacinia, nec fermentum metus consequat.  ";
  cardTextThree : string ="Curabitur consequat, nisi eget maximus placerat, urna velit ultricies justo, vel tempus nulla lectus sit amet sem. Maecenas tristique ultricies augue, at auctor mi lacinia id. Sed sed venenatis enim.";
  buttonTextCard: string="Visualizar";
  imageCat :string ="https://fastly.picsum.photos/id/40/4106/2806.jpg?hmac=MY3ra98ut044LaWPEKwZowgydHZ_rZZUuOHrc3mL5mI";


}
