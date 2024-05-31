import {Component, OnInit} from '@angular/core';
import {PageService} from "./page.service";
import {MovieDetails, Rating} from "../../models/page.models";
import {FormsModule} from "@angular/forms";

@Component({
  selector: 'app-page',
  standalone: true,
  imports: [
    FormsModule
  ],
  templateUrl: './page.component.html',
  styleUrl: './page.component.css'
})
export class PageComponent implements OnInit {

  search :string  ="tt3896198"

  movie: MovieDetails ={// inicializa o objecto com os campos vazios
    Title:"",
    Year:"",
    Rated:"",
    Released:"",
    Runtime:"",
    Genre:"",
    Director:"",
    Writer:"",
    Actors:"",
    Plot:"",
    Language:"",
    Country:"",
    Awards:"",
    Poster:"",
    Ratings:[],
    Metascore:"",
    imdbRating:"",
    imdbVotes:"",
    imdbID:"",
    Type:"",
    DVD:"",
    BoxOffice:"",
    Production:"",
    Website:"",
    Response:"",


  };


  constructor(private pageDetails:PageService){}// inicializa o Page service que é o page.service.ts

  ngOnInit(): void {
   this.getPage();// inicializa a funcao
  }


getPage():void{// funcao que vai ao objecto PageDetails. que inicaliza a funcao getPage do pageDetails o subrscribe um metodo de arrys para inicializar um conjunto de arrays

    this.pageDetails.getPage(this.search).subscribe((movieDetails : MovieDetails) : void =>{// vai se buscar o search ao html

      console.log(movieDetails)
      this.movie=movieDetails

  });


}
}
