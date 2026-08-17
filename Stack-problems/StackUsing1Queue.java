import java.util.*;
public class StackUsing1Queue {
    
    Queue<Integer> q;

    public StackUsing1Queue(){
        q = new LinkedList<>();
    }

    void push(int data){
        q.offer(data);
        int size = q.size();
        for(int i = 0 ; i <size-1 ; i++){
            q.offer(q.poll());
        }
    }

    int pop(){
        return q.poll();
    }

    int peek(){
        return q.peek();
    }

    boolean isEmpty(){
        return q.isEmpty();
    }
    
}
