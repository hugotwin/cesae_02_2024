import {Component, Input} from '@angular/core';

@Component({
  selector: 'app-card',
  standalone: true,
  imports: [],
  templateUrl: './card.component.html',
  styleUrl: './card.component.css'
})
export class CardComponent {
  @Input() cardText: string="";
  @Input() imageCard: string="";
  @Input() buttonTextCard: string="Botão";

}
