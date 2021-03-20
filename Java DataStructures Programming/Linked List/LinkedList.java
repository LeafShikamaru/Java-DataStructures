//5734454
//all code based off what was taught in class anything copied will have slide number
public class LinkedList
{
    private final Node first;
    
    //copied from week 3 slides page 10
    public LinkedList()
    {
        first = new Node();
    }
    
    public void add(ElementType x)
    {
        Node p;
        p = new Node();
        
        p.setInfo(x);
        p.setNext(first.getNext());
        
        first.setNext(p);
    }
    
    //code based from week 3 slides page 17
    public void remove(String x)
    {
        Node old;
        old = first.getNext();
        Node p;
        p = first;
        
        boolean found;
        found = false;
        
        while (!found && null != old)
        {
            if (!old.getInfo().identifier.equalsIgnoreCase(x))
            {
                p = old;
                old = p.getNext();
            }else{
                found = true;
            }
        }
        
        if (!found)
        {
        }else{
            p.setNext(old.getNext());
        }
    }
    
    //copied from week 3 slides page 10
    public boolean isEmpty()
    {
        return (first.getNext() == null);
    }
    
    //code based from week 3 page 13
    public boolean search(String x)
    {
        Node current;
        current = first.getNext();

        while (null != current)
        {
            if (!current.getInfo().identifier.equalsIgnoreCase(x))
            {
            }else{
                return true;
            }
            current = current.getNext();
        }
        return false;
    }
    
    //code given by professor in assignment files
    @Override
    public String toString()
    {
        Node current = first.getNext();

        String str = "";
        while (current != null)
        {
            str += current.getInfo() + " -> ";
            current = current.getNext();
        }
        return str;
    }
}