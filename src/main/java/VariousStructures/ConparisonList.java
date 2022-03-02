package VariousStructures;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ConparisonList {
    public static void main(String[] args) {
        int [] ints = new int[] {1,4,8,2};
        List<Integer> list1 = new ArrayList<>();
        list1.add(5);
        list1.add(8);
        list1.add(2);
        //This will searching through a contiguous array({1,4,8,2})
        System.out.println(list1);

        //has fix size
        String[] names = new String[3];
        ArrayList<String> nameArray = new ArrayList<>();
        nameArray.add("Lilly");
        nameArray.add("Julius");
        nameArray.add("Fred");
        System.out.println(nameArray.get(1));


        List<Integer> list2 = new LinkedList<>();
        list2.add(15);
        list2.add(54);
        list2.add(7);
        System.out.println(list2);

        LinkedList<String> nameLink = new LinkedList<>();
        nameLink.add("Kofi");
        nameLink.add("Joan");
        System.out.println(nameLink.get(1));
        nameLink.add(0,"John");
        System.out.println(nameLink);
    }
}
