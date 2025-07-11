#include "BladedWeapon.h"
#include <cstdlib> // For random number generation
#include <ctime>   // For seeding the random number generator



    BladedWeapon::BladedWeapon() : name("Unknown"), cost(0), damage("1d4") {}

    BladedWeapon::BladedWeapon(string name, int cost, string damage) 
        : name(name), cost(cost), damage(damage) {}

    string BladedWeapon::getName() const {
        return name;
    }

    int BladedWeapon::getCost() const {
        return cost;
    }

    string BladedWeapon::getDamage() const {
        return damage;
    }

    void BladedWeapon::setName(string newName) {
        name = newName;
    }

    void BladedWeapon::setCost(int newCost) {
        cost = newCost;
    }

    void BladedWeapon::setDamage(string newDamage) {
        damage = newDamage;
    }

    int BladedWeapon::rollDamage() const {
        int diceSides = stoi(damage.substr(2)); // Extract the number of sides (e.g., "1d6" -> 6)
        return rand() % diceSides + 1;          // Random number between 1 and diceSides
    }

    BladedWeapon::~BladedWeapon() {}


