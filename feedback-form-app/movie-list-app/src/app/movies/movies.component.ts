import { Component } from '@angular/core';

interface Movie {
  title: string;
  genre: string;
  description: string;
  imageUrl: string;
  rating: number;
}

@Component({
  selector: 'app-movies',
  templateUrl: './movies.component.html',
  styleUrls: ['./movies.component.css']
})
export class MoviesComponent {
  movies: Movie[] = [
    {
      title: 'sitaramam',
      genre: 'Love',
      description: `Sita Ramam is a 2022 Telugu-language romantic drama that 
      follows two intersecting love stories across different time periods.`,
      imageUrl: 'https://upload.wikimedia.org/wikipedia/en/6/6a/Sita_Ramam.jpg',
      rating: 4
    },
    {
      title: 'Ala Vaikunthapurramuloo',
      genre: 'Action Drama',
      description: `A young man is unknowingly switched at birth and raised in a middle-class family.`,
      imageUrl: 'https://upload.wikimedia.org/wikipedia/en/f/f2/Ala_Vaikunthapurramuloo.jpg',
      rating: 5
    },
    {
      title: 'Pushpa: The Rise',
      genre: 'Action Thriller',
      description: `A laborer named Pushpa Raj rises through the ranks of a red sandalwood syndicate.`,
      imageUrl: 'https://upload.wikimedia.org/wikipedia/en/d/d2/Pushpa_The_Rise.jpg',
      rating: 5
    },
    {
      title: 'Sarrainodu',
      genre: 'Action',
      description: `Gana is a hot-headed young man who often fights against injustice.`,
      imageUrl: 'https://upload.wikimedia.org/wikipedia/en/9/99/Sarrainodu.jpg',
      rating: 3
    }
  ];

  getHearts(rating: number): string[] {
    return Array(5).fill('').map((_, i) => (i < rating ? '❤️' : '🖤'));
  }
}
