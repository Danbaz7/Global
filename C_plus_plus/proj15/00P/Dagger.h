#ifndef DAGGER_H
#define DAGGER_H

#include "BladedWeapon.h"



    /*
     * Class: Dagger
     * Description: Represents a specific type of bladed weapon with a default name, cost, and damage.
     */

    /*
     * Default Constructor
     * Description: Initializes a dagger with default properties.
     * Preconditions: None.
     * Postconditions: A Dagger object is created with the name "Dagger", 
     *                 a cost of 2 silver pieces, and damage "1d4".
     */
    class Dagger : public BladedWeapon {
    public:
        Dagger();
    };



#endif // DAGGER_H
