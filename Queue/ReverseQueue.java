
package Queue;

import java.util.LinkedList;
import java.util.Queue;


public class ReverseQueue {

    public static void reversQueue(Queue<Integer> que) {
        if (que.isEmpty()) {
            return;
        }
        //Remove the front element from the queue
        int front = que.poll();

          // Recursively reverse the remaining queue
          reversQueue(que);

        // Add the front element back after the remaining queue is reversed
        que.add(front);

    }
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        
        // Enqueue elements
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);

        System.out.println("Original Queue: " + queue);

        // Reverse the queue
        reversQueue(queue);

        System.out.println("Reversed Queue: " + queue);
    }
}
