/*  question- Implement your own hashmap with the following methods
 * 1- Put(key,value)
 *    returns void, inserts/updates
 * 2- Get(key)
 *    returns value corresponding to the key if it exists
 *    returns null if the key doesn't exist
 * 3- Size
 *     returns the number of entries in the Hashmap
 * 4- Removes(key)
 *    removes an entry with the key "key" from the hashmap
 *    returns null or value
 * Both the keys and values can be of any type
 */
import java.util.*;

public class OwnHashmap {

    static class MyHashMap<K, V> {
        public static final int DEFAULT_CAPACITY = 4;
        public static final float DEFAULT_LOAD_FACTOR = 0.75f;

        private int n; // the number of entries in the map
        private LinkedList<Node>[] buckets;

        public MyHashMap() {
            initBuckets(DEFAULT_CAPACITY);
        }

        public int capacity()
        {
            return buckets.length;
        }

        public float load()
        {
            return (n*1.0f)/ buckets.length;
        }
        private void rehash()
        {
            LinkedList<Node>[] oldBuckets = buckets;   
            initBuckets(oldBuckets.length *2);  
            n=0;
            for(var bucket : oldBuckets)
            {
                for(var node:bucket)
                {
                    put(node.key, node.value);
                }
            }

        }

        @SuppressWarnings("unchecked")
        private void initBuckets(int N) {
            // capacity/size of bucket array
            buckets = (LinkedList<Node>[]) new LinkedList[N];
            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }
        }

        private int HashFunc(K key) {
            int hc = key.hashCode();
            return (Math.abs(hc)) % buckets.length;
        }

        private int SearchInBucket(LinkedList<Node> ll, K key) {
            for (int i = 0; i < ll.size(); i++) {
                if (ll.get(i).key.equals(key)) { // Use equals() for comparing keys
                    return i;
                }
            }
            return -1;
        }

        public int size() {
            return n;
        }

        public void put(K key, V value) {
            int bi = HashFunc(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = SearchInBucket(currBucket, key);
            if (ei == -1) { // Key not found, add new entry
                Node node = new Node(key, value);
                currBucket.add(node);
                n++;
            } else { // Key found, update value
                Node currNode = currBucket.get(ei);
                currNode.value = value; // Update value for existing key
            }

            if(n>= buckets.length * DEFAULT_LOAD_FACTOR)
            {
                rehash();
            }
        }

        public V get(K key) {
            int bi = HashFunc(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = SearchInBucket(currBucket, key);
            if (ei != -1) {
                Node currNode = currBucket.get(ei);
                return currNode.value;
            } else {
                return null;
            }
        }

        public V remove(K key) {
            int bi = HashFunc(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = SearchInBucket(currBucket, key);
            if (ei != -1) {
                Node currNode = currBucket.get(ei);
                V val = currNode.value;
                currBucket.remove(ei);
                n--;
                return val;
            }
            return null;
        }

        private class Node {
            K key;
            V value;

            Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }
    }

    public static void main(String args[]) {
        MyHashMap<String, Integer> mp = new MyHashMap<>();
        System.out.println("Testing put");
        mp.put("a", 1);
        mp.put("b", 2);
        mp.put("c", 3);
        mp.put("d", 4);
        mp.put("e", 5);
        System.out.println("size: " + mp.size());

        mp.put("c",30);
        System.out.println("Testing size"+ mp.size( ));
        System.out.println(mp.get("a"));
        System.out.println(mp.get("e"));
        System.out.println(mp.get("d"));
        System.out.println(mp.get("dd"));

        System.out.println(mp.remove("c"));
        System.out.println(mp.remove("c"));

        System.out.println("capacity" + mp.capacity());
        System.out.println("Load" +mp.load());


    }
}
