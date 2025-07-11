// * Author: Daniel Obazee
// * Version: 04/18/2025
// * PROJECT16

// Program to convert 24-hour time to 12-hour time.
// Includes exception handling to manage invalid time formats.
// Custom exception class `TimeFormatMistake` is used.

#include <iostream>  // For input-output operations
#include <string>    // For string manipulations
#include <sstream>   // For string stream operations
#include <iomanip>   // For formatting output
#include <exception> // For exception handling

using namespace std; // Use the standard namespace

// Exception Class 
// Purpose:
//   The `TimeFormatMistake` class is a custom exception designed to handle errors
//   related to invalid time inputs in a program processing 24-hour formatted time.
//   It ensures clear error messages are displayed for user-friendly feedback.
// Inputs:
//   No direct inputs; triggered by invalid time-related errors.
// Outputs:
//   - Provides a custom error message when its `what()` function is called.
// Tricky Logic:
//   - Inherits from `std::exception` for seamless integration with C++'s exception framework.
//   - The `what()` function is overridden and marked `noexcept` to ensure robust error handling
//     without risking further exceptions.
// Dependencies:
//   Requires `<exception>` and is used in conjunction with validation logic for time inputs.

// Exception class DEFINITION:
class TimeFormatMistake : public exception {
public:
    // Overriding the `what` function to return a custom error message
    const char* what() const noexcept override {
        return "Invalid time format! Please enter a valid time.";
    }
};

// FUNCTION DECLARATIONS:
// Function: bool isValidTime(const string& time)
// Purpose:
//   This function validates whether the input string represents a correctly formatted 24-hour time in "hh:mm" format.
// Inputs:
//   - const string& time: A constant reference to a string containing the time input provided by the user. Example: "14:30".
// Outputs:
//   - bool: Returns `true` if the time is valid and adheres to the 24-hour format. If the time is invalid, it throws an exception of type `TimeFormatMistake`.
// Tricky Logic:
//   - Ensures the input string has exactly 5 characters, with the colon (`:`) in the middle (index 2). For instance, "hh:mm" is valid, while "1234" or "h:mm" is not.
//   - Splits the string into two components: the hour part (`hh`) and the minute part (`mm`).
//   - Checks if both components are numeric strings and converts them to integers. If a non-numeric string like "ab:cd" is provided, an exception is thrown.
//   - Validates that hours are in the range [0, 23] and minutes are in the range [0, 59]. For example, "25:00" or "10:65" would trigger the exception.
//   - Handles edge cases like incorrect separator placement ("1:234") or missing components ("::").
// Dependencies:
//   - Requires the `TimeFormatMistake` exception class to handle invalid inputs.
bool isValidTime(const string& time);

// Function: string convertTo12Hour(const string& time)
// Purpose:
//   This function converts a valid 24-hour time string into its corresponding 12-hour time format with an "AM" or "PM" suffix.
// Inputs:
//   - const string& time: A constant reference to a string containing a validated 24-hour formatted time. Example: "14:30".
// Outputs:
//   - string: Returns a string representing the time in 12-hour format with "AM" or "PM". Example: "2:30 PM".
// Tricky Logic:
//   - Determines whether the input represents "AM" or "PM" based on the hour component. For instance, hours >= 12 result in "PM," while hours < 12 result in "AM".
//   - Accounts for edge cases:
//       - Midnight ("00:00") is converted to "12:00 AM".
//       - Noon ("12:00") remains "12:00 PM".
//   - Uses arithmetic to convert hours greater than 12 into the 12-hour equivalent. For example, 13 becomes 1, and 15 becomes 3.
//   - Maintains leading zeros for minutes in the output, ensuring the format remains consistent. For example, "14:05" becomes "2:05 PM".
// Dependencies:
//   - Assumes the input time has already been validated using `isValidTime`.
string convertTo12Hour(const string& time);

int main() {
    string timeInput; // To hold user input for time
    char again;       // To hold user decision for repeating the program

    do {
        try {
            // Prompt user for time input
            cout << "Enter time in 24-hour notation (hh:mm): ";
            cin >> timeInput;

            // Validate and convert time
            if (isValidTime(timeInput)) {
                string convertedTime = convertTo12Hour(timeInput); // Convert the valid time
                cout << "That is the same as " << convertedTime << endl; // Display result
            }
        } catch (const TimeFormatMistake& e) {
            // Handle invalid time format exceptions
            cout << e.what() << " [" << timeInput << "]" << endl;
            cout << "Try again: ";
            continue; // Restart the loop
        }

        // Ask user if they want to run the program again
        cout << "Again? (y/n): ";
        cin >> again;
    } while (again == 'y' || again == 'Y'); // Continue until user chooses to quit

    cout << "End of program" << endl;
    return 0; // Exit program
}

// Function implementation to validate the time format
bool isValidTime(const string& time) {
    // Ensure the string length is valid and contains ':' at the correct position
    if (time.size() != 5 || time[2] != ':') {
        throw TimeFormatMistake(); // Invalid format
    }

    string hourStr = time.substr(0, 2); // Extract hour component
    string minuteStr = time.substr(3, 2); // Extract minute component

    try {
        // Convert hour and minute to integers
        int hour = stoi(hourStr);
        int minute = stoi(minuteStr);

        // Check if hour and minute values are within valid ranges
        if (hour < 0 || hour > 23 || minute < 0 || minute > 59) {
            throw TimeFormatMistake(); // Invalid value
        }
    } catch (...) {
        throw TimeFormatMistake(); // Catch all exceptions related to conversion
    }

    return true; // Time is valid
}

// Function implementation to convert 24-hour time to 12-hour format
string convertTo12Hour(const string& time) {
    string hourStr = time.substr(0, 2); // Extract hour component
    string minuteStr = time.substr(3, 2); // Extract minute component

    int hour = stoi(hourStr); // Convert hour to integer
    int minute = stoi(minuteStr); // Convert minute to integer

    // Determine AM/PM suffix
    string suffix = (hour >= 12) ? "PM" : "AM";
    if (hour == 0) {
        hour = 12; // Midnight case
    } else if (hour > 12) {
        hour -= 12; // Convert to 12-hour time
    }

    // Format the converted time as a string
    ostringstream oss;
    oss << hour << ":" << setw(2) << setfill('0') << minute << " " << suffix;

    return oss.str(); // Return the formatted time
}
