#ifndef RAPIER_H
#define RAPIER_H

#include "BladedWeapon.h"



    /*
     * Class: Rapier
     * Description: Represents a specific type of bladed weapon with a default name, cost, and damage.
     */

    /*
     * Default Constructor
     * Description: Initializes a rapier with default properties.
     * Preconditions: None.
     * Postconditions: A Rapier object is created with the name "Rapier", 
     *                 a cost of 20 silver pieces, and damage "1d6".
     */
    class Rapier : public BladedWeapon {
    public:
        Rapier();
    };



#endif // RAPIER_H
