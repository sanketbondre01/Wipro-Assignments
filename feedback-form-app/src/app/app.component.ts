import { Component } from '@angular/core';
import { FeedbackFormComponent } from './feedback-form/feedback-form.component'; // ✅ Import your form component

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [FeedbackFormComponent], // ✅ Add here
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Feedback Form App';
}
