//Author:Daniel Obazee
//CSCI 121, Project5
#include <iostream>
#include <string>
//using namespace std;

// FUNCTION PROTOTYPES
void testMenu();
//This function prints the menu to the screen
bool isLeapYear(int year);
// Precondition: year is a valid integer
// Postcondition: Returns true if year is a leap year, false otherwise
int getCenturyValue(int year);
// Precondition: year is a valid integer
// Postcondition: calculates and returns the century value for the year
int getYearValue(int year);
// Precondition: year is a valid integer
// Postcondition:calculates and returns the value for the year
int getMonthValue(int month, int year);
// Precondition: month and year are valid integers
// Postcondition: calculates the month value for the given month and year
int dayOfWeek(int month, int day, int year);
// Precondition: month, day, and year are valid integers
// Postcondition: calculates and returns integers 0-6 for days Sunday-Saturday
std::string dayOfWeek(int day);
// Precondition: day has integer value 0, 1, 2, 3, 4, 5, or 6
// Postcondition: Returns the name of the day of the week
bool isValidYear(int year);
// Returns true if the year is valid, false otherwise
bool isValidMonth(int month);
// Returns true if the month is valid, false otherwise
bool isValidDay(int day, int month, int year);
// Returns true if the day is valid, false otherwise

//OVERLOADED FUNCTIONS TO VALIDATE USER'S INPUT
void validateUserInput(int &year);
//Validates input for year
void validateUserInput(int &month, int &year);
//Validates input for month
void validateUserInput(int &month, int &day, int &year);
//Validates input for days


int main() {
    using namespace std;
    int choice;
    int day, month, year;
    do {
        testMenu();
        cout << "Please choose from menu: ";
        cin >> choice;
        switch (choice) {
            case 1: // check if a given year is leap year
                cout << "Please enter a year: ";
                cin >> year;
                validateUserInput(year);
                if (isLeapYear(year))
                    cout << "Year " << year << " is a leap year" << endl;
                else
                    cout << "Year " << year << " is NOT a leap year" << endl;
                break;
            case 2: // calculate the century value of a given year
                cout << "Please enter a year: ";
                cin >> year;
                validateUserInput(year);
                cout << "The century value is: " << getCenturyValue(year) << endl;
                break;
            case 3: // calculate the year value of a given year
                cout << "Please enter a year: ";
                cin >> year;
                validateUserInput(year);
                cout << "The year value is: " << getYearValue(year) << endl;
                break;
            case 4: // calculate the month value of a given month in a given year
                cout << "Please enter a year and month: ";
                cin >> year >> month;
                validateUserInput(month, year);
                cout << "The month value is: " << getMonthValue(month, year) << endl;
                break;
            case 5: // calculate the day of week of a given date
                cout << "Please enter a year, a month, and a day: ";
                cin >> year >> month >> day;
                validateUserInput(month, day, year);
                cout << "The day of the week is: " << dayOfWeek(month, day, year) << endl;
                break;
            case 6: // print out the name of a given day of week
                cout << "Please enter a day of week (0 for Sunday, 1 for Monday, etc): ";
                cin >> day;
                cout << "The name of the day of the week is: " << dayOfWeek(day) << endl;
                break;
            case 7:
                cout << "Did you tested all functions yet? if not, please re-run the program." << endl;
                break;
            default:
                cout << "Invalid choice. Please try again." << endl;
        }
    } while (choice != 7);
    return 0;
}

// Function definitions

void testMenu() {
  using namespace std;  
    cout << "\tTest Menu\t\t " << endl;
    cout << "\t1. isLeapYear\t\t " << endl;
    cout << "\t2. getCenturyValue\t " << endl;
    cout << "\t3. getYearValue\t\t " << endl;
    cout << "\t4. getMonthValue\t " << endl;
    cout << "\t5. dayOfWeek(month, day, year) " << endl;
    cout << "\t6. dayOfWeek(day)\t  " << endl;
    cout << "\t7. Quit\t\t\t  " << endl;
   
}

bool isLeapYear(int year) {
    return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
}

int getCenturyValue(int year) {
    int century = year / 100; // Get the first two digits of the year
    int remainder = century % 4;  
    int result = 3 - remainder; 
    return result * 2; // Return this value multiplied by 2
}

int getYearValue(int year) {
    int lastTwoDigits = year % 100; // Extract the last two digits of the year
    int leapYears = lastTwoDigits / 4;  
    return lastTwoDigits + leapYears; 
}

int getMonthValue(int month, int year) {
    static const int monthValues[] = {0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
    if (isLeapYear(year) && (month == 1 || month == 2)) {
        return monthValues[month - 1] - 1;
    }
    return monthValues[month - 1];
}

int dayOfWeek(int month, int day, int year) {
    int centuryValue = getCenturyValue(year);
    int yearValue = getYearValue(year);
    int monthValue = getMonthValue(month, year);
    int sum = day + monthValue + yearValue + centuryValue;
    return sum % 7;
}


std::string dayOfWeek(int day) {
    using namespace std;
    static const string daysOfWeek[] = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    return daysOfWeek[day];
}

bool isValidYear(int year) {
    return year > 1582;
}

bool isValidMonth(int month) {
    return month >= 1 && month <= 12;
}

bool isValidDay(int day, int month, int year) {
    static const int daysInMonth[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    if (isLeapYear(year) && month == 2) {
        return day >= 1 && day <= 29;
    }
    return day >= 1 && day <= daysInMonth[month - 1];
}

void validateUserInput(int &year) {
     using namespace std;
    while (!isValidYear(year)) {
        cout << "Invalid year. Please enter a year later than 1582: ";
        cin >> year;
    }
}

void validateUserInput(int &month, int &year) {
     using namespace std;
    validateUserInput(year);
    while (!isValidMonth(month)) {
       cout << "Invalid month. Please enter a month between 1 and 12: ";
       cin >> month;
    }
}

void validateUserInput(int &month, int &day, int &year) {
     using namespace std;
    validateUserInput(month, year);
    while (!isValidDay(day, month, year)) {
        cout << "Invalid day. Please enter a valid day: ";
        cin >> day;
    }
}