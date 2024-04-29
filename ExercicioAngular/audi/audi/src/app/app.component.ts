import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import {HeaderComponent} from "./master-page/header/header.component";
import {CarroselComponent} from "./carrosel/carrosel.component";
import {FooterComponent} from "./master-page/footer/footer.component";
import {CardComponent} from "./card/card.component";

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, HeaderComponent, CarroselComponent, FooterComponent, CardComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'audi';
}
