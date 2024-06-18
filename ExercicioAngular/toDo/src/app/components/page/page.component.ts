import {Component, OnInit} from '@angular/core';
import {Page} from "../../models/page.models";
import {PageService} from "./page.service";
import {ActivatedRoute, RouterLink} from "@angular/router";
import {FormsModule} from "@angular/forms";
import {NgForOf, NgIf} from "@angular/common";
import {MdbFormsModule} from "mdb-angular-ui-kit/forms";

@Component({
  selector: 'app-page',
  standalone: true,
  imports: [
    RouterLink,
    FormsModule,
    NgForOf,
    MdbFormsModule,
    NgIf

  ],
  templateUrl: './page.component.html',
  styleUrl: './page.component.css'
})
export class PageComponent implements OnInit {


  search:string="";
  pages: Page[] = [];

  todo:Page={
      title:"",
    description:""

  }

  constructor(private pageDetails:PageService){}


  ngOnInit(): void {

    this.getParams();
    // inicializa a funcao
  }


  getParams():void{
    this.pageDetails.getPage().subscribe((page:Page[]):void=>{
    this.pages=page
    console.log(page)


    });}


  addTodo():void{
    this.pageDetails.addTodo(this.todo).subscribe((todo:Page):void=>{
      this.getParams()
    })
  }

  deleteTodo(id:number):void{
    this.pageDetails.deleteTodo(id).subscribe((todo:Page):void =>{
      this.getParams()
    })
  }

  updateTodo(todo:Page):void{
    this.pageDetails.updateTodo(todo).subscribe((todo:Page):void =>{
      this.getParams()
    })
  }





}
