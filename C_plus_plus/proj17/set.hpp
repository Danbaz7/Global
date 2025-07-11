#ifndef SET_HPP
#define SET_HPP

#include <iostream>
#include <vector>
#include <algorithm>

using namespace std; // Using namespace std

// Template-Based Set Class
template <class T>
class Set {
private:
    vector<T> items; // Internal representation using vector

public:
    // Constructor
    Set() = default;

    // Function: void addItem(const T& item)
    // Purpose:
    //   Adds a new item to the set. If the item already exists, no action is taken.
    // Inputs:
    //   - const T& item: The item to be added to the set.
    // Outputs:
    //   - None.
    // Logic:
    //   - Ensures no duplicate items are added by checking the vector before insertion.
    void addItem(const T& item);

    // Function: void removeItem(const T& item)
    // Purpose:
    //   Removes an item from the set if it exists.
    // Inputs:
    //   - const T& item: The item to be removed from the set.
    // Outputs:
    //   - None.
    // Logic:
    //   - Uses find to locate the item and erase it if found.
    void removeItem(const T& item);
    // Function: int getCount() const
    // Purpose:
    //   Returns the number of items in the set.
    // Inputs:
    //   - None.
    // Outputs:
    //   - int: The total number of items in the set.
    // Logic:
    //   - Returns the size of the vector.
    int getCount() const;

    // Function: bool isMember(const T& item) const
    // Purpose:
    //   Checks whether an item exists in the set.
    // Inputs:
    //   - const T& item: The item to be checked for membership.
    // Outputs:
    //   - bool: Returns true if the item exists in the set; otherwise false.
    // Logic:
    //   - Uses find for membership check.
    bool isMember(const T& item) const;

    // Function: T* toArray() const
    // Purpose:
    //   Returns a pointer to a dynamically allocated array containing all items in the set.
    // Inputs:
    //   - None.
    // Outputs:
    //   - T*: Pointer to the dynamically created array.
    // Logic:
    //   - Caller must ensure memory is deallocated.
    T* toArray() const;
};

// Function Implementations

template <class T>
void Set<T>::addItem(const T& item) {
    if (find(items.begin(), items.end(), item) == items.end()) {
        items.push_back(item);
    }
}

template <class T>
void Set<T>::removeItem(const T& item) {
    auto it = find(items.begin(), items.end(), item);
    if (it != items.end()) {
        items.erase(it);
    }
}

template <class T>
int Set<T>::getCount() const {
    return items.size();
}

template <class T>
bool Set<T>::isMember(const T& item) const {
    return find(items.begin(), items.end(), item) != items.end();
}

template <class T>
T* Set<T>::toArray() const {
    T* array = new T[items.size()];
    for (size_t i = 0; i < items.size(); ++i) {
        array[i] = items[i];
    }
    return array;
}

#endif // SET_HPP
