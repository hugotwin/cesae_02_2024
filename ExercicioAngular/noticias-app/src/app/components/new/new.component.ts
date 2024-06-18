import {Component, OnInit} from '@angular/core';
import {Article, Root, Source} from "../../models/news.models";
import {NewsService} from "../news/news.service";
import {FormsModule} from "@angular/forms";
import {SOURCE} from "@angular/compiler-cli";
import {NgForOf, NgIf, NgOptimizedImage} from "@angular/common";
import {ActivatedRoute, Params, RouterLink} from "@angular/router";
import * as timers from "node:timers";

@Component({
  selector: 'app-new',
  standalone: true,
  imports: [
    FormsModule,
    NgForOf,
    NgIf,
    RouterLink,
    NgOptimizedImage
  ],
  templateUrl: './new.component.html',
  styleUrl: './new.component.css'
})
export class NewComponent implements OnInit {

  title: string ="";

  article: any  = {
    Source: {},
    author: "",
    title: "",
    description: "",
    url: "",
    urlToImage: "",
    publishedAt: "",
    content: ""

  };


  root:Root={
    status: "",
    totalResults: 0,
    articles: []

  }
  articless:Article[]=[];
  search2:string | null | undefined ="";



  constructor(private newsService:NewsService, private activatedRoute:ActivatedRoute) {}


  ngOnInit(): void {

    this.getParams()

  }

  getNews() {

    this.newsService.getNews()
      .subscribe((root:Root): void =>{
        this.articless = root.articles

      });


  }

  getParams():void{

    this.activatedRoute.params.subscribe((params:Params |{title:string}):void=>{
      this.title=params.title;

     this.getArticleByTitle(this.title)


    })
  }


  getNewsSearch(search :String) {

    this.newsService.getsNewsSearch(search)
      .subscribe((root:Root): void =>{
        this.articless=root.articles

      });}

  getArticleByTitle(title: string): void {

    this.newsService.getsNewsSearch(title)
      .subscribe((root:Root): void => {
        this.articless = root.articles

        for (let article  of this.articless ) {
          if (article.title==title) {
            this.article=article;

            break;

          }}});



      }




}
