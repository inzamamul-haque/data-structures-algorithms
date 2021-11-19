/*
 * Last In First Out (FIFO)
 * The pop method removes or deletes elements from the stack,
 * while the push method adds items to the stack.
 */

public class Stack {

    int[] array;
    int capacity;
    int currentSize;
    int top;

    Stack(int capacity) {
        this.capacity = capacity;
        this.top = -1;
        array = new int[capacity];
        currentSize = 0;
    }

    public void push(int newItem) {
        if(currentSize == capacity) {
            throw new RuntimeException("Stack is Overflow");
        }
        array[++top] = newItem;
        currentSize++;
    }

    public int pop() {
        if(currentSize == 0) {
            throw new RuntimeException("Stack is Empty");
        }
        currentSize--;
        return array[top--];
    }

    public int peek() {
        if(currentSize == 0) {
            throw new RuntimeException("Stack is Empty");
        }
        return array[top];
    }

    public static void main(String[] args) {
        Stack stack = new Stack(4);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        stack.pop();
        stack.pop();
        stack.pop();
       // stack.pop();

        System.out.println(stack.peek());
    }
}
