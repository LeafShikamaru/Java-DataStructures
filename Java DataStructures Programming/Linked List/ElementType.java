//5734454
//all code based off what was taught in class anything copied will have slide number
public class ElementType
{
    public String identifier;
    public String access;
    
    public ElementType()
    {
        identifier = "";
        access = "";
    }
 
    public ElementType(String i, String a)
    {
        identifier = i;
        access = a;
    }
    
    //code given by professor in assignment files
    @Override
    public String toString()
    {
        return "[" + identifier + " | " + access + "]";
    }
    
}