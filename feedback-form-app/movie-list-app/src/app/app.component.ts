import { Component } from '@angular/core';
import { trigger, transition, style, animate } from '@angular/animations';

interface Movie {
  title: string;
  description: string;
  year: number;
}

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
  animations: [
    trigger('fadeIn', [
      transition(':enter', [
        style({ opacity: 0, transform: 'translateY(-10px)' }),
        animate('400ms ease-out', style({ opacity: 1, transform: 'translateY(0)' }))
      ]),
      transition(':leave', [
        animate('400ms ease-in', style({ opacity: 0, transform: 'translateY(10px)' }))
      ])
    ])
  ]
})
export class AppComponent {
  title = 'Movie List App';

  movies: Movie[] = [
    { title: 'Inception', description: 'A thief enters dreams to steal secrets.', year: 2010 },
    { title: 'Interstellar', description: 'Explorers travel through a wormhole in space.', year: 2014 },
    { title: 'The Dark Knight', description: 'Batman faces Joker in Gotham.', year: 2008 },
  ];

  addMovie() {
    this.movies.push({
      title: 'New Movie ' + (this.movies.length + 1),
      description: 'Auto-generated movie description.',
      year: 2025
    });
  }

  removeMovie(index: number) {
    this.movies.splice(index, 1);
  }
}
