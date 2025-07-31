"use strict";
// console.log(document.querySelector(".message").textContent);
// document.querySelector(".message").textContent = "🎉 Correct Number!";
// document.querySelector(".number").textContent = 13;
// document.querySelector(".score").textContent = 10;
// document.querySelector(".guess").value = 23;
// console.log(document.querySelector(".guess").value);

let secretNumber = Math.ceil(Math.random() * 20);
let score = 6;
let highscore = 0;
let wrongG = 0;

// function wrongGuess(guess) {
//   if (guess !== secretNumber) {
//     wrongG++;
//     document.querySelector(".wrongG").textContent = wrongG;
//   }
// }

document.querySelector(".check").addEventListener("click", function () {
  const guess = Number(document.querySelector(".guess").value);
  console.log(guess, typeof guess);
  if (guess > 20 || guess < 1) {
    document.querySelector(".message").textContent =
      "⛔️ Hint: Number must be between 1 and 20!";
    document.querySelector(".number").textContent = "?";
    document.querySelector(".score").textContent = score;
    document.querySelector(".wrongG").textContent = wrongG;
  } else if (!guess) {
    document.querySelector(".message").textContent = "⛔️ Hint: No number!";
    document.querySelector(".number").textContent = "?";
    document.querySelector(".score").textContent = score;
    document.querySelector(".wrongG").textContent = wrongG;
  } else if (guess === secretNumber) {
    if (score > 0) {
      score--;
      document.querySelector(".score").textContent = score;
      document.querySelector(".number").textContent = "?";
    } else {
      document.querySelector(".message").textContent = "💥 Game Over!";
    }
    document.querySelector(".message").textContent = "🎉 WOW!: Correct Number!";
    document.querySelector("body").style.backgroundColor = "#60b347";
    document.querySelector(".number").style.width = "30rem";
    highscore++;
    document.querySelector(".highscore").textContent = highscore;
    document.querySelector(".score").textContent = score;
    document.querySelector(".wrongG").textContent = wrongG;
    // document.querySelector(".number").textContent = secretNumber;

    // Generate a new secret number for the next round
    secretNumber = Math.ceil(Math.random() * 20);

    document.querySelector(".highscore").textContent = highscore;
  } else if (guess > secretNumber) {
    if (score > 1) {
      score--;
      document.querySelector(".score").textContent = score;
      wrongG++;
      document.querySelector(".wrongG").textContent = wrongG;
      // document.querySelector(".number").textContent = "?";
      document.querySelector(".message").textContent = "📈 Hint: Too high!";
    } else if (score < 1) {
      document.querySelector(".message").textContent = "💥 Game Over!";
      document.querySelector(".number").textContent = secretNumber;
    }
    document.querySelector(".score").textContent = 0;
    wrongG++;
    document.querySelector(".wrongG").textContent = wrongG;

    document.querySelector(".wrongG").textContent = wrongG;
  } else if (guess < secretNumber) {
    if (score >= 1) {
      score--;
      document.querySelector(".score").textContent = score;
      wrongG++;
      document.querySelector(".wrongG").textContent = wrongG;
      document.querySelector(".message").textContent = "📉 Hint: Too low!";
      // document.querySelector(".message").textContent = "💥 Game Over!";
    } else if (score < 1) {
      document.querySelector(".message").textContent = "💥 Game Over!";
      document.querySelector(".number").textContent = secretNumber;
      document.querySelector(".score").textContent = 0;
      document.querySelector(".wrongG").textContent = wrongG;
      document.querySelector(".score").textContent = score;
    }
    // document.querySelector(".number").textContent = "?";
  }
});
