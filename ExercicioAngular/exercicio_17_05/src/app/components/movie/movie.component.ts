import {Component, OnInit} from '@angular/core';
import {MovieService} from "./movie.service";
import {Movie, MoviesResponse} from "../../models/movie.models";
import {NgForOf} from "@angular/common";

@Component({
  selector: 'app-movie',
  standalone: true,
  imports: [
    NgForOf
  ],
  templateUrl: './movie.component.html',
  styleUrl: './movie.component.css'
})
export class MovieComponent implements OnInit {

  movies: Movie[] = [];

  constructor(private movieService: MovieService) {}

  ngOnInit(): void {
    this.getMovies();
  }


  getMovies():void {

    this.movieService.getMovies()
      .subscribe((moviesResponse: MoviesResponse): void => {
      this.movies = moviesResponse.Search;
      console.log(moviesResponse)

    });
  }

}
