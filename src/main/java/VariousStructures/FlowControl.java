package VariousStructures;

public class FlowControl {
    public static void main(String[] args) {
        int num = 22;
        int v = 20;
        if (num < 5) {System.out.println("Hi");}
        else if (22 < 8){System.out.println("Hi there");}
        else{ System.out.println("Hello");}

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
        while (num>5){
            System.out.println(num);
        }

    }
}
