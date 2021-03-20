//5734454
//all code based off what was taught in class anything copied will have slide number
public class SymbolTable
{
 
    private final LinkedList[] table;
    private final int TABLESIZE = 13;
    private final int HASHCONSTANT = 37;
    
    public SymbolTable()
    {
        table = new LinkedList[TABLESIZE];
        
        for(int i = 0; i < TABLESIZE; i++)
        {
            table[i] = new LinkedList();
        }
    }
    
    //based off week 10 slides page 14
    private int hash(String key)
    {
        int hashVal = 0;
        
        for(int i = 0; i < key.length(); i++)
        {
            hashVal = key.charAt(i) + hashVal * HASHCONSTANT;
        }
        
        hashVal %= TABLESIZE;
        
        if(hashVal < 0)
        {
            hashVal += TABLESIZE;
        }
        return hashVal;
    }
    
    //based off week 10 slides page 14
    public void add(ElementType e)
    {
        int hashValue = hash(e.identifier);
        
        table[hashValue].add(e);
    }
    
    //based off week 10 slides page 15
    public void remove(String key)
    {
        int hashValue = hash(key);
        
        table[hashValue].remove(key);
    }
    
    //based off week 10 slides page 15
    public boolean search(String key)
    {
        int hashValue = hash(key);
        
        return table[hashValue].search(key);
    }
    
    //code given by professor in assignment files
    @Override
    public String toString()
    {
        String str = "";
        
        for(int i=0; i<table.length; i++)
        {
            str = String.format(str + "%2d: ", i);
                        
            LinkedList bucket = table[i];
            if (!bucket.isEmpty())
                str += bucket.toString() + "\n";
            else
                str += "->\n";
        }
        return str;
    } 
    
}