#ifndef LONGSWORD_H
#define LONGSWORD_H

#include "BladedWeapon.h"



    /*
     * Class: LongSword
     * Description: Represents a specific type of bladed weapon with a default name, cost, and damage.
     */

    /*
     * Default Constructor
     * Description: Initializes a longsword with default properties.
     * Preconditions: None.
     * Postconditions: A LongSword object is created with the name "LongSword", 
     *                 a cost of 10 silver pieces, and damage "1d8".
     */
    class LongSword : public BladedWeapon {
    public:
        LongSword();
    };



#endif // LONGSWORD_H
