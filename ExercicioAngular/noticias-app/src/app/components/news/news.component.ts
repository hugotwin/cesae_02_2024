import {Component, OnInit} from '@angular/core';
import {NgForOf, NgIf} from "@angular/common";
import {FormsModule} from "@angular/forms";
import {ActivatedRoute, Params, RouterLink} from "@angular/router";
import {Article, Root} from "../../models/news.models";
import {NewsService} from "./news.service";

@Component({
  selector: 'app-news',
  standalone: true,
  imports: [
    NgForOf,
    FormsModule,
    RouterLink,
    NgIf
  ],
  templateUrl: './news.component.html',
  styleUrl: './news.component.css'
})
export class NewsComponent  implements OnInit {
  search: string="";
  articles:Article[]=[];
  search2:string=""


  root:Root={
    status: "",
    totalResults: 0,
    articles: []

  }

  constructor(private newsService:NewsService,  private activatedRoute:ActivatedRoute) {}


  ngOnInit(): void {
      //this.getNews()
    this.getParams()


  }

  getNews() {

    this.newsService.getNews()
      .subscribe((root:Root): void =>{
    this.articles = root.articles});


  }

  getNewsSearch(search :String) {

    this.newsService.getsNewsSearch(this.search)
      .subscribe((root:Root): void =>{
        this.articles=root.articles

      });


  }



  getParams():void{

    this.activatedRoute.params.subscribe((params:Params |{search2:string}):void=>{

      this.search2 = params.search2;


      if(!this.search2){
        this.search=params.search2;
        this.getNewsSearch(this.search)
        this.search2 ="";


      }else if ( !this.search){

        this.search=params.search2;
        this.getNewsSearch(this.search)
        this.search="";


      }else{

        this.getNews()

      }



    })
  }












}
