//Author:Daniel Obazee
//CSCI 121, LAB4

#include<iostream>
#include<cmath>
using namespace std;
const double PI = 3.14159;

// Function prototypes
double circleArea(double circleRadius);
// Function to calculate the area of a circle
// Preconditions: radius must be a non-negative double
// Postconditions: returns the area of the circle

double sphereVolume(double shpereRadius);
// Function to calculate the volume of a sphere
// Preconditions: radius must be a non-negative double
// Postconditions: returns the volume of the sphere

int main() {
   
    double radius;

    cout << "Enter the radius: ";
    cin >> radius;

    double area = circleArea(radius);
    double volume = sphereVolume(radius);

    cout << "Area of the circle: " << area  << endl;
    cout << "Volume of the sphere: " << volume  << endl;

    return 0;
}


double circleArea(double circleRadius) {
    return PI * pow(circleRadius,2);
}

double sphereVolume(double sphereRadius) {
    return (4.0 / 3.0) * PI * pow(sphereRadius, 3);
}