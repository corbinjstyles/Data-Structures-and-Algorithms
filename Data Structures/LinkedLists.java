import java.util.LinkedList;

public class LinkedLists {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();

        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");
        System.out.println(linkedList);
        linkedList.add(4, "E");
        System.out.println(linkedList);

        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());
        linkedList.addFirst("0");
        linkedList.addLast("G");

        System.out.println(linkedList);

        String first = linkedList.removeFirst();
        String last = linkedList.removeLast();
        System.out.println(first+last);
        System.out.println(linkedList);

        // uses for LinkedList:
        // GPS, implement stacks/queues, music playlist
    }
}
