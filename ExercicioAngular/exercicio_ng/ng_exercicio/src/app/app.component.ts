import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import {Card} from "./models/card.model";



@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'ng_exercicio';

cards:Card[] =[

  {title:'Title1',
  description:'description1',
  image : 'https://image.freepik.com/fotos-gratis/musico-banda-cantando_102671-5234.jpg'},

  {title:'Title2',
    description:'description2',
    image : 'https://th.bing.com/th/id/R.e4d36119db120772d15566fca5b9d89d?rik=84TF50dDzxkI1A&pid=ImgRaw&r=0'}


]



}
