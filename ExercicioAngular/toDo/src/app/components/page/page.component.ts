import {Component, OnInit} from '@angular/core';
import {Page} from "../../models/page.models";
import {PageService} from "./page.service";
import {ActivatedRoute, RouterLink} from "@angular/router";
import {FormsModule} from "@angular/forms";
import {NgForOf} from "@angular/common";

@Component({
  selector: 'app-page',
  standalone: true,
  imports: [
    RouterLink,
    FormsModule,
    NgForOf

  ],
  templateUrl: './page.component.html',
  styleUrl: './page.component.css'
})
export class PageComponent implements OnInit {


  search:string="";
  pages: Page[] = [];

  constructor(private pageDetails:PageService){}


  ngOnInit(): void {

    this.getParams();
    // inicializa a funcao
  }


  getParams():void{
    this.pageDetails.getPage().subscribe((page:Page[]):void=>{
      console.log(page)
    this.pages=page


    });}

}
