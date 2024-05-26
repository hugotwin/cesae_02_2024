import {Component, OnInit} from '@angular/core';
import {MovieService} from "./movie.service";
import {Movie, MoviesResponse} from "../../models/movie.models";
import {NgForOf} from "@angular/common";
import {FormsModule} from "@angular/forms";

@Component({
  selector: 'app-movie',
  standalone: true,
  imports: [
    NgForOf,
    FormsModule
  ],
  templateUrl: './movie.component.html',
  styleUrl: './movie.component.css'
})
export class MovieComponent implements OnInit {

  movies: Movie[] = [];
 search :string  ="Harry"
  constructor(private movieService: MovieService) {}

  ngOnInit(): void {
    this.getMovies();
  }


  getMovies():void {

    this.movieService.getMovies(this.search)
      .subscribe((moviesResponse: MoviesResponse): void => {
      this.movies = moviesResponse.Search;


    });
  }

}
