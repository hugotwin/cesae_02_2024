import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {MoviesResponse} from "../../models/movie.models";
import {MovieDetails} from "../../models/page.models";

@Injectable({
  providedIn: 'root'
})
export class PageService {

private apiKey: string='d11e823b'
private domain:string = 'http://omdbapi.com'

constructor(private http:HttpClient) { } //construtor com a biblioteca HttpClient


getPage(id :string):Observable<MovieDetails>{ // funcao com
  return this.http.get<MovieDetails>(`${this.domain}/?apikey=${this.apiKey}&i=${id}`)

}
}
