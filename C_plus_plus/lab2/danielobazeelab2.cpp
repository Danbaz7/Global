#include <iostream>
#include <limits>
using namespace std;


int main() {
    
  int number;
  char choice;
  do{
      cout<<"Enter a number:" <<" ";
      cin>> number;
      
        // Check if the input is valid
        if (cin.fail()) {
            cin.clear(); // Clear the error flag
            cin.ignore(numeric_limits<streamsize>::max(), '\n'); // Ignore the invalid input
            cout << "Invalid input. Please enter a valid integer.\n";
            continue; // Skip the rest of the loop and prompt again
        }
      
      if(number > 0)
          {cout<<"The number is positive";}
      else           // if(number <= 0)
          { cout<<"The number is non-positive";
          }  
    
      cout<< endl;
      cout<<"Do you want to enter another number ? (y/n)"
          << " ";
      cin>> choice;
    }
      while ( choice == 'Y' || choice == 'y'  );
      
      if( choice == 'N' || choice == 'n' ) {
      cout<<"Good Bye!"; }
      else{ cout<< "Invalid input." ;}
      
        
          
return 0;
    
            }