// * Author: Daniel Obazee
//* Version:04/9/2025
//* PROJECT06

#include <iostream>
#include <vector>
#include <cstdlib> // For random number generation
#include <ctime>   // For seeding the random number generator

#include "BladedWeapon.h"
#include "Dagger.h"
#include "Rapier.h"
#include "LongSword.h"

using namespace std;
//using namespace BladedWeapon;

int main() {
    srand(static_cast<unsigned>(time(0))); // Seed the random number generator

   vector<BladedWeapon*> weapons; // Vector to store weapon pointers

    char choice;
    do {
        cout << "Create a weapon:\n";
        cout << "1. Dagger\n";
        cout << "2. Rapier\n";
        cout << "3. LongSword\n";
        cout << "Enter your choice (1/2/3): ";
        int weaponType;
        cin >> weaponType;

        BladedWeapon* newWeapon = nullptr;
        switch (weaponType) {
        case 1:
            newWeapon = new Dagger();
            break;
        case 2:
            newWeapon = new Rapier();
            break;
        case 3:
            newWeapon = new LongSword();
            break;
        default:
            cout << "Invalid choice!\n";
            continue;
        }

        string weaponName;
        cout << "Enter a name for your weapon: ";
        cin.ignore();
        getline(cin, weaponName);
        newWeapon->setName(weaponName);

        weapons.push_back(newWeapon);
        cout << "Weapon created successfully!\n";

        cout << "Do you want to create another weapon? (y/n): ";
        cin >> choice;
    } while (choice == 'y' || choice == 'Y');

    cout << "\nYour weapons:\n";
    for (const auto& weapon : weapons) {
        cout << "Name: " << weapon->getName() << ", Type: " << weapon->getDamage() 
             << ", Cost: " << weapon->getCost() << " silver pieces\n";
        cout << "Rolling damage: " << weapon->rollDamage() << "\n";
        delete weapon; // Free dynamically allocated memory
    }



    return 0;
}
