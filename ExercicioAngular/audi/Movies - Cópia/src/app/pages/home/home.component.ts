import { Component } from '@angular/core';
import {Movie} from "../../models/card.model";
import {CardComponent} from "../card/card.component";
import {NgForOf} from "@angular/common";

@Component({
  selector: 'app-home',
  standalone: true,
  imports: [
    CardComponent,
    NgForOf
  ],
  templateUrl: './home.component.html',
  styleUrl: './home.component.css'
})
export class HomeComponent {

  movies:Movie[]=[
    {
      id: 1,
      year: '2020',
      title: 'Tenet',
      description: 'Armed with only one word—Tenet—and fighting for the survival of the entire world, the Protagonist journeys through a twilight world of international espionage on a mission that will unfold in something beyond real time.',
      poster: 'https://image.tmdb.org/t/p/w500/k68nPLbIST6NP96JmTxmZijEvCA.jpg',
    },
    {
      id: 2,
      year: '1994',
      title: 'The Shawshank Redemption',
      description: 'Two imprisoned men bond over a number of years, finding solace and eventual redemption through acts of common decency.',
      poster: 'https://th.bing.com/th/id/OIP.yobjBRMMdekQvZwGHeebKgHaLH?rs=1&pid=ImgDetMain',
    },
    {
      id: 3,
      year: '1972',
      title: 'The Godfather',
      description: 'An organized crime dynasty s aging patriarch transfers control of his clandestine empire to his reluctant son.',
      poster: 'https://th.bing.com/th/id/R.ff97f12dccd97be3ab7fbeb36cf51648?rik=o8%2bTPLPgi%2fjr2Q&pid=ImgRaw&r=0'
    },
    {
      id: 4,
      year: '2008',
      title: 'The Dark Knight',
      description: 'When the menace known as the Joker wreaks havoc and chaos on the people of Gotham, Batman must accept one of the greatest psychological and physical tests of his ability to fight injustice.',
      poster: 'https://image.tmdb.org/t/p/w500/1hRoyzDtpgMU7Dz4JF22RANzQO7.jpg'
    },
    {
      id: 5,
      year: '1999',
      title: 'Fight Club',
      description: 'An insomniac office worker and a devil-may-care soapmaker form an underground fight club that evolves into something much, much more.',
      poster: 'https://th.bing.com/th/id/OIP.GGzj_iHbeurTqIEcNGIEdwAAAA?rs=1&pid=ImgDetMain'
    },
    {
      id: 6,
      year: '2014',
      title: 'Interstellar',
      description: 'A team of explorers travel through a wormhole in space in an attempt to ensure humanity\'s survival.',
      poster: 'https://th.bing.com/th/id/OIP.uiaj_IMaC7h3NoieAhcmVwHaLG?rs=1&pid=ImgDetMain',
    },
    {
      id: 7,
      year: '2001',
      title: 'The Lord of the Rings: The Fellowship of the Ring',
      description: 'A meek Hobbit from the Shire and eight companions set out on a journey to destroy the powerful One Ring and save Middle-earth from the Dark Lord Sauron.',
      poster: 'https://image.tmdb.org/t/p/w500/56zTpe2xvaA4alU51sRWPoKPYZy.jpg'
    },
    {
      id: 8,
      year: '1994',
      title: 'Pulp Fiction',
      description: 'The lives of two mob hitmen, a boxer, a gangster and his wife, and a pair of diner bandits intertwine in four tales of violence and redemption.',
      poster: 'https://th.bing.com/th/id/OIP.wrDo_CaDwBgyE0R3yW6m2AHaLH?rs=1&pid=ImgDetMain'
    },
    {
      id: 9,
      year: '1985',
      title: 'Back to the Future',
      description: 'Marty McFly, a 17-year-old high school student, is accidentally sent thirty years into the past in a time-traveling DeLorean invented by his close friend, the eccentric scientist Doc Brown.',
      poster: 'https://th.bing.com/th/id/OIP.63zF4rVnbNmcnDvm5GQKzwHaLH?rs=1&pid=ImgDetMain',
    },
    {
      id: 10,
      year: '1977',
      title: 'Star Wars: Episode IV - A New Hope',
      description: 'Luke Skywalker joins forces with a Jedi Knight, a cocky pilot, a Wookiee and two droids to save the galaxy from the Empire\'s world-destroying battle station, while also attempting to rescue Princess Leia from the mysterious Darth Vader.',
      poster: 'https://image.tmdb.org/t/p/w500/6FfCtAuVAW8XJjZ7eWeLibRLWTw.jpg'
    }
  ]



}
