import java.util.*;
public class QueueUsing2stacks {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    void enqueue(int data){
        s1.push(data);
    }

    int dequeue(){
        if (s1.isEmpty() && s2.isEmpty()) {
            return -1;
        }
        if(s2.isEmpty()){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }

    int peek(){
        if (s1.isEmpty() && s2.isEmpty()) {
            return -1;
        }
        if(s2.isEmpty()){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }
        return s2.peek();
    }

    boolean isEmpty(){
        return s1.isEmpty() && s2.isEmpty();
    }
}
