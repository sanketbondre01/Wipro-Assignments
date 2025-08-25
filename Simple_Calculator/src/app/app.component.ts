import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';   // 👈 Import here

@Component({
  selector: 'app-root',
  standalone: true,          // 👈 Standalone mode
  imports: [FormsModule],    // 👈 Add FormsModule here
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  number1: any = 0;
  number2: any = 0;
  calculate: number = 0;

  add() {
    this.calculate = Number(this.number1) + Number(this.number2);
  }

  sub() {
    this.calculate = Number(this.number1) - Number(this.number2);
  }

  mul() {
    this.calculate = Number(this.number1) * Number(this.number2);
  }

  division() {
    if (this.number2 != 0) {
      this.calculate = Number(this.number1) / Number(this.number2);
    } else {
      alert("Division by zero is not allowed!");
    }
  }
}
