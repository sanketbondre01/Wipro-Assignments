import { Injectable } from '@angular/core';
import { Movie } from '../models/movie.model';

@Injectable({
  providedIn: 'root',
})
export class MovieService {
  private movies: Movie[] = [
    {
      title: 'Inception',
      genre: 'Sci-Fi',
      rating: 5,
      description: 'A mind-bending thriller by Christopher Nolan.',
      posterUrl: 'https://via.placeholder.com/150',
    },
    {
      title: 'Interstellar',
      genre: 'Sci-Fi',
      rating: 4,
      description: 'Journey through space and time.',
      posterUrl: 'https://via.placeholder.com/150',
    },
    {
      title: 'The Godfather',
      genre: 'Crime',
      rating: 5,
      description: 'Classic mafia movie.',
      posterUrl: 'https://via.placeholder.com/150',
    },
    {
      title: 'The Hangover',
      genre: 'Comedy',
      rating: 3,
      description: 'A bachelor party goes wrong.',
      posterUrl: 'https://via.placeholder.com/150',
    },
  ];

  getMovies(): Movie[] {
    return this.movies;
  }

  getGenres(): string[] {
    return ['All', ...new Set(this.movies.map(m => m.genre))];
  }
}
