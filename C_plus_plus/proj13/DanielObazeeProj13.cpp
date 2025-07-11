#include "CSCI221proj5.h"
#include <cstdlib>

using namespace std;
namespace FHSULINKEDLIST{
    
size_t list_length(const Node* head_ptr) {
    size_t count = 0;
    const Node* cursor = head_ptr;
    while (cursor != nullptr) {
        count++;
        cursor = cursor->link;
    }
    return count;
}

void list_head_insert(Node*& head_ptr, const Node::Item& entry) {
    Node* new_node = new Node;
    new_node->data = entry;
    new_node->link = head_ptr;
    head_ptr = new_node;
}

void list_insert(Node* previous_ptr, const Node::Item& entry) {
    if (previous_ptr == nullptr) return; // Safety check
    Node* new_node = new Node;
    new_node->data = entry;
    new_node->link = previous_ptr->link;
    previous_ptr->link = new_node;
}

Node* list_search(Node* head_ptr, const Node::Item& target) {
    Node* cursor = head_ptr;
    while (cursor != nullptr) {
        if (cursor->data == target) {
            return cursor;
        }
        cursor = cursor->link;
    }
    return nullptr; // Target not found
}

Node* list_locate(Node* head_ptr, size_t position) {
    if (position == 0) return nullptr; // Positions are 1-based
    Node* cursor = head_ptr;
    size_t index = 1;
    while (cursor != nullptr && index < position) {
        cursor = cursor->link;
        index++;
    }
    return cursor; // May return nullptr if position is out of bounds
}

void list_head_remove(Node*& head_ptr) {
    if (head_ptr == nullptr) return; // Empty list
    Node* temp = head_ptr;
    head_ptr = head_ptr->link;
    delete temp; // Free memory
}

void list_remove(Node* previous_ptr) {
    if (previous_ptr == nullptr || previous_ptr->link == nullptr) return; // Invalid input
    Node* temp = previous_ptr->link;
    previous_ptr->link = temp->link;
    delete temp; // Free memory
}

void list_clear(Node*& head_ptr) {
    while (head_ptr != nullptr) {
        Node* temp = head_ptr;   // Save pointer to current node
        head_ptr = head_ptr->link; // Move head_ptr to the next node
        delete temp;             // Free memory of the current node
    }
    head_ptr = nullptr; // Ensure the list is empty by setting head_ptr to NULL
}

void list_copy(Node* source_ptr, Node*& head_ptr) {
    head_ptr = nullptr; // Initialize new list
    if (source_ptr == nullptr) return; // Source list is empty

    // Create the first node
    head_ptr = new Node;
    head_ptr->data = source_ptr->data;
    Node* tail = head_ptr; // Tail pointer for appending nodes

    source_ptr = source_ptr->link;
    while (source_ptr != nullptr) {
        Node* new_node = new Node;
        new_node->data = source_ptr->data;
        new_node->link = nullptr;
        tail->link = new_node; // Append to tail
        tail = new_node;       // Move tail pointer
        source_ptr = source_ptr->link;
    }
}


size_t list_occurrences(Node* head_ptr, const Node::Item& target) {
    size_t count = 0;
    Node* cursor = head_ptr;
    while (cursor != nullptr) {
        if (cursor->data == target) {
            ++count;
        }
        cursor = cursor->link;
    }
    return count;
}

void list_tail_attach(Node*& head_ptr, const Node::Item& entry) {
    Node* new_node = new Node;
    new_node->data = entry;
    new_node->link = nullptr;

    if (head_ptr == nullptr) {
        head_ptr = new_node; // First node in the list
    } else {
        Node* cursor = head_ptr;
        while (cursor->link != nullptr) {
            cursor = cursor->link;
        }
        cursor->link = new_node; // Append to end of list
    }
}

void list_tail_remove(Node*& head_ptr) {
    if (head_ptr == nullptr) return; // Empty list
    if (head_ptr->link == nullptr) {
        delete head_ptr;
        head_ptr = nullptr; // Only one node in the list
        return;
    }
    Node* cursor = head_ptr;
    while (cursor->link->link != nullptr) {
        cursor = cursor->link;
    }
    delete cursor->link;    // Remove the last node
    cursor->link = nullptr; // Update the tail pointer
}

Node* list_copy_front(Node* source_ptr, size_t n) {
    if (n == 0 || source_ptr == nullptr) return nullptr;

    Node* head_ptr = new Node;
    head_ptr->data = source_ptr->data;
    Node* tail = head_ptr;

    size_t count = 1;
    source_ptr = source_ptr->link;
    while (source_ptr != nullptr && count < n) {
        Node* new_node = new Node;
        new_node->data = source_ptr->data;
        new_node->link = nullptr;
        tail->link = new_node;
        tail = new_node;
        source_ptr = source_ptr->link;
        ++count;
    }
    return head_ptr;
}

}
