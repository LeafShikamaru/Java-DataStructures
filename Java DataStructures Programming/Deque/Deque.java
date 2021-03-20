//5734454
//code based off what was taught in class and book. Anything copied 
//directly off powerpoints or book will show slide number or page number.

//deque based off deque class given in class
//chapter 3 section 7 the Queue ADT model
//slides 15 - 29 of week 4 powerpoints
public class Deque
{
   private int SIZE;
   private int[] list;
   private int front;
   private int rear;
   private int count;

        public Deque()
        {
            this.SIZE = 10;
            this.list = new int[this.SIZE];
            this.front = -1;
            this.rear = -1;
            this.count = 0;
        }

        public Deque(int size)
        {
            this.SIZE = size;
            this.list = new int[this.SIZE];
            this.front = -1;
            this.rear = -1;
            this.count = 0;
        }

        public boolean isEmpty()
        {
            return this.count == 0;
        }

        public void push(int x)
        {
            if(this.front == 0)
            {
                System.out.println("Number can't be pushed.");
            }else{
            if(this.front == -1)
            {
                this.front = 0;
                this.rear = 0;
            }else{
                this.front = this.front - 1;
            }
                list[this.front] = x;
                System.out.println("Number pushed: " + x);
                this.count = this.count + 1;
            } 
        }

        public int pop()
        {
            if(this.front > this.rear)
            {
                System.out.println("No number is remaining in the queue.");
            }else if (this.isEmpty()){
                System.out.println("No number is remaining in the queue.");
            }
            
            int z = this.list[this.front];
            this.front = this.front + 1;
            this.count = this.count - 1;
            return z;
        }
        
        public void inject(int x)
        {
            if (this.isEmpty()){
                this.front = 0;
            }

            if(this.rear + 1  > this.SIZE - 1)
            {
                    System.out.println("Max size was reached.");
                } else {
                    this.list[rear + 1] = x;
                    this.rear = rear + 1;
                    this.count = this.count + 1;
                    System.out.println("Number inserted:" + x);
            }
        }

        public int eject()
        {
            if(this.rear == -1)
            {
                System.out.println("Number cannot be removed.");
            }else{
                System.out.println("The number ejected is: " + list[this.front]);
            if(this.front == this.rear)
            {
                this.front = -1;
                this.rear = -1;
            }else{
                this.rear--;
            }
           this.count = this.count - 1; 
        }
            return this.count;
        }

        public int getFront()
        {
            if(this.front == -1)
            {
                System.out.println("There is no number at the front.");
            }else{
                System.out.println("Front number = " + list[this.front]);
            }
            
            System.out.println("Numbers in Queue:");
            return this.count;
        }

        public int getRear()
        {
            if(this.rear == -1)
            {
                System.out.println("There is no numbers at the back.");
            }else{
                System.out.println("Rear number = " + list[this.rear]);
            }
            
            System.out.println("Numbers in Queue:");
            return this.count;
        }
}