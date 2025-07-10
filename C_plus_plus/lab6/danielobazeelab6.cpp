//Daniel Obazee Lab6

//This program counts the words in an input file and appends it
//to an ouput file as well as printing it on the console/screen.

#include <iostream>
#include <fstream>
#include <string>
using namespace std;

// FUNCTION PROTOTYPES
void printWelcomeMessage();
// Postcondition: Prints a welcome message to the console

void getFileNames(char inputFileName[], char outputFileName[]);
// Precondition: inputFileName and outputFileName are character arrays with sufficient size
// Postcondition: Prompts the user to enter the names of the input and output files

bool openFiles(ifstream &inputFile, ofstream &outputFile, const char inputFileName[], const char outputFileName[]);
// Precondition: inputFileName and outputFileName are valid file names
// Postcondition: Opens the input and output files and returns true if both files are successfully opened, false otherwise

int countWords(ifstream &inputFile);
// Precondition: inputFile is a valid ifstream object and is open
// Postcondition: Returns the number of words in the input file

void printResults(ofstream &outputFile, int wordCount);
// Precondition: outputFile is a valid ofstream object and is open, wordCount is a non-negative integer
// Postcondition: Prints the word count to the console and writes it to the output file

int main() {
    char inputFileName[50];
    char outputFileName[50];
    ifstream inputFile;
    ofstream outputFile;

    printWelcomeMessage();
    getFileNames(inputFileName, outputFileName);

    openFiles(inputFile, outputFile, inputFileName, outputFileName);

    int wordCount = countWords(inputFile);
    printResults(outputFile, wordCount);

    inputFile.close();
    outputFile.close();

    return 0;
}

// Function definitions
void printWelcomeMessage() {
    cout << "Welcome to the file stream counting program." << endl;
    cout << "To use this program, you must have an input file that has text to count how many words are there!" << endl;
}

void getFileNames(char inputFileName[], char outputFileName[]) {
    cout << "Please enter the input file full name including the file extension: ";
    cin.getline(inputFileName, 50);
    cout << "Please enter the output file full name including the file extension: ";
    cin.getline(outputFileName, 50);
}

bool openFiles(ifstream &inputFile, ofstream &outputFile, const char inputFileName[], const char outputFileName[]) {
    inputFile.open(inputFileName);
    outputFile.open(outputFileName, ios::app); // Append mode to retain results
    if (inputFile.fail() || outputFile.fail()) {
        cout << "Failed to open file(s)." << endl;
        return false;
    }
    return true;
}

int countWords(ifstream &inputFile) {
    string word;
    int numOfWrd = 0;
    while (inputFile>>word) {
        numOfWrd++;
    }
    return numOfWrd;
}

void printResults(ofstream &outputFile, int wordCount) {
    cout << "The input file contains " << wordCount << " words." << endl;
    outputFile << "The input file contains " << wordCount << " words." << endl;
}
