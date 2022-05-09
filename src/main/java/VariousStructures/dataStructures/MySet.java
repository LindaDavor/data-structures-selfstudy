package VariousStructures.dataStructures;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class MySet {
    public static void main(String[] args) {
        Set<Bag> bag = new HashSet<>();
        bag.add(new Bag("Yellow"));
        bag.add(new Bag("Red"));
        bag.add(new Bag("Blue"));
        bag.add(new Bag("Grey"));
        bag.add(new Bag("Blue"));
        bag.remove(new Bag("Red"));
        //Set doesn't allow duplicates so the size will still be 3.
        System.out.println(bag.size());
        //iterator
        bag.forEach(System.out::println);
    }
    //record Bag(String color){}
//in order to use set correctly(without using 'record'), you need to override the equals method
    static class Bag {
        String color;
        public Bag(String color) {
            this.color = color;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Bag bag = (Bag) o;
            return Objects.equals(color, bag.color);
        }

        @Override
        public int hashCode() {
            return Objects.hash(color);
        }
    }
}