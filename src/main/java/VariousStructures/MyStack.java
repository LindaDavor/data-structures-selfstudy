package VariousStructures;
import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Me");
        stack.push("Martha");
        stack.push("Micheal");
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.size());
        System.out.println(stack.peek());
        System.out.println(stack.search("Me"));
       // System.out.println(stack.search("Lina"));

    }
}
