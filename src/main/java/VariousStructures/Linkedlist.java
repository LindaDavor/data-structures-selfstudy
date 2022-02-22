package VariousStructures;
import java.util.*;

public class Linkedlist{
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<String>();

        //Adding elements to the Linked list
        list.add("Steve");
        list.add("Lilly");
        list.add("Richy");
        list.add("Nicky");
        list.add("Joe");
        System.out.println(list);

        //Adding an element to the first position
        list.addFirst("Sela");
        //Adding an element to the last position
        list.addLast("Mike");
        System.out.println("Linked list after addition is " + list);

        // removes first element / list.remove(0);
        //list.removeFirst();
        list.removeLast();
        System.out.println(list);

        //Adding an element to the 5th position
        list.add(4, "Jane");
        System.out.println("Item in position 5 is "+ list);

        //Iterating LinkedList
        Iterator<String> iterator=list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}