package VariousStructures.differences;

import java.util.*;

public class ComparisonHash {
    public static void main(String[] args) {
        //created a hashmap object
        HashMap<String,String> map = new HashMap<String,String>();
        map.put("key", null);
        map.put(null, null);
        map.put("key2", null);
        map.put(null, "key3");
        System.out.println(map);

        //trying to modify a hashmap whilst iterating(it will throw a concurrent exception)
        Iterator<String> iterator = map.keySet().iterator();
        while (iterator.hasNext()){
            iterator.next();
            map.put("key6", "value5");
        }

        //how to make a hashmap synchronized
       // map = Collections.synchronizedMap(map);

// Comparing to see if hashtable takes null keys or values (It will throw a null pointer exception)
        //created a hashtable object
        Hashtable<String, String> hashtable = new Hashtable<String,String>();
        hashtable.put(null, null);
        System.out.println(hashtable);

        //adding an element while iterating(wouldn't throw an exception)
        hashtable.put("a", "Apple");
        hashtable.put("b", "Ball");
        hashtable.put("1", "Tree");
        Enumeration item = hashtable.elements();

        while (item.hasMoreElements()){
            System.out.println(item.nextElement());
            hashtable.put("2", "Man");
        }
    }
}
