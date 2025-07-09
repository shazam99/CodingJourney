package DesignPatterns;

import java.util.LinkedHashMap;
import java.util.Map;

// LRU Cache implementation
public class LRUCache<K,V> extends LinkedHashMap<K,V> {

    private static final int capacity = 5;

    public LRUCache(){
        super(capacity, 0.75f, true);
    }
    /**
     * This method is called after inserting a new entry into the map.
     * Returns true if the eldest entry should be removed (when size exceeds 5)
     *
     * @param eldest The least recently used entry
     * @return true if size exceeds capacity (5)
     */
    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return this.size() > capacity;
    }
    /**
     * Retrieve a value from the cache.
     * If the key exists, it will be moved to the end (most recently used)
     *
     * @param key The key to lookup
     */
    public V getValue(K key) {
        return super.get(key);
    }
    /**
     * Insert or update a key-value pair in the cache.
     * If key exists, its value is updated and moved to most recently used position.
     *
     * @param key   The key to insert or update
     * @param value The value to associate with the key
     */
    public void putValue(K key, V value) {
        super.put(key, value);
    }
    /**
     * Display the contents of the cache in order from least to most recently used.
     */
    public void displayCache() {
        System.out.println(super.toString());
    }

    public static void main(String[] args) {
        // Create an LRU Cache with capacity 5
        LRUCache<Integer, String> cache = new LRUCache<>();

        // Add key-value pairs
        cache.putValue(1, "One");
        cache.putValue(2, "Two");
        cache.putValue(3, "Three");
        cache.putValue(4, "Four");
        cache.putValue(5, "Five");

        cache.displayCache();  // {1=One, 2=Two, 3=Three, 4=Four, 5=Five}

        // Access key 3 (makes it most recently used)
        cache.get(3);
        cache.displayCache();  // {1=One, 2=Two, 4=Four, 5=Five, 3=Three}

        // Add another key (this should evict least recently used key 1)
        cache.putValue(6, "Six");
        cache.displayCache();  // {2=Two, 4=Four, 5=Five, 3=Three, 6=Six}

        // Access key 4 (makes it most recently used)
        cache.get(4);
        cache.displayCache();  // {2=Two, 5=Five, 3=Three, 6=Six, 4=Four}

        // Add another key (this should evict least recently used key 2)
        cache.putValue(7, "Seven");
        cache.displayCache();  // {5=Five, 3=Three, 6=Six, 4=Four, 7=Seven}

        System.out.println(cache.get(7));

        System.out.println(cache.firstEntry());
    }
}

