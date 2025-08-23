# Dice Game 🎲

[VIEW WEBSITE](https://danbaz7.github.io/Dice/)

A two-player dice game inspired by the classic Pig Game, built with vanilla JavaScript, HTML, and CSS.

## Features

- **Two-Player Turn-Based Gameplay:** Players take turns rolling a die and accumulating points.
- **Hold Mechanic:** Players can "hold" to add their current score to their total and pass the turn.
- **Risk/Reward:** Rolling a 1 resets the current score and passes the turn.
- **Winning Condition:** First player to reach or exceed the winning score (default: 200) wins.
- **Game Rules Modal:** Click the "Rules" button to view the game rules in a modal window.
- **Keyboard Accessibility:** Modal can be closed with the Escape key.
- **Responsive UI:** Visual feedback for active and winning players.

## Game Logic Overview

- **State Management:**  
  Uses variables for player scores, current score, active player, and game state (`playing`).
- **Event Handling:**
  - **Roll Dice:** Generates a random number (1–6). If not 1, adds to current score; if 1, resets current score and switches player.
  - **Hold:** Adds current score to total, checks for win, and switches player if no win.
  - **New Game:** Resets all scores and UI to initial state.
  - **Rules Modal:** Opens/closes with button, overlay, or Escape key.
- **UI Updates:**  
  DOM is updated in real time for scores, current score, active player, and winner status.

## How to Play

1. Click **Roll dice** to roll the die.
2. If you roll 2–6, the number adds to your current score. If you roll a 1, your turn ends and your current score resets to 0.
3. Click **Hold** to add your current score to your total and pass the turn.
4. The first player to reach or exceed the winning score wins.
5. Click **New game** to start over.
6. Click **Rules** for a quick summary of the rules.

## Project Structure

```
Dice/
├── index.html
├── style.css
└── script.js
```

- `index.html` – Game layout and modal markup.
- `style.css` – Game and modal styling.
- `script.js` – Game logic and event handling.

---

Enjoy the game and challenge a friend!
