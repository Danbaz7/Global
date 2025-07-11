// * Author: Daniel Obazee
//* Version:04/9/2025
//* PROJECT06
#ifndef BLADED_WEAPON_H
#define BLADED_WEAPON_H

#include <string>
using namespace std;

/*
 * Namespace: BladedWeapon
 * Description: Encapsulates classes related to bladed weapon types and their functionalities.
 */


    /*
     * Class: BladedWeapon
     * Description: Represents a general bladed weapon with a name, cost, and damage.
     *              Provides methods for accessing and modifying properties and calculating damage.
     */

    /*
     * Default Constructor
     * Description: Initializes a weapon with default properties.
     * Preconditions: None.
     * Postconditions: A BladedWeapon object is created with the name "Unknown", 
     *                 a cost of 0, and damage "1d4".
     */
    class BladedWeapon {
    private:
        string name;   // Weapon name
        int cost;      // Cost in silver pieces
        string damage; // Damage (dice format like "1d6")

    public:
        BladedWeapon();

        /*
         * Parameterized Constructor
         * Description: Initializes a weapon with specific properties.
         * Preconditions: Valid values for name, cost, and damage format (e.g., "1d6").
         * Postconditions: A BladedWeapon object is created with the specified properties.
         */
        BladedWeapon(string name, int cost, string damage);

        /*
         * Getter for the name property.
         * Description: Retrieves the name of the weapon.
         * Preconditions: None.
         * Postconditions: Returns the name of the weapon as a string.
         */
        string getName() const;

        /*
         * Getter for the cost property.
         * Description: Retrieves the cost of the weapon in silver pieces.
         * Preconditions: None.
         * Postconditions: Returns the cost of the weapon as an integer.
         */
        int getCost() const;

        /*
         * Getter for the damage property.
         * Description: Retrieves the damage format of the weapon (e.g., "1d6").
         * Preconditions: None.
         * Postconditions: Returns the damage format as a string.
         */
        string getDamage() const;

        /*
         * Setter for the name property.
         * Description: Updates the name of the weapon.
         * Preconditions: A valid name string.
         * Postconditions: The weapon's name is updated to the new value.
         */
        void setName(string newName);

        /*
         * Setter for the cost property.
         * Description: Updates the cost of the weapon.
         * Preconditions: A non-negative integer value.
         * Postconditions: The weapon's cost is updated to the new value.
         */
        void setCost(int newCost);

        /*
         * Setter for the damage property.
         * Description: Updates the damage format of the weapon.
         * Preconditions: A valid damage string in dice notation (e.g., "1d6").
         * Postconditions: The weapon's damage format is updated to the new value.
         */
        void setDamage(string newDamage);

        /*
         * Virtual function to calculate damage.
         * Description: Calculates the amount of damage dealt by the weapon based on its damage format.
         * Preconditions: The random number generator must be seeded.
         * Postconditions: Returns an integer representing the rolled damage.
         */
        virtual int rollDamage() const;

        /*
         * Virtual Destructor
         * Description: Destroys the object and releases any allocated resources.
         * Preconditions: None.
         * Postconditions: The object is safely destroyed.
         */
        virtual ~BladedWeapon();
    };



#endif // BLADED_WEAPON_H
