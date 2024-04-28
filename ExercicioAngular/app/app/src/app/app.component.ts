import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import {CardComponent} from "./card/card.component";
import {FooterComponent} from "./master-page/footer/footer.component";
import {HeaderComponent} from "./master-page/header/header.component";

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, CardComponent, FooterComponent, HeaderComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title :string = 'app';
  name : String ='Hugo Maia';


}
