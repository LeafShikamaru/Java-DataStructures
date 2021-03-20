//5734454
//code based off what was taught in class and book. Anything copied 
//directly off powerpoints or book will show slide number or page number.

class Main{

    public Main(){
    }

        public static void main(String[] args)
        {
            Stack stack = new Stack();
            stack.push(1);
            stack.push(2);
            stack.push(3);
            stack.push(4);
            stack.push(5);
            stack.push(6);
            stack.push(7);
            stack.push(8);
            stack.push(9);
            stack.push(10);
            stack.pop();
            
            while (!stack.isEmpty())
            {
                System.out.println(stack.peek());
                stack.pop();
            }
    }
}