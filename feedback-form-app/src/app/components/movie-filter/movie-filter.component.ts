import { Component, EventEmitter, Input, Output } from '@angular/core';

@Component({
  selector: 'app-movie-filter',
  templateUrl: './movie-filter.component.html',
  styleUrls: ['./movie-filter.component.css']
})
export class MovieFilterComponent {
  @Input() genres: string[] = [];
  @Output() genreSelected = new EventEmitter<string>();
}
