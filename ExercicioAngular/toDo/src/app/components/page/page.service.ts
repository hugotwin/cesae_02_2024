import { Injectable } from '@angular/core';
import {Page} from "../../models/page.models";
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class PageService {


  private domain:string = 'http://cesae-mysql-todo-env.eba-ni3shkdd.eu-north-1.elasticbeanstalk.com'
  constructor(private http:HttpClient) { } //construtor com a biblioteca HttpClient


  getPage():Observable<Page[]>{ // funcao com
    return this.http.get<Page[]>(`${this.domain}/todos`)


  }

  addTodo(todo:Page):Observable<Page>{
    return this.http.post<Page>(`${this.domain}/todos`, todo)

  }

  deleteTodo(id: number): Observable<Page> {
    return this.http.delete<Page>(`${this.domain}/todos/${id}`);
  }

 updateTodo(page: Page): Observable<Page> {
    return this.http.patch<Page>(`${this.domain}/todos/${page.id}`, page);
  }





}