import {Component, Input} from '@angular/core';

@Component({
  selector: 'app-card',
  standalone: true,
  imports: [],
  templateUrl: './card.component.html',
  styleUrl: './card.component.css'
})
export class CardComponent {
  @Input() id: number =0;
  @Input() poster: String ="";
  @Input() year: String ="";
  @Input() title: String ="";
  @Input() description: String ="";

}
