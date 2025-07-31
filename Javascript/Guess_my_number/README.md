# Guess My Number 🎲

A 90's retro-inspired browser game built with JavaScript, HTML, and CSS.

## Logic and Implementation

This project demonstrates interactive DOM manipulation and game logic in vanilla JavaScript, wrapped in a retro arcade aesthetic.

### Core Logic

- **Random Number Generation:**  
  At the start and after each correct guess, the program generates a new secret number between 1 and 20 using `Math.floor(Math.random() * 20) + 1`.

- **State Management:**  
  The game tracks `score`, `highscore`, and the current `secretNumber`. The score decreases with each guess, and the highscore increments on each win.

- **Event Handling:**  
  The main game loop is triggered by a click event on the "Check!" button. The user's input is read, validated, and compared to the secret number.

- **Feedback and UI Updates:**

  - If the input is empty, a warning message is displayed.
  - If the guess is correct, a congratulatory message appears, the background color changes, and a new secret number is generated without resetting the score.
  - If the guess is incorrect, the program provides a "Too high!" or "Too low!" hint, decrements the score, and updates the UI.
  - When the score reaches zero, the game reveals the secret number and ends the round.

- **Continuous Play:**  
  The game is designed for continuous rounds: after a correct guess, a new number is generated and the player can keep playing until the score runs out.

- **Reset Mechanism:**  
  The "Again!" button resets the game state and UI, allowing for repeated play sessions.

### Code Highlights

- **Separation of Concerns:**  
  UI updates are handled by dedicated functions (e.g., `displayMessage`), keeping logic and presentation cleanly separated.

- **Dynamic DOM Manipulation:**  
  All feedback, score, and style changes are performed via JavaScript, demonstrating real-time interactivity.

- **Retro Styling:**  
  The CSS and feedback messages are crafted to evoke a classic arcade feel, enhancing the user experience.

---

This project is a concise example of how to combine JavaScript logic, DOM manipulation, and creative design to build an engaging browser game.
