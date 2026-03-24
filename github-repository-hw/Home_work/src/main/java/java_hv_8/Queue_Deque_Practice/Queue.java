package java_hv_8.Queue_Deque_Practice;

import java.util.LinkedList;

public class Queue {
    public static void main(String[] args) {

        java.util.Queue<String> queue = new LinkedList<>();

        System.out.println("Adding elements with offer()");
        queue.offer("One");
        queue.offer("Two");
        queue.offer("Three");

        System.out.println(queue);

        System.out.println("element() - get first element WITHOUT removing");
        System.out.println(queue.element());

        System.out.println("peek() - get first element WITHOUT removing (safe version)");
        System.out.println(queue.peek());

        System.out.println("poll() - get and REMOVE first element");
        System.out.println(queue.poll());

        System.out.println("Queue after poll:");
        System.out.println(queue);

        System.out.println("remove() - get and REMOVE first element (error if empty)");
        System.out.println(queue.remove());

        System.out.println("Queue after remove:");
        System.out.println(queue);

        System.out.println("Queue size:");
        System.out.println(queue.size());
    }
}