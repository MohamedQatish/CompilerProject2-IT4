// Test file with valid Angular component
import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [CommonModule],
  template: `
    <div class="container">
      <h1>Hello World</h1>
      <p>This is a valid component</p>
    </div>
  `,
  styles: [`
    .container {
      padding: 20px;
      border: 1px solid #ccc;
    }
  `]
})
export class AppComponent {
  title = 'My App';
  
  getMessage() {
    return 'Welcome to Angular!';
  }
}
