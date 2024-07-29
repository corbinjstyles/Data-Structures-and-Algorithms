import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();

        //add
        queue.offer("Corbs");

        queue.offer("Pete");

        queue.offer("Tom");

        queue.offer("Kyle");

        System.out.println(queue);

        System.out.println(queue.size());

        System.out.println(queue.isEmpty());

        System.out.println(queue.contains("Tom"));

        // remove (first out)
        System.out.println(queue.poll());

        //uses for queues:
        //1. keyboaard buffers (letters should appear on the screen in order they're pressed)
        //2. Printer Queue (Print jobs should be completed in order)
        //3. Used in LinkedLists, Proirity Queues, breadth-first search

    }
}
