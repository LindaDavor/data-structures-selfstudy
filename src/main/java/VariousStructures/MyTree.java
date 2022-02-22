package VariousStructures;

import java.util.TreeSet;

public class MyTree {
    public static void main(String[] args) {
        //setting tree set as a string type
        TreeSet<String> treeSet = new TreeSet<String>();
        //adding elements
        treeSet.add("play");
        treeSet.add("eat");
        treeSet.add("code");
        treeSet.add("sleep");
        treeSet.add("test");
        System.out.println(treeSet);

        //duplicating(set does not accept duplicates)
        treeSet.add("play");

        System.out.println("Tree set contains: ");
        for(String adj : treeSet){
            System.out.println(adj);
        }

        //setting tree set as integer type
        TreeSet<Integer> treeSet1 = new TreeSet<Integer>();

        treeSet1.add(25);
        treeSet1.add(45);
        treeSet1.add(15);
        treeSet1.add(02);
        treeSet1.add(75);
        System.out.println(treeSet1);
    }
}
