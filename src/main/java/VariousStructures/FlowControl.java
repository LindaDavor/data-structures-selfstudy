package VariousStructures;

import java.util.ArrayList;
import java.util.Scanner;

public class FlowControl {
    public static void main(String[] args) {
        int num = 22;
        boolean isTrue = false;
        int v = 2;

        if (num < 5) {System.out.println("Hi");}
        else if (22 < 8){System.out.println("Hi there");}
        else{ System.out.println("Hello");}

        if (isTrue){
            System.out.println(v + 4 );
        }
        else {
            System.out.println(v - 1);
        }

        //ternary operator(short-hand for "if-else" statement)
        String result = (v==18)? "Am here" : "Please leave";
        System.out.println(result);
        System.out.println("************************");
        //switch statement
        int day = 2;
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Friday");
                break;
            default:
                System.out.println("You are lost buddy");
        }
        System.out.println("***************");
        //while loop
//        while (num>5){
//            System.out.println(num);
//        }
        while (v <= 5){
            System.out.println(v);
            v++;
        }
        //Let's loop per user entry
        int startNum,endNum;
        Scanner input = new Scanner(System.in);

        System.out.println("Pleas enter the first number for the loop: ");
        startNum = input.nextInt();

        System.out.println("Please enter the last num ber for the loop: ");
        endNum = input.nextInt();
        for(int i=startNum; i<endNum; i++){
            System.out.println(i);
        }

        int loopcount;
        System.out.println("Please enter the number of times you want this loop to run: ");
        loopcount = input.nextInt();
        int i = 0;
        while (i< loopcount){
            System.out.println("Hi Siobhan, you have been missed.");
            i++;
        }
        //storing words of a sentence into an Array
        String mysentence = "Always remember, you need to work harder my dear";
        //to get the individual words
        Scanner scan = new Scanner(mysentence);
        ArrayList<String> words = new ArrayList<String>();
        //while the scanner has the next word....
        while (scan.hasNext()){
            words.add(scan.next());
        }
        System.out.println(words);
    }
}
