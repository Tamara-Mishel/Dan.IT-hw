package java_hv_8.Queue_Deque_Practice;

import java.util.ArrayDeque;

public class Deque {
    public static void main(String[] args) {

        java.util.Deque<String> deque = new ArrayDeque<>();

        System.out.println("Adding elements to front and back");

        deque.addFirst("A");
        deque.addLast("B");
        deque.addLast("C");

        System.out.println(deque);

        System.out.println("peekFirst() - get first element without removing");
        System.out.println(deque.peekFirst());

        System.out.println("peekLast() - get last element without removing");
        System.out.println(deque.peekLast());

        System.out.println("pollFirst() - remove first element");
        System.out.println(deque.pollFirst());

        System.out.println("pollLast() - remove last element");
        System.out.println(deque.pollLast());

        System.out.println("Deque after removing:");
        System.out.println(deque);

        System.out.println("push() - add element to front (stack behaviour)");
        deque.push("X");

        System.out.println(deque);

        System.out.println("pop() - remove first element (stack)");
        deque.pop();

        System.out.println(deque);
    }
}
