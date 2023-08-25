// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.


public class Main {
    public static void main(String[] args) {
        ArrayStack<Integer> s1 = new ArrayStack<> (3);
        ArrayQueue<Integer> s2 = new ArrayQueue<> (3);
        s1.push(10);
        s1.push(20);
        s1.push(30);

        s2.enqueue(10);
        s2.enqueue(20);
        s2.enqueue(30);

        System.out.println("s1 after pushing: " +s1);

        s1.pop();

        System.out.println("s1 after popping 1 element: " +s1);

        System.out.println("Current top element of s1: "+ s1.peek());

        System.out.println("s2 after enqueuing: "+s2);

        s2.dequeue();

        System.out.println("s2 after dequeuing 1 element:" + s2);

        System.out.println("Current first element of s2: "+s2.peek());
    }
}