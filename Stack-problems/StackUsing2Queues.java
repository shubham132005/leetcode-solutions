public class StackUsing2Queues {
    
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();


    void push(int data){
        q2.add(data);
    }
    while(!q1.isEmpty()){
        q2.offer(q1.poll());
    }

}
