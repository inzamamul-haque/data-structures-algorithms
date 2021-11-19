/*
 * First In First Out (FIFO)
 */

/*
 *  A queue is a lot like a stack. A Queue is also a linear structure that follows a First In First Out (FIFO) order,
 * but they differ in how elements are removed. Queues are open from both ends: one end for inserting data (enqueue),
 * and the other end for removing data (dequeue). A stack is only open from one end.
 */


/*
 * Simplify: for a stack we remove the most recently added element,
 * but for a queue, we remove the “oldest” element.
 */

public class Queue {

    int[] array;
    int capacity;
    int currentSize;
    int top;
    int front;

    Queue(int capacity) {
        array = new int[capacity];
        this.capacity = capacity;
        this.currentSize = 0;
        this.top = -1;
        this.front = 0;
    }

    public void enqueue(int newItem) {
        if(currentSize == capacity) {
            throw new RuntimeException("Stack is Overflow");
        }
        array[++top] = newItem;
        currentSize++;
    }

    public int dequeue() {
        if(currentSize == 0) {
            throw new RuntimeException("Stack is Empty");
        }
        currentSize--;
        return array[front++];
    }

    public int getFirst() {
        if(currentSize == 0) {
            throw new RuntimeException("Stack is Empty");
        }

        return array[front];

    }

    public static void main(String[] args) {
        Queue queue = new Queue(4);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();


        System.out.println(queue.getFirst());
    }
}
