import { Component } from '@angular/core';
import {MdbFormsModule} from "mdb-angular-ui-kit/forms";

@Component({
  selector: 'app-contact-us',
  standalone: true,
  imports: [
    MdbFormsModule
  ],
  templateUrl: './contact-us.component.html',
  styleUrl: './contact-us.component.css'
})
export class ContactUsComponent {

}
