package Array2D;
import java.util.*;
public class QueueUsing2Stack {
    static class Queue {
        static Stack<Integer> stack1 = new Stack<>();
        static Stack<Integer> stack2 = new Stack<>();

        public static boolean isEmpty() {
            return stack1.isEmpty();
        }
      //add
        public static void add(int val) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
            stack1.push(val);
            while (!stack2.isEmpty()) {
                stack1.push(stack2.pop());
            }
        }
        //remove
        public static int remove() {
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }
            return stack1.pop();
        }
     //peek
        public static int peek() {
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }
            return stack1.peek();
        }
    }

        public static void main(String [] args){
            Queue q1= new Queue();
            q1.add(1);
            q1.add(2);
            q1.add(3);
            q1.add(4);
            q1.add(5);

            while(!q1.isEmpty()){
                System.out.print(q1.peek() +" ");
                q1.remove();
            }
        }
    }

