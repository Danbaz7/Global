//Author: Daniel Obazee
//Date:09-15-2024
//CSSI 121 project 2
/*This is a BMR calculator that calculates ones calories

 *needed to maintain ones weight. */


#include <iostream>
using namespace std;

int main() {
    int chocolateCalories = 230;
    double weight, height, age, Bmr, barCalories;
    char choice, gender;

    cout << "Welcome to my BMR calculator" << endl;

    do {
        cout << "Gender (M or F): ";
        cin >> gender;
        cout << "Weight (in pounds): ";
        cin >> weight;
        cout << "Height (in inches): ";
        cin >> height;
        cout << "Age (in years): ";
        cin >> age;
        
        if (gender == 'M' || gender == 'm') {
            Bmr = 66 + (6.3 * weight) + (12.9 * height) - (6.8 * age);
            barCalories = static_cast<double>( Bmr) / chocolateCalories; //chocolate bar's calories
            
            cout << "He needs " << Bmr << " calories to maintain his weight. That is about ";
            cout<<barCalories <<" " <<"chocolate bar's calories" <<endl;
        } else if (gender == 'F' || gender == 'f') {
            Bmr = 655 + (4.3 * weight) + (4.7 * height) - (4.7 * age);
            barCalories = static_cast<double>( Bmr) / chocolateCalories; //chocolate bar's calories
            
            cout << "She needs " << Bmr << " calories to maintain her weight. That is about ";
            cout<<barCalories <<" " <<"chocolate bar's calories" <<endl;
        } else {
            cout << "Wrong gender input. Please enter Gender (M or F): ";
            continue;
        }
        
        cout << "Do you want to do another calculation? (Y/N): ";
        cin >> choice;
    } while (choice == 'Y' || choice == 'y');

    if (choice == 'N' || choice == 'n') {
        cout << "Good Bye!";
    } else {
        cout << "Invalid input. Good bye!";
    }

    return 0;
}