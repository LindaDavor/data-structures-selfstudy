package VariousStructures;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {

        Queue<Person> Party = new LinkedList<>();
        Party.add(new Person("Zazzy", 30));
        Party.add(new Person("Linda", 21));
        Party.add(new Person("Sey", 15));

        //peek returns the very first element in the queue
        System.out.println(Party.peek());
        System.out.println(Party.size());
        //returns(retrieves) the first element and also removes it from the queue
        System.out.println(Party.poll());
        System.out.println(Party.size());

    }

    static record Person(String name, int age){}
}
