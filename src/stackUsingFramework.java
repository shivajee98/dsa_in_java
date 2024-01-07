import java.util.*;

public class stackUsingFramework {

    public static void pushAtBottom(int data, Stack<Integer> stack){
        if(stack.isEmpty()){
            stack.push(data);
            return;
        }
        int top = stack.pop();
        pushAtBottom(data, stack);
        stack.push(top);
    }
    public static void reverse(Stack<Integer> stack){
        if(stack.isEmpty()){
            return;
        }
        int top = stack.pop();
        reverse(stack);
        pushAtBottom(top, stack);
    }


    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();
        stack.push(26);
        stack.push(24);
        stack.push(22);
        pushAtBottom(34, stack);
        reverse(stack);
        while (!stack.isEmpty()){
            System.out.println(stack.peek());
            stack.pop();
        }
        reverse(stack);
        while (!stack.isEmpty()){
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}
