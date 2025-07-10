//Author: Daniel Obazee
//Date:09-29-2024
//CSSI 121 project 3

#include <iostream>
#include <limits>
using namespace std;

int main() {
    int toothPicks = 23;
    int humanPick, computerPick;
    char playAgain;

  do {
        toothPicks = 23;
        cout << "Let's play a game of \"23\"!"<<endl;
        cout<<endl; 
        while (toothPicks > 0) {
            
            // Human's turn
            
            do {
                cout << "Enter the number of stick(s) you wish to pick (1-3): ";
                cin >> humanPick;
                
                if (cin.fail()) {
                   cin.clear(); // Clear the error flag
                   cin.ignore(numeric_limits<streamsize>::max(), '\n'); // Ignore the invalid input
                   cout << "Invalid input. Please enter a valid integer(1-3).\n";
                   continue; }
            
                if (humanPick < 1 || humanPick > 3  || humanPick > toothPicks ) {
                    cout << "Wrong number of sticks. Please pick 1, 2, or 3 sticks.\n"; }
            } while (humanPick < 1 || humanPick > 3 || humanPick > toothPicks );

            toothPicks = toothPicks- humanPick;
            cout << "You picked " << humanPick << " stick(s). " << toothPicks << " left.\n";
               
            if (toothPicks == 0) {
                cout << "You picked the last stick. Sorry, the computer beat you!\n";
                break; }

            // Computer's turn
            
            if (toothPicks > 4) {
                computerPick = 4 - humanPick; } 
            else if (toothPicks >= 2 && toothPicks <= 4) {
                computerPick = toothPicks - 1; } 
            else {computerPick = 1;}

            toothPicks = toothPicks - computerPick;
            
            cout << "Computer picked " << computerPick << " stick(s). " << toothPicks << " left\n";
            cout<< "your turn." <<" ";
     
             if(toothPicks == 0){
                cout << "Computer picked the last stick. You win!\n";
            break; }
           
        }

              cout << "Do you want to play another game? <Y/N>: ";
              cin >> playAgain;
      } while (playAgain == 'Y' || playAgain == 'y');

    return 0;
}