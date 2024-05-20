import {Component, OnInit} from '@angular/core';
import { RouterOutlet } from '@angular/router';
import {HeaderComponent} from "./master-page/header/header.component";
import {FooterComponent} from "./master-page/footer/footer.component";
import {NgForOf} from "@angular/common";
import {CardService} from "./card.service";

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, HeaderComponent, FooterComponent, NgForOf],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent  implements OnInit{
  title = 'exercicio_17_05';
 cards:string[]=[]


  constructor(private cardService:CardService) {
   console.log('constructor')
  }
  ngOnInit(): void {
    console.log('ngOnInit')
    this.cards=this.cardService.getCards()
  }

  addCard():void{

    this.cards.push(String(this.cards.length+1))
  }



}
