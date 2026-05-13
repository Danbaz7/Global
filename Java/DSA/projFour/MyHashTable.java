
package csci251projfour;
import java.util.ArrayList;

/**
 * class MyHashTable. A simple HashTable. Collision handling is by Chaining
 * * @author Daniel Obazee
 * @version 3-20-2026
 */
public class MyHashTable<K extends Comparable<K>, V> {
    private ArrayList<MyHashEntry<K, V>> table;
    private int count; // how many elements in table
    private int capacity;

    /**
     * Constructor. Constructor of an empty MyHashTable with given number of Buckets
     * @param tableSize The number of Buckets of the table
     */
    public MyHashTable(int tableSize) {
        this.capacity = tableSize;
        this.table = new ArrayList<>(capacity);
        for (int i = 0; i < capacity; i++) {
            table.add(null);
        }
        this.count = 0;
    }

    /**
     * constructor. Construct of an empty MyHashTable with capacity 10 buckets
     */
    public MyHashTable() {
        this(10);
    }

    /**
     * Hash function: modulus of the hash table bucket size
     */
    private int hash(K key) {
        return Math.abs(key.hashCode()) % capacity;
    }

    /**
     * get the number of elements in the table
     * @return the number of elements in the table
     */
    public int size() {
        return count;
    }

    /**
     * clear the table
     */
    public void clear() {
        for (int i = 0; i < capacity; i++) {
            table.set(i, null);
        }
        count = 0;
    }

    /**
     * get the value with given key.
     * @param key The given key
     * @return the value that matches the given key. If no such value, return null
     */
    public V get(K key) {
        int index = hash(key);
        MyHashEntry<K, V> current = table.get(index);
        
        while (current != null) {
            if (current.getKey().equals(key)) {
                return current.getValue();
            }
            current = current.getNext();
        }
        return null;
    }

    /**
     * insert (key, value) pair into the table
     * @param key The key of the pair
     * @param value The value of the pair
     */
    public void insert(K key, V value) {
        int index = hash(key);
        MyHashEntry<K, V> head = table.get(index);
        
        // Check if key already exists to update value
        MyHashEntry<K, V> current = head;
        while (current != null) {
            if (current.getKey().equals(key)) {
                current.setValue(value);
                return;
            }
            current = current.getNext();
        }
        
        // Key not found, insert at the head of the chain
        MyHashEntry<K, V> newNode = new MyHashEntry<>(key, value);
        newNode.setNext(head);
        table.set(index, newNode);
        count++;
    }

    /**
     * remove the value with given key from the table
     * @param key The given key
     * @return the value whose key matches. If no such value, null is returned
     */
    public V remove(K key) {
        int index = hash(key);
        MyHashEntry<K, V> current = table.get(index);
        MyHashEntry<K, V> prev = null;
        
        while (current != null) {
            if (current.getKey().equals(key)) {
                if (prev == null) {
                    table.set(index, current.getNext());
                } else {
                    prev.setNext(current.getNext());
                }
                count--;
                return current.getValue();
            }
            prev = current;
            current = current.getNext();
        }
        return null;
    }

    /**
     * check if the table is empty
     * @return true if the table holds no elements; false otherwise
     */
    public boolean isEmpty() {
        return count == 0;
    }

    /**
     * return a String representation of the table
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < capacity; i++) {
            sb.append("Bucket ").append(i).append(": ");
            MyHashEntry<K, V> current = table.get(i);
            while (current != null) {
                sb.append(current.toString()).append(" -> ");
                current = current.getNext();
            }
            sb.append("null\n");
        }
        return sb.toString();
    }
}