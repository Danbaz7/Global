# Modal Component

A simple, reusable modal implementation using vanilla JavaScript, HTML, and CSS. This project demonstrates a popular technique for creating accessible and interactive modal dialogs in web applications.

## Features

- **Open/Close Modal:**  
  The modal can be opened by clicking any button with the `.show-modal` class and closed by clicking the close button, the overlay, or pressing the Escape key.

- **Separation of Concerns:**  
  The logic for opening and closing the modal is encapsulated in dedicated functions (`openModal` and `closeModal`), making the code easy to read and maintain.

- **Event Handling:**  
  Event listeners are attached to all modal triggers, the close button, the overlay, and the document for keyboard accessibility.

- **Accessibility:**  
  The modal can be closed with the Escape key, improving usability for keyboard users.

## Code Structure

- **script.js:**  
  Handles all modal logic, including DOM selection, event binding, and state management.

- **index.html:**  
  Contains the modal markup, overlay, and trigger buttons.

- **style.css:**  
  Provides basic styling for the modal, overlay, and transitions.

## How It Works

1. **Opening the Modal:**

   - Clicking any element with the `.show-modal` class removes the `hidden` class from the modal and overlay, making them visible.

2. **Closing the Modal:**

   - Clicking the close button or overlay, or pressing the Escape key, adds the `hidden` class back, hiding the modal and overlay.

3. **Keyboard Support:**
   - The Escape key is detected via a `keydown` event listener on the document, ensuring the modal can be dismissed without a mouse.

This modal pattern is widely used in modern web development for alerts, dialogs, forms, and more. The code is organized for clarity and easy integration into other projects.
