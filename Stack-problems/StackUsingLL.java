class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class StackUsingLL {

    Node top;

    int count;

    StackUsingLL(){
        
        top = null;
        count = 0;


    }

    void push(int data){
        Node newnode = new Node(data);
        if(top == null){
            top = newnode;
        }
        else{
            newnode.next = top;
            top = newnode;
        }
        count++;
    }

    int pop(){
        if(top == null){
            return -1;
        }
        Node temp = top;
        top = top.next;
        count--;
        return temp.data;
        
    }

    int peek(){
        if(top==null){
            return -1;
        }
        return top.data;
    }

    boolean isEmpty(){
        return top == null;
    }
    
}
