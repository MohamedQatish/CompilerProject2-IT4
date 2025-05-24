// Test file with semantic errors
import { Component } from '@angular/core';

// Undefined variable usage
let x = y + 5;

// Duplicate variable declaration
let counter = 0;
let counter = 10;

// Function with duplicate parameter names
export function calculate(a, b, a) {
  return a + b;
}

// Using undeclared function
calculateTotal();

// Component with missing required attributes
@Component({
  // Missing selector
  template: `<div>Hello World</div>`
})
export class TestComponent {
  // Property access on undefined object
  this.value = 10;
  
  // Mismatched HTML tags
  template: `
    <div>
      <h1>Title</h1>
    </span>
  `
}
// Exporting undefined identifier
export { NonExistentClass };
