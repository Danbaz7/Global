//Author: Daniel Obazee
//Date:12-08-2024
//CSCI 121 PROJECT 14
#include <iostream>
using namespace std;

 int sum(int n);
 // Recursive version to calculate the sum of
 // 1 + 2 + .... + n

 int str_length(char s[]);
 // Recursive version of strlen in C strings.
 // It returns the length of the string s[].
 // (the null character, '\0', is not counted in the length)

int main() {
    char choice;
    do {
        int n;
        cout << "Enter a positive integer: ";
        cin >> n;


        int totalSum = sum(n);
        cout << "The sum of 1+2+...+" << n << " is: " << totalSum << endl;

        // Clear the input buffer
        cin.ignore();

    
        char sentence[100];
        cout << "Enter a sentence: ";
        cin.getline(sentence, 100);

       
        int length = str_length(sentence);
        cout << "It contains " << length << " chars, including white spaces" << endl;

       
        cout << "Do you want to have another run? Y/N: ";
        cin >> choice;
        cout<<endl;

    } while (choice == 'Y' || choice == 'y');

    return 0;
}

int sum(int n) {
    if (n == 1) {
        return 1;
    }
    return (sum(n - 1) + n);
}

int str_length(char s[]) {
    if (s[0] == '\0') {
        return 0;
    }
    return (str_length(s + 1) + 1);
}