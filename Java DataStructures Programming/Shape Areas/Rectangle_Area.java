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

public class Rectangle_Area {
    
     public static void main(String[] args)      
    {
        double height = 55.23;
        double width = 275.6421;
        
        System.out.println("___________________________________");
        
        double area = height * width;
        System.out.println("Area = " + area);
        
        System.out.println("___________________________________");
        
        double perimeter = (height * 2)+(width * 2);
        System.out.println("Perimeter = " + perimeter);
        
        System.out.println("___________________________________");
    }
}
