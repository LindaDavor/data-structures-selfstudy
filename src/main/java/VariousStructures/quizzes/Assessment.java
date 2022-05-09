package VariousStructures.quizzes;

public class Assessment {
    //returning an integer and taking an integer
    public static int mass(int m) {
        int result = m/3;
        double ans = Math.floor(result);
        int i= (int)ans;
        return i-2;
    }
    public static void main(String[] args) {
       System.out.println(mass(12));
       System.out.println(mass(14));
       System.out.println(mass(1969));
       System.out.println(mass(100756));
    }

}
