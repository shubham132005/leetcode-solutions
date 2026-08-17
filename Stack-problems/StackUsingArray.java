public class StackUsingArray {

    private int arr[];
    private int top;
    private int capacity;

    StackUsingArray(int capacity){
        this.capacity = capacity;
        this.arr = new int[capacity];
        this.top = -1;
    }

    void push(int data){
        if(top == capacity - 1){
            System.out.println("STACK overflow");
        }
        arr[++top] = data;
    }

    int pop(){
        if(top == -1){
            System.out.println("stack underflow");
            return -1;
        }
        return arr[top--];
    }

    int peek(){
        if(top == -1){
            System.out.println("stack is empty");
            return -1;
        }
        return arr[top];
    }

    boolean isEmpty(){
        return top == -1;
    }
    
}
