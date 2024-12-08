package Queue;

class Queue {
    int[] queue;
    int front, rear, capacity;

 //Constructor
 public Queue(int n) {
     capacity = n;
     queue = new int[capacity];
     front = 0; // start the Queue
     rear = -1; // End the Queue

 }

 //Check if the Queue is full
 public boolean isFull() {
     return rear == capacity - 1;
 }
    
 //Check if the Queue is empty
    public boolean isEmpty() {
        return rear < front;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return Integer.MIN_VALUE;
        }
        return queue[front];
    }
 //Insert an Element into the Queue
 public void enqueue(int item) {
     if (isFull()) {
         System.out.println("Queue is full!");
         return;
     }

     rear++;
     queue[rear] = item;
     System.out.println(item + " inserted to the Queue");
 }
    
 //Delete an Element from the Queue
 public int dequeue() {
     if (isEmpty()) {
         System.out.println("Queue is empty");
         return -1;
     }
     int item = queue[front];
     front++;
     return item;
 }
}
public class Main {
    public static void main(String[] args) {
        Queue que = new Queue(6);

        que.enqueue(10);
        que.enqueue(20);
        que.enqueue(30);
        System.out.println("Front Element: " + que.peek());

        que.dequeue();
        que.dequeue();

        System.out.println("Front Element: " + que.peek());

        que.enqueue(40);
        que.enqueue(50);
        que.enqueue(60);
        que.enqueue(70);
        
    }
}
