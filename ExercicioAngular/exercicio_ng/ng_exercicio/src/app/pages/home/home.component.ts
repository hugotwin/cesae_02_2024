import { Component } from '@angular/core';
import {NgForOf} from "@angular/common";
import {Card} from "../../models/card.model";
import {CardComponent} from "../card/card.component";

@Component({
  selector: 'app-home',
  standalone: true,
  imports: [
    NgForOf,
    CardComponent
  ],
  templateUrl: './home.component.html',
  styleUrl: './home.component.css'
})
export class HomeComponent {
  names:String[]=[

    'sergio',
    'maria',
    'joao',

  ]


  cards:Card[] =[

    {title:'Title1',
      description:'description1',
      image : 'https://image.freepik.com/fotos-gratis/musico-banda-cantando_102671-5234.jpg'},

    {title:'Title2',
      description:'description2',
      image : 'https://th.bing.com/th/id/R.e4d36119db120772d15566fca5b9d89d?rik=84TF50dDzxkI1A&pid=ImgRaw&r=0'}]




}
