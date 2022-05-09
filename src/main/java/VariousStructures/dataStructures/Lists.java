package VariousStructures.dataStructures;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        List colors = new ArrayList();
        colors.add("blue");
        colors.add("purple");
        colors.add("pink");

        System.out.println(colors);
        System.out.println(colors.size());
        //returns a boolean if it contains the provided element
        System.out.println(colors.contains("pink"));
    }
}
