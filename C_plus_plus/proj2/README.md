# Project 2: BMR (Basal Metabolic Rate) Calculator

This C++ program calculates a person's Basal Metabolic Rate (BMR), which is the number of calories required to maintain their current weight. It also estimates how many 230-calorie chocolate bars would provide the same amount of energy.

## How It Works

- The user is prompted to enter their gender (M or F), weight (in pounds), height (in inches), and age (in years).
- The program calculates BMR using the Harris-Benedict equation:
  - **For males:** `BMR = 66 + (6.3 × weight) + (12.9 × height) - (6.8 × age)`
  - **For females:** `BMR = 655 + (4.3 × weight) + (4.7 × height) - (4.7 × age)`
- The program then divides the BMR by 230 (the calories in a standard chocolate bar) to estimate how many chocolate bars would provide the same calories.
- The user can repeat the calculation or exit the program.

## Author

Daniel Obazee  
Date: 09-15-2024  
CSSI 121 Project 2
