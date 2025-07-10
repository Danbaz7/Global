//Author: Daniel Obazee
//Date:11-17-2024
//CSSI 121 LAB 7
#include <iostream>
#include <iomanip>
using namespace std;

// Function to allow users to enter students' scores
void userInput(int arr[], int size);
// pre-condition: The array `arr` has an actual size that is greater than or equal to `size`
// post-condition: `arr[0]` to `arr[size-1]` are filled with values entered from the keyboard

// Function to return the corresponding grade letter
char grade(int score);
// pre-condition: `score` is a valid integer representing a student's score
// post-condition: Returns the corresponding grade letter ('A', 'B', 'C', 'D', or 'F') based on the value of `score`

int main() {
    const int size = 5;
    int scores[size];

    // Call userInput function to get scores
    userInput(scores, size);

    // Print the formatted output
    cout << "-----------|-------|-------" << endl;
    cout << "| Student  | Score | Grade |" << endl;
    cout << "-----------|-------|-------" << endl;
    for (int i = 1; i <= size; i++) {
    cout.setf(ios::left);
    cout << "| " 
         << setw(8) << (i) << " | "
         << setw(5) << scores[i-1] << " | " 
         << setw(5) << grade(scores[i-1]) << " |" 
         << endl;
    }
    cout << "-----------|-------|-------" << endl;

    return 0;
}

// Function to allow users to enter students' scores
void userInput(int arr[], int size) {
    cout << "Enter the class scores for " << size << " students:" << endl;
    for (int i = 1; i <= size; i++) {
        cin >> arr[i-1];
    }
}

// Function to return the corresponding grade letter
char grade(int score) {
    
    if (score >= 90) return 'A';
    else if (score >= 80) return 'B';
    else if (score >= 70) return 'C';
    else if (score >= 60) return 'D';
    else return 'F';
}
