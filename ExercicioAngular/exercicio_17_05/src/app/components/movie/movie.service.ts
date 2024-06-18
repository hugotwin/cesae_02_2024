import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import { MoviesResponse } from "../../models/movie.models";

@Injectable({
  providedIn: 'root'
})


export class MovieService {
  private apiKey: string='d11e823b'
  private domain:string = 'http://omdbapi.com'

  constructor(private http:HttpClient) { } //construtor com a biblioteca HttpClient


  getMovies(search :string):Observable<MoviesResponse>{ // funcao com
    return this.http.get<MoviesResponse>(`${this.domain}/?apikey=${this.apiKey}&s=${search}`)

  }
}
