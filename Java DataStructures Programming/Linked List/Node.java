//5734454
//all code based off what was taught in class anything copied will have slide number
public class Node
{
//based off week 8,9 slides page 5-7 and prog13_01
    private ElementType info;
    private Node next;
    
    public Node()
    {
        info = new ElementType();
        next = null;
    }
    
    public ElementType getInfo()
    {
        return info;
    }
    
    public Node getNext()
    {
        return next;
    }
    
    public void setInfo(ElementType x)
    {
        info = x;
    }
    
    public void setNext(Node l)
    {
        next = l;
    }
    
}