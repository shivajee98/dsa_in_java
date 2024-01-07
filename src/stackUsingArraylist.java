import java.lang.reflect.Array;
import java.util.ArrayList;

public class stackUsingArraylist {

    static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty(){
            return list.size() == 0;
        }
        public static void push(int data){
            list.add(data);
        }
        public static int pop() {
            if(isEmpty()){
                return -1;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }
        public static int peek(){
            if (isEmpty()){
                return -1;
            }
            return list.get(list.size() - 1);
        }
    }

    public static void main(String[] args){
        stackUsingLinkedList.Stack stack = new stackUsingLinkedList.Stack();
        stack.push(42);  // Replace 42 with the actual data you want to push onto the stack
        stack.push(43);  // Replace 42 with the actual data you want to push onto the stack
        stack.push(45);  // Replace 42 with the actual data you want to push onto the stack
        stack.push(48);
        while (!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
        }

    }
}
