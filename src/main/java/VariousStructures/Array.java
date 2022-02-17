package VariousStructures;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        String[] colors = new String[5];
        colors[0] = "Red";
        colors[1] = "White";
        colors[2] = "Pink";

        System.out.println(Arrays.toString(colors));
        System.out.println(colors[2]);

        colors[1] = "Black";
        System.out.println(Arrays.toString(colors));

        //When the elements of the array is known
        int[] numbers = {25,800};

        //looping through arrays
        //1
        for (int i = 0; i < colors.length; i++){
            System.out.println(colors[i]);
        }
        //2
        for (int i = colors.length -1; i>=0; i--){
            System.out.println(colors[i]);
        }
        //3
        //1.enhance 'for loop'
        for(String color : colors){
            System.out.println(color);
        }
        //2.Method reference 'using Streams'
        Arrays.stream(colors).forEach(System.out::println);

        int counter = 1;
        for(String color : colors){
            System.out.println(counter++ +" " + color);
        }

//        Arrays.stream(colors).filter(color -> color("a")).collect()


    }
}
