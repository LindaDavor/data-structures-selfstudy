package VariousStructures;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;
import java.util.Iterator;
import java.util.Map;

public class MyHashtable {
    public static void main(String[] args) {
        Enumeration names;
        String key;

        // creating an instance of the hashtable
        Hashtable<String, String> hashtable = new Hashtable<String,String>();

        //adding keys & values to hashtable
        hashtable.put("A","Mango");
        hashtable.put("B","Apple");
        hashtable.put("C","Pear");
        hashtable.put("D","Grapes");
        hashtable.put("E","Strawberry");

        System.out.println("Hashtable contains: "+ hashtable);

        //removing key-value pairs for key B
        Object removedValue = hashtable.remove("B");
        System.out.println(hashtable);

        // displaying the various key and value pairs
        names = hashtable.keys();
        while (names.hasMoreElements()) {
            key = (String) names.nextElement();
            System.out.println("This is the Key "+ key + " & value is "+ hashtable.get(key));
        }

        //method returning the size of a hashtable
        System.out.println("The size of Hashtable: " + hashtable.size());

        //get a set of the entries
        Set set = hashtable.entrySet();

        //get an iterator
        Iterator i = set.iterator();
        //display elements
        while (i.hasNext()){
            Map.Entry fruit = (Map.Entry)i.next();
            System.out.println(fruit.getKey() +": " + fruit.getValue());
        }

    }

}

