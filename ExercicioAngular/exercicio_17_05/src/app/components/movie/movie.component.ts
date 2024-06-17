import {Component, OnInit} from '@angular/core';
import {MovieService} from "./movie.service";
import {Movie, MoviesResponse} from "../../models/movie.models";
import {NgForOf} from "@angular/common";
import {FormsModule} from "@angular/forms";
import {RouterLink} from "@angular/router";

@Component({
  selector: 'app-movie',
  standalone: true,
  imports: [
    NgForOf,
    FormsModule,
    RouterLink
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


  getArticleByTitle(title: string): void {
    this.newsService.getNews().subscribe((root: Root) => {
      this.article = root.articles.find(article => article.title === title);
    });
  }
}
