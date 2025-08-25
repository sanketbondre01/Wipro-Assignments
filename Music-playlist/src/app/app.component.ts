import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { MatCardModule } from '@angular/material/card';
import { MatButtonModule } from '@angular/material/button';
import { MatIconModule } from '@angular/material/icon';
import { MatChipsModule } from '@angular/material/chips';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { trigger, transition, style, animate } from '@angular/animations';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [CommonModule, MatCardModule, MatButtonModule, MatIconModule, MatChipsModule],
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
  animations: [
    trigger('cardAnim', [
      transition(':enter', [
        style({ opacity: 0, transform: 'translateY(30px)' }),
        animate('600ms ease-out', style({ opacity: 1, transform: 'translateY(0)' }))
      ])
    ])
  ]
})
export class AppComponent {
  title = 'Music Playlist';

  songs = [
  {
    name: 'All the Stars.',
    artist: 'Kendrick Lamar',
    album: 'DAMN.',
    duration: '5:12',
    rating: 5,
    image: 'https://source.boomplaymusic.com/group10/M00/08/31/280050077e8341cfa908db803a069938_464_464.jpg'
  },
    {
    name: 'God\'s Plan',
    artist: 'Drake',
    album: 'Scorpion',
    duration: '3:18',
    rating: 5,
    image: 'https://upload.wikimedia.org/wikipedia/en/9/90/Scorpion_by_Drake.jpg'
    },
    {
    name: 'HUMBLE.',
    artist: 'Kendrick Lamar',
    album: 'DAMN.',
    duration: '2:57',
    rating: 5,
    image: 'https://upload.wikimedia.org/wikipedia/en/5/51/Kendrick_Lamar_-_Damn.png'
    },
    {
    name: 'Cant tell me nothing',
    artist: 'Kanye West',
    album: 'The Great Gatsby (soundtrack)',
    duration: '3:56',
    rating: 5,
    image: 'https://i1.sndcdn.com/artworks-ei9U5OweZX6QeULy-dj12ow-t500x500.jpg'
  },
    {
    name: 'timeless',
    artist: 'The Weeknd, Playboi Carti',
    album: 'Starboy',
    duration: '3:00',
    rating: 5,
    image: 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTGTp8az70KDYF9gSur0ypHpk5Pm8mGKAVpyA&s'
  }
  ];
}