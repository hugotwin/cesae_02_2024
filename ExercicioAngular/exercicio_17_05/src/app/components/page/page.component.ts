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

  movie: MovieDetails ={
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


  constructor(private pageDetails:PageService){}

  ngOnInit(): void {
   this.getPage();
  }


getPage():void{

    this.pageDetails.getPage(this.search).subscribe((movieDetails : MovieDetails) : void =>{

      console.log(movieDetails)
      this.movie=movieDetails

  });


}
}
