import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Root} from "../../models/news.models";
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class NewsService {

  private domain: string='https://newsapi.org/v2/top-headlines?country=us&apiKey=bed8345567814a1c829102b65ee4d276'
  private dateMinusFiveDays: string;

  constructor(private http: HttpClient) {
    this.dateMinusFiveDays = this.calculateDateMinusDays(5);
  }

  private calculateDateMinusDays(days: number): string {
    const date = new Date();
    date.setDate(date.getDate() - days);
    return date.toISOString().split('T')[0]; // Formata a data como YYYY-MM-DD
  }

  getNews():Observable<Root>{ // funcao com
    return this.http.get<Root>(this.domain)

  }

  getsNewsSearch(search:String):Observable<Root>{

    return this.http.get<Root>(`https://newsapi.org/v2/everything?q=${search}&${this.dateMinusFiveDays}&sortBy=popularity&apiKey=bed8345567814a1c829102b65ee4d276`)
  }


}
