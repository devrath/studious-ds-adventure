package queue.programs;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {

    public static void main(String[] args){
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);

        reverse(queue);
    }

    public static void reverse(Queue<Integer> queue){
        Stack<Integer> stackInt = new Stack<>();

        while (!queue.isEmpty()){
            stackInt.push(queue.remove());
        }

        StringBuffer strBuff = new StringBuffer();

        while (!stackInt.isEmpty()){
            queue.add(stackInt.pop());
        }

        System.out.println(queue);
    }

}
