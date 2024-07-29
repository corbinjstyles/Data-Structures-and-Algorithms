import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueues {
    public static void main(String[] args) {
        Queue<Double> queue = new PriorityQueue<>();

        queue.offer(3.0);
        queue.offer(2.5);
        queue.offer(4.0);
        queue.offer(1.5);
        queue.offer(2.0);

        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }

        Queue<Double> queueRev = new PriorityQueue<>(Collections.reverseOrder());

        queueRev.offer(3.0);
        queueRev.offer(2.5);
        queueRev.offer(4.0);
        queueRev.offer(1.5);
        queueRev.offer(2.0);

        while(!queueRev.isEmpty()){
            System.out.println(queueRev.poll());
        }

        Queue<String> queueS = new PriorityQueue<>();

        queueS.offer("F");
        queueS.offer("A");
        queueS.offer("B");
        queueS.offer("D");
        queueS.offer("C");

        while(!queueS.isEmpty()){
            System.out.println(queueS.poll());
        }
    }   
}
