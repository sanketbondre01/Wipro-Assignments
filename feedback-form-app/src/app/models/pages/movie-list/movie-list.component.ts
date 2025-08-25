// movie-list.component.ts
import { Component } from '@angular/core';
import { Movie } from './movie.model';

@Component({
  selector: 'app-movie-list',
  templateUrl: './movie-list.component.html',
  styleUrls: ['./movie-list.component.css']
})
export class MovieListComponent {
  averageRating = 4.0;

  movies: Movie[] = [
    {
      title: 'Inception',
      genre: 'Action',
      description: 'A mind-bending thriller by Christopher Nolan.',
      rating: 4,
      poster: 'assets/inception.jpg'
    },
    {
      title: 'Sita Ramam',
      genre: 'Drama',
      description: 'A love story between soldier and princess.',
      rating: 5,
      poster: 'assets/sitaramam.jpg'
    },
    {
      title: 'Su from So',
      genre: 'Comedy',
      description: 'A Horror-Comedy movie with young man.',
      rating: 3,
      poster: 'assets/sufromso.jpg'
    },
    {
      title: 'Aatma',
      genre: 'Horror',
      description: 'Terrifying supernatural family horror.',
      rating: 3,
      poster: 'assets/aatma.jpg'
    },
    {
      title: 'Kirik Party',
      genre: 'Comedy & Love',
      description: 'College Campus, Friends and Love Story.',
      rating: 4,
      poster: 'assets/kirikparty.jpg'
    }
  ];
}
