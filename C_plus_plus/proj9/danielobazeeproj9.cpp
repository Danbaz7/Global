/* This program requires the student to write 8 functions. Some described
 * in Program project 4 (Page 537) and Program Project 6 (Page 538).
 * The student also need to add a print function to print out an array.
 * The student may watch video notes on MyProgrammingLab to get the idea
 * on how to write the main function and three of these four functions
class word2;
 *
 * Author: Daniel Obazee
 * Version:01/29/2025
 * PROJECT9
 */

#include <iostream>
#include <string>
#include <cstring>
using namespace std;

void reverse(char* front, char* rear);
// Precondition: The front and rear are pointing to the front
//               and rear of a C-string, respectively
// Postcondition: The C-string is reversed

void encode(char* word1, char* word2);
// Precondition: The word1 and word2 are pointing to the first char of 2 C-strings.
//               The C-strings are of equal length.
// Postcondition: Each word will switch even numbered letters. 

void decode(char* word1, char* word2);
// Precondition: The word1 and word2 are pointing to the first char of 2 C-strings.
//               The C-strings are of equal length.
// Postcondition: Will reverse the encode changes

void encode(char* word1, int addTo);
// Precondition: The word1 is pointing to the first char of a C-string. addTo is the number
//               to be added to the ascii code.
// Postcondition: Word1 will be encoded where the letters will be changed. Example would be the
//                word 'act' and 2 will result in "cev" where 2 was added to the ascii letters 'a'
//                'c' and 't'.

bool findEntry(string* myArray, int& ndx, string wordToFind);
// Precondition: myArray point to a array of strings, ndx is inital value,
//               newEntry is a string
// Postcondition: Function returns true or false if wordToFind is in the string array myArray.
//                ndx will be the index of the wordToFind in the string array myArray.

string* addEntry(string* dynamicArray, int& size, string newEntry);
// Precondition: dynamicArray point to a array of strings with given size,
//               newEntry is a string
// Postcondition: A new dynamic array is created, which is one larger than
//                dynamicArray All elements from dynamicArray are copied to
//                new array, the new entry is added to new array, the size
//                is increased, the dynamicArray is deleted, new dynamic
//                array is returned.

string* deleteEntry(string* dynamicArray, int& size, string entryToDelete);
// Precondition: dynamicArray point to a array of strings with give size,
//               newEntry is a string
// Postcondition: The function should search dynamicArray for entryToDelete.
//                If not found, the request should be ignored and the
//                unmodified dynamicArray returned. If found, create a new
//                dynamic array one element smaller than dynamicArray. Copy
//                all element except entryToDelete into the new array, delete
//                dynamicArray, decrement size, and return the new dynamic
//                array

void print(const string* dynamicArray, int size);
// Precondition: dynamicArray point to a array of strings with give size,
// Postcondition: The elements in dynamic array will be print out. One
//                element per line forllowed by its index

int main() {
    // Test reverse function
    char str1[] = "Example";
    char str2[] = "Reversal";
    
    cout << "Before reversing str1: " << str1 << endl;
    reverse(str1, str1 + strlen(str1) - 1);
    cout << "Reversed str1: " << str1 << endl;
    
    cout << "Before reversing str2: " << str2 << endl;
    reverse(str2, str2 + strlen(str2) - 1);
    cout << "Reversed str2: " << str2 << endl;

    //The encode and decode functions (switch even-numbered letters)
    char firstWord[] = "abcdef";
    char secondWord[] = "ghijkl";
    
    encode(firstWord, secondWord);
    cout << "Encoded firstWord: " << firstWord << endl;
    cout << "Encoded secondWord: " << secondWord << endl;
    decode(firstWord, secondWord);
    cout << "Decoded firstWord: " << firstWord << endl;
    cout << "Decoded secondWord: " << secondWord << endl;

    // Encode function (add to ASCII code)
    char wordThree[] = "act";
    int addNum = 2;
    encode(wordThree, addNum);
    cout << "Encoded wordThree: " <<wordThree << endl;

    //Test for findEntry function
    int size = 3;
    string array[] = {"apple", "banana", "cherry"};
    int ndx = size;
    bool found = findEntry(array, ndx, "banana");
    
    cout << "Found 'banana': ";
    if (found) {
        cout << "Yes";
    } else {
        cout << "No";
    }
    cout << ", Index: " << ndx << endl;
    
    //Test for addEntry and deleteEntry functions
    string* dArray = new string[size]{"apple", "banana", "cherry"}; // Initializes the dynamic array that dArray is pointing to.
    print(dArray, size);
    cout<<endl;
    
    dArray = addEntry(dArray, size, "date");
    print(dArray, size);
    cout<<endl;
    
    dArray = deleteEntry(dArray, size, "banana");
    print(dArray, size);

    delete[] dArray;

    return 0;
}


void reverse(char* front, char* rear) {
    while (front < rear) {
        char temp = *front;
        *front = *rear;
        *rear = temp;
        front++;
        rear--;
    }
}

void encode(char* word1, char* word2) {
    for (int i = 0; word1[i] != '\0' && word2[i] != '\0'; i += 2) {
        char temp = word1[i];
        word1[i] = word2[i];
        word2[i] = temp;
    }
}

void decode(char* word1, char* word2) {
    encode(word1, word2); // Since encoding and decoding are symmetric i.e
                          //they undo eachother 
}

void encode(char* word1, int addTo) {
    for (int i = 0; word1[i] != '\0'; i++) {
        word1[i] = word1[i] + addTo;
    }
}

bool findEntry(string* myArray, int& ndx, string wordToFind) {
    for (int i = 0; i < ndx; i++) {
        if (myArray[i] == wordToFind) {
            ndx = i;
            return true;
        }
    }
    return false;
}

string* addEntry(string* dynamicArray, int& size, string newEntry) {
    string* newArray = new string[size + 1];
    for (int i = 0; i < size; i++) {
        newArray[i] = dynamicArray[i];
    }
    newArray[size] = newEntry;
    size++;
    delete[] dynamicArray;
    return newArray;
}

string* deleteEntry(string* dynamicArray, int& size, string entryToDelete) 
{
    int index = -1; //sentinel value
    for (int i = 0; i < size; i++) {
        if (dynamicArray[i] == entryToDelete) {
            index = i;        // Set index to the position of the entry to delete
            break;
        }
    }
    if (index == -1) {
        return dynamicArray; // Entry not found, return original array
    }
    string* newArray = new string[size - 1]; 
    for (int i = 0, j = 0; i < size; i++) {
        if (i != index) {
            newArray[j++] = dynamicArray[i];    // Copy elements except the one to delete
        }
    }
    size--;  //
    delete[] dynamicArray;
    return newArray;
}

void print(const string* dynamicArray, int size) {
    for (int i = 0; i < size; i++) {
        cout << i << ": " << dynamicArray[i] << endl;
    }
}
