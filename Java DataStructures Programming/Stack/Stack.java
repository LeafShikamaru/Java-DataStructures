//5734454
//code based off what was taught in class and book. Anything copied 
//directly off powerpoints or book will show slide number or page number.

class Stack
{
    //node class copied from linkedList.java provided in class
    class Node
    {
        private int info;
        private Node next;

        public Node()
        {
            this.info = 0;
            this.next = null;
        }

        public void setInfo(int i)
        {
            this.info = i;
        }

        public void setNext(Node l)
        {
            this.next = l;
        }

        public int getInfo()
        {
            return this.info;
        }

        public Node getNext()
        {
            return this.next;
        }
    }

        private Node first;
        
        //stack class based from Stack.java provided in class
        //chapter 3 section 6 the Stack ADT model
        //slides 5 - 8 of week 4 powerpoints
        public Stack()
        {
            this.first = null;
        }

        public boolean isEmpty()
        {
            return this.first == null;
        }

        public void push(int x)
        {
            Node n = new Node();
            n.setInfo(x);
            n.setNext(this.first);
            this.first = n;
        }

        public void pop()
        {
            this.first = this.first.getNext();
        }

        public int peek()
        {
            return this.first.getInfo();
        }
}