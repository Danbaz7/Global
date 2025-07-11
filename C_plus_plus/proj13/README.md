# 🔗 Linked List Library – `FHSULINKEDLIST`

### 📁 Header File: `CSCI221proj5.h`

### ⚙️ Implementation File: `linkedlist.cpp` (this file)

### 🧠 Namespace: `FHSULINKEDLIST`

A custom library for managing singly linked lists in C++. This implementation provides a full suite of modular functions for building, updating, searching, and maintaining dynamic lists using pointers.

---

## 🚀 Features & Capabilities

- 📏 `list_length()` – Returns the number of nodes in the list
- 🔢 `list_head_insert()` – Inserts a new node at the head
- 🧩 `list_insert()` – Inserts a new node after a given node
- 🔍 `list_search()` – Finds a node with a specific value
- 📍 `list_locate()` – Retrieves the node at a given position
- 🔨 `list_head_remove()` – Removes the head node
- ❌ `list_remove()` – Removes node after a given pointer
- 🧼 `list_clear()` – Deletes the entire list and frees memory
- 🧬 `list_copy()` – Creates a deep copy of another list
- 🔁 `list_occurrences()` – Counts the number of times a value occurs
- 📦 `list_tail_attach()` – Appends a node to the end of the list
- 🧯 `list_tail_remove()` – Removes the last node in the list
- ✂️ `list_copy_front()` – Copies the first N elements of a list

---

## 🧪 Sample Usage

```cpp
#include "CSCI221proj5.h"
using namespace FHSULINKEDLIST;

Node* my_list = nullptr;

list_head_insert(my_list, 10);
list_head_insert(my_list, 20);
list_tail_attach(my_list, 30);

size_t length = list_length(my_list); // Should return 3
Node* found = list_search(my_list, 10); // Returns pointer to node with data 10
```

## 🧼 Memory Management Notes

-All insert/remove functions dynamically allocate or free memory using new and delete.
-Always ensure lists are cleared with list_clear() to prevent memory leaks.
-Functions include safety checks for nullptr and out-of-bounds positions.

## 🛠️ Dependencies

Standard C++ Libraries: <cstdlib>
External Header: CSCI221proj5.h — contains Node definition and aliases.

## 🧑‍💻 Author

Project implemented by Daniel Obazee 🧠 Designed for CSCI 221 coursework and modular data structure mastery.
