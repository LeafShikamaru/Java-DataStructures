//5734454
//code based off what was taught in class and book. Anything copied 
//directly off powerpoints or book will show slide number or page number.

public class Main {

        public static void main(String[] args) {
                
                PriorityQueue queue = new PriorityQueue();
                queue.add(1);
                queue.add(3);
                queue.add(5);
                queue.add(7);
                queue.add(9);
                queue.add(2);
                queue.add(4);
                queue.add(6);
                queue.add(8);
                queue.add(10);
                
                System.out.println("Priority Queue: ");
                while(!queue.isEmpty())
                {
                    System.out.println(queue.max());
                    queue.removeMax();
                }
        }

}