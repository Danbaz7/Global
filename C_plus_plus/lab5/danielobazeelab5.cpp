//Author:Daniel Obazee
//CSCI 121, LAB5

#include <iostream>
using namespace std;
// Function prototypes

double getLength();
// Precondition: getLength function
// Postcondition: Returns the length of the rectangle as a double
double getWidth();
// Precondition: getWidth function
// Postcondition: Returns the width of the rectangle as a double
double calculateArea(double &length, double &width);
// calculateArea function
// Precondition: length and width are valid double values
// Postcondition: Returns the area of the rectangle as a double

int main() {
    double length = getLength();
    double width = getWidth();
    double area = calculateArea(length, width);

    cout << "The area of the rectangle is: " << area << endl;
    return 0;
}

// Function definitions

double getLength() {
    double length;
    cout << "Enter the length of the rectangle: ";
    cin >> length;
    return length;
}

double getWidth() {
    double width;
    cout << "Enter the width of the rectangle: ";
    cin >> width;
    return width;
}

double calculateArea(double &length, double &width) {
    return length * width;
}