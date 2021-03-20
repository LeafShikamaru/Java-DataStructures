//5734454
//code based off what was taught in class and book. Anything copied 
//directly off powerpoints or book will show slide number or page number.

public class Main
{
    public static void main(String[] args) {
        Main();
    }

    public static void Main() {
        Deque deque = new Deque(10);
        System.out.println(deque.isEmpty());
        deque.push(1);
        deque.inject(2);
        deque.inject(3);
        deque.inject(4);
        deque.inject(5);
        System.out.println(deque.isEmpty());
        System.out.println(deque.getFront());
        System.out.println(deque.getRear());
        deque.pop();
        System.out.println("After pop:");
        System.out.println(deque.getFront());
        System.out.println(deque.getRear());
        deque.eject();
        System.out.println("After eject:");
        System.out.println(deque.getFront());
        System.out.println(deque.getRear());
    }
}