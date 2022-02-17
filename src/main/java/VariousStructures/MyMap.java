package VariousStructures;

import java.util.HashMap;
import java.util.Map;

public class MyMap {
    public static void main(String[] args) {
        //creating a map
        Map<Integer, Person> map = new HashMap<>();
        //insert into a map
        map.put(1, new Person("Lilly"));
        map.put(2, new Person("Mimi"));
        map.put(3, new Person("Nina"));
        map.put(3, new Person("Nina 2"));
        //the latest insert with the same key would override the previous key provided

        System.out.println(map);
        System.out.println(map.size());
        //getting the map by key number 1
        System.out.println(map.get(1));
        //checking weather it contain key number 4
        System.out.println(map.containsKey(4));
        //check the entries made
        System.out.println(map.entrySet());
        //displays the various(list of) keys
        System.out.println(map.keySet());

        map.entrySet().forEach(System.out::println);
        //looping with lambda
        map.entrySet().forEach(x -> System.out.println(x.getKey()+ " " + x.getValue()));

        // Or without  using the entrySet;
        map.forEach((key, person) -> {
            System.out.println(key + "-" + person);
        });

        map.remove(3);

        //to check if the key is present and insert a default person in there
        System.out.println(map.getOrDefault(3, new Person("Linda")));

    }

    record Person(String name){}
}
