//Author: Daniel Obazee
//Date:09-29-2024
//CSSI 121 lab 3
//This program allow users to enter a grade and
//prints out to the console the corresponding letter grade.

#include <iostream>
#include <limits>
using namespace std;

int main() {
    double grade;
    char choice;
    do {
        cout << "Enter a grade (0-100): ";
        cin >> grade;

// Check if the input is valid
        if (cin.fail()) {
            cin.clear(); 
            cin.ignore(numeric_limits<streamsize>::max(), '\n');
            cout << "Invalid input. Please enter a valid integer.\n";
            continue; 
        }


        // Validate input
        if (grade < 0 || grade > 100) {
            cout << "Invalid grade. Please enter a grade between 0 and 100." << endl;
        } else {
            // Determine letter grade
            if (grade >= 90) {
                cout << "Letter grade: A" << endl;
            } else if (grade >= 80) {
                cout << "Letter grade: B" << endl;
            } else if (grade >= 70) {
                cout << "Letter grade: C" << endl;
            } else if (grade >= 60) {
                cout << "Letter grade: D" << endl;
            } else {
                
                cout << "Letter grade: F" << endl;
            }
        }

        // Ask if user wants to enter another grade
        cout << "Do you want to enter another grade? (y/n): ";
        cin >> choice;
    } while (choice == 'y' || choice == 'Y');
    
         if(choice== 'N'   || choice== 'n'){
             cout<<"Thank you for using the grade calculator"; }
         else 
              cout<<"Invalid input good bye !";
         
         cout<<endl;
     

    return 0;
}