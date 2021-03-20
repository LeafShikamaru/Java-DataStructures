//5734454
//code based off what was taught in class and book. Anything copied 
//directly off powerpoints or book will show slide number or page number.

class PriorityQueue
{
    //node class copied from linkedList.java provided in class
    class Node
{
    private int info;
    private Node next;
    private Node prev;

    public Node()
    {
        this.info = 0;
        this.next = null;
        this.next = this.prev = null;
    }

    public void setInfo(int i)
    {
        this.info = i;
    }

    public void setNext(Node p)
    {
        this.next = p;
    }
    
    public void setPrev(Node p)
    {
        this.prev = p;
    }

    public int getInfo()
    {
        return this.info;
    }

    public Node getNext()
    {
        return this.next;
    }
    
    public Node getPrev()
    {
        return this.prev;
    }
}
        private Node first;
        private Node last;
        
        //priority queue based of queue.java provided in class
        //chapter 3 section 7 the Queue ADT model
        //slides 15 - 29 of week 4 powerpoints
        public PriorityQueue()
        {
                this.first = this.last = null;
        }

        public boolean isEmpty()
        {
                return this.first == null;
        }

        public void add(int x)
        {
            Node node = new Node();
            node.setInfo(x);
            
            if(isEmpty())
            {
                    this.first = node;
                    this.last = node;
            }else if(this.first.getInfo() > node.getInfo()){
                    node.setNext(this.first);
                    this.first.setPrev(node);
                    this.first = node;
             }else{
                    Node current = this.first;
                    
                    while(current != null)
                    {
                           if(current.getInfo() > node.getInfo())
                           {
                                 node.setNext(current);
                                 node.setPrev(current.getPrev());
                                 current.getPrev().setNext(node);
                                 current.setPrev(node);
                                 return;
                           }
                          
                           current = current.getNext();
                    }
                   
                    this.last.setNext(node);
                    node.setPrev(this.last);
                    this.last=node;
             }
        }

        public int max()
        {
                if(isEmpty())
                {
                        return -1;
                }else{
                        return this.first.getInfo();
                }
        }

        public void removeMax()
        {
           this.first = this.first.getNext();
             if(this.first == null)
                    this.last = null;
       }
}