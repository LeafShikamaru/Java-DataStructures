//=============================================================================
// PROGRAMMER:Anaisy Garcia		
// PANTHER ID:5734454		
//
// CLASS: COP2210 Programming 1    		
// SECTION: U15     	
// SEMESTER: Spring 2019    	
// CLASSTIME: MoWe 5:00 PM - 6:25PM   	
//
// Project: Lab 2     
// DUE: January 29         
//
// CERTIFICATION: I certify that this work is my own and that
//                 none of it is the work of any other person.
//=============================================================================
package components;

public class Triangle_Area {
    
    public static void main(String[] args)      
    {
        double height = 30.0;
        double base = 50.0;
        
        System.out.println("___________________________________");
        
        double C = Math.pow((height*height + base*base),0.5);
        System.out.println("Missing side = " + C);
        
        System.out.println("___________________________________");
        
        double area = (base * height)/2;
        System.out.println("Area = " + area);
        
        System.out.println("___________________________________");
        
        double perimeter = height + base + C;
        System.out.println("Perimeter = " + perimeter);
        
        System.out.println("___________________________________");
    }
}