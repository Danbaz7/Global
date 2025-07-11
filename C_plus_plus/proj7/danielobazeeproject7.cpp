//Author: Daniel Obazee
//Date:11-17-2024
//CSSI 121 PROJECT 7

#include <iostream>
using namespace std;

void menu();
// pre-condition: None
// post-condition: Displays a menu of options to the user

void fill_array(int arr[], int size);
// pre-condition: The array `arr` has an actual size that is greater than or equal to `size`
// post-condition: `arr[0]` to `arr[size-1]` are filled with values entered from the keyboard

void print_array(int arr[], int size);
// pre-condition: The array `arr` has an actual size that is greater than or equal to `size`
// post-condition: `arr[0]` to `arr[size-1]` are printed to the screen with 5 elements per line

int linear_search(int arr[], int size, int key);
// pre-condition: The array `arr` has the given `size`
// post-condition: Returns the index of the first occurrence of `key` in `arr`. If the `key` cannot be found in `arr`, returns -1

void select_sort(int arr[], int size);
// pre-condition: The array `arr` has the given `size`
// post-condition: The elements in `arr` are rearranged from least to largest

void insert_sort(int arr[], int size);
// pre-condition: The array `arr` has the given `size`
// post-condition: The elements in `arr` are rearranged from least to largest

void bubble_sort(int arr[], int size);
// pre-condition: The array `arr` has the given `size`
// post-condition: The elements in `arr` are rearranged from least to largest

void swap(int& v1, int& v2);

int main() {
    int choice;
    int a[9];
    do {
        menu();
        cout << "Enter your choice: ";
        cin >> choice;
        switch (choice) {
            case 1: {
                fill_array(a, 9);
                cout << "Enter the key you want to search: ";
                int key;
                cin >> key;
                int index = linear_search(a, 9, key);
                if (index == -1)
                    cout << "The key " << key << " is not in array\n";
                else
                    cout << "The key " << key << " is #" << (index + 1) << " element in array\n";
                break;
            }
            case 2: {
                fill_array(a, 9);
                select_sort(a, 9);
                cout << "After sort, the array is:\n";
                print_array(a, 9);
                break;
            }
            case 3: {
                fill_array(a, 9);
                insert_sort(a, 9);
                cout << "After sort, the array is:\n";
                print_array(a, 9);
                break;
            }
            case 4: {
                fill_array(a, 9);
                bubble_sort(a, 9);
                cout << "After sort, the array is:\n";
                print_array(a, 9);
                break;
            }
            case 5: {
                cout << "Thank you for using the array functions\n";
                break;
            }
            default: {
                cout << "Wrong choice. Please choose from menu: ";
                break;
            }
        }
    } while (choice != 5);
    return 0;
}

void menu() {
    cout << "Menu:\n";
    cout << "1. Linear Search\n";
    cout << "2. Selection Sort\n";
    cout << "3. Insertion Sort\n";
    cout << "4. Bubble Sort\n";
    cout << "5. Exit\n";
}
void fill_array(int arr[], int size) {
    for (int i = 0; i < size; i++) {
        cout << "Enter element " << i + 1 << ": ";
        cin >> arr[i];
    }
}

void print_array(int arr[], int size) {
    for (int i = 0; i < size; i++) {
        cout << arr[i] << " ";
        if ((i + 1) % 5 == 0) {
            cout << endl;
        }
    }
    cout << endl;
}

int linear_search(int arr[], int size, int key) {
    for (int i = 0; i < size; i++) {
        if (arr[i] == key) {
            return i;
        }
    }
    return -1;
}

void select_sort(int arr[], int size) 
{
    for (int i = 0; i < size - 1; i++)
    {
        int min_index = i;
        for (int j = i + 1; j < size; j++) 
        {
            if (arr[j] < arr[min_index])
                  min_index = j;
        }
        swap(arr[i], arr[min_index]);
    }
}

void insert_sort(int arr[], int size) {
    for (int i = 1; i < size; i++) {
        int key = arr[i];
        int j = i - 1;
        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = key;
    }
}

void bubble_sort(int arr[], int size) 
{
    for (int i = 0; i < size - 1; i++) 
    {
        for (int j = 0; j < size - i - 1; j++) 
        {
            if (arr[j] > arr[j + 1]) 
                swap(arr[j], arr[j + 1]);
            
        }
    }
}

void swap(int& v1, int& v2)
  {
    int temp = v1;
    v1=v2;
    v2=temp;
  }