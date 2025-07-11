
/*
Author: [Daniel Obazee]
Date: [04/25/2025]
 * 
Program Purpose:
This program implements a template-based class `Set` that models a collection of unique items, ensuring no duplicates are allowed. The `Set` class provides the following functionality:
- Add a new item to the set. If the item already exists, it is not added again.
- Remove an item from the set.
- Return the number of items in the set.
- Check if a specific item is a member of the set.
- Provide a dynamically allocated array containing all the items in the set, allowing the caller to process the items externally (responsible for memory deallocation).

The program tests the `Set` class with both integer and string data types, offering user interaction to input, test membership, and display the set's contents. It demonstrates the flexibility of template-based programming in handling various data types seamlessly.
*/

#include "set.hpp"

using namespace std; // Using namespace std

int main() {
    int choice;

    do {
        cout << "\nTest the Set program. Choose a type to test:\n";
        cout << "1. Integer Set\n";
        cout << "2. String Set\n";
        cout << "0. Exit\n";
        cout << "Enter your choice: ";
        cin >> choice;

        switch (choice) {
            case 1: {
                Set<int> intSet;
                int input, query;

                cout << "\nEnter integers to add to the set, enter space between numbers (enter -1 to stop):\n";
                while (true) {
                    cin >> input;
                    if (input == -1) break; // Sentinel value to stop input
                    intSet.addItem(input);
                }

                cout << "\nEnter an integer to check membership (enter -1 to skip): ";
                cin >> query;
                if (query != -1) {
                    cout << "Is " << query << " a member? " 
                         << (intSet.isMember(query) ? "Yes" : "No") << endl;
                }

                cout << "\nItems in Integer Set: ";
                int* intArray = intSet.toArray();
                for (int i = 0; i < intSet.getCount(); ++i) {
                    cout << intArray[i] << " ";
                }
                cout << endl;
                delete[] intArray; // Free allocated memory
                break;
            }

            case 2: {
                Set<string> stringSet;
                string input, query;

                cout << "\nEnter words to add to the set, enter space between words (type 'STOP' to finish):\n";
                while (true) {
                    cin >> input;
                    if (input == "STOP") break; // Sentinel value to stop input
                    stringSet.addItem(input);
                }

                cout << "\nEnter a string to check membership (type 'SKIP' to skip): ";
                cin >> query;
                if (query != "SKIP") {
                    cout << "Is \"" << query << "\" a member? " 
                         << (stringSet.isMember(query) ? "Yes" : "No") << endl;
                }

                cout << "\nItems in String Set: ";
                string* stringArray = stringSet.toArray();
                for (int i = 0; i < stringSet.getCount(); ++i) {
                    cout << stringArray[i] << " ";
                }
                cout << endl;
                delete[] stringArray; // Free allocated memory
                break;
            }

            case 0:
                cout << "Exiting program. Goodbye!" << endl;
                break;

            default:
                cout << "Invalid choice. Please try again." << endl;
        }
    } while (choice != 0);

    return 0;
}
