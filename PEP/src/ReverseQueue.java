//import java.util.*;
//
//public class ReverseQueue {
//    public static void main(String[] args) {
//        Queue<Integer> queue = new LinkedList<>();
//        queue.add(1);
//        queue.add(2);
//        queue.add(3);
//        queue.add(4);
//        queue.add(5);
//
//        queue = reverseQueue(queue);
//
//        while (!queue.isEmpty()) {
//            System.out.print(queue.poll() + " ");
//        }
//    }
//    public static Queue<Integer> reverseQueue(Queue<Integer> queue) {
//        Stack<Integer> stack = new Stack<>();
//        while (!queue.isEmpty()) {
//            stack.push(queue.poll());
//        }
//        while (!stack.isEmpty()) {
//            queue.add(stack.pop());
//        }
//        return queue;
//    }
//}
