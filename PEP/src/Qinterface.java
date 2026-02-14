//import java.util.LinkedList;
//import java.util.Queue;
//
//public class Qinterface{
//    public static void main(String[] args) {
//        Queue<Integer> que = new LinkedList<>();
//        que.add(9);
//        que.add(7);
//        que.add(3);
//        que.add(2);
//        que.add(6);
//        System.out.print(DifferenceOfMaxAndMin(que));
//    }
//    public static int DifferenceOfMaxAndMin(Queue<Integer> que){
//        int min = Integer.MAX_VALUE;
//        int max = Integer.MIN_VALUE;
//        while(!que.isEmpty()){
//            int ele = que.poll();
//            if(min > ele){
//                min = ele;
//            }
//            if(ele > max) {
//                max = ele;
//            }
//        }
//        return max-min;
//    }
//}

//write a java code for finding the kth smallest element in a queue?
//import java.util.*;
//
//public class Qinterface {
//    public static Queue<Integer> reverseKLast(Queue<Integer> que, int k) {
//        if (que.isEmpty() || k <= 0 || k > que.size()) {
//            return que;
//        }
//
//        int n = que.size() - k;
//
//        // Shift first (n) elements to the back of the queue
//        for (int i = 0; i < n; i++) {
//            que.add(que.poll());
//        }
//
//        // Push last k elements to a stack
//        Stack<Integer> stack = new Stack<>();
//        for (int i = 0; i < k; i++) {
//            stack.push(que.poll());
//        }
//
//        // Pop from stack and add back to queue (reversing order)
//        while (!stack.isEmpty()) {
//            que.add(stack.pop());
//        }
//
//        // Move (n) elements back to the front to maintain original order
////        for (int i = 0; i < n; i++) {
////            que.add(que.poll());
////        }
//
//        return que;
//    }
//
//    public static void main(String[] args) {
//        Queue<Integer> que = new LinkedList<>();
//        que.add(1);
//        que.add(2);
//        que.add(3);
//        que.add(4);
//        que.add(5);
//
//        int k = 3;
//
//        System.out.println("Original Queue: " + que);
//        Queue<Integer> result = reverseKLast(que, k);
//        System.out.println("Modified Queue: " + result);
//    }
//}

