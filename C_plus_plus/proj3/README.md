# Project 3: Game of 23 (Toothpick Game)

This C++ program implements the classic "Game of 23" (also known as the toothpick game), where a human player competes against the computer. The objective is to avoid picking up the last stick.

## How It Works

- The game starts with 23 sticks (toothpicks).
- Players take turns picking up 1, 2, or 3 sticks per turn.
- The human player always goes first.
- The computer uses a simple strategy to maximize its chances of winning.
- The player who is forced to pick up the last stick loses.
- After each game, the user is prompted to play again or exit.

## Example Output

```
$ ./game_of_23
Welcome to the Game of 23!
There are 23 sticks on the table.
Take 1, 2, or 3 sticks: 2
You took 2 sticks.
23 - 2 = 21 sticks left.
Computer's turn.
Computer takes 3 sticks.
21 - 3 = 18 sticks left.
Your turn.
Take 1, 2, or 3 sticks: 3
You took 3 sticks.
18 - 3 = 15 sticks left.
Computer's turn.
Computer takes 1 stick.
15 - 1 = 14 sticks left.
Your turn.
Take 1, 2, or 3 sticks: 1
You took 1 stick.
14 - 1 = 13 sticks left.
Computer's turn.
Computer takes 2 sticks.
13 - 2 = 11 sticks left.
Your turn.
Take 1, 2, or 3 sticks: 3
You took 3 sticks.
11 - 3 = 8 sticks left.
Computer's turn.
Computer takes 1 stick.
8 - 1 = 7 sticks left.
Your turn.
Take 1, 2, or 3 sticks: 2
You took 2 sticks.
7 - 2 = 5 sticks left.
Computer's turn.
Computer takes 3 sticks.
5 - 3 = 2 sticks left.
Your turn.
Take 1, 2, or 3 sticks: 2
You took 2 sticks.
2 - 2 = 0 sticks left.
Computer's turn.
Computer takes 1 stick.
0 - 1 = -1 sticks left.
Computer loses! You win!
Play again? (y/n): n
Thanks for playing!
```

## Author

Daniel Obazee  
Date: 09-29-2024  
CSSI 121 Project 3
