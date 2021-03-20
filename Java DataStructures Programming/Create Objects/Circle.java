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

public class Circle {
    public static void main(String[] args)      
    {
        double diameter = 20.562;
        double radius = diameter/2;
        double pi = 3.14;
        
        System.out.println("___________________________________");
        
        System.out.println("Radius = " + radius);
        
        System.out.println("___________________________________");
        
        double circumference = 2*pi*radius;
        System.out.println("Circumference = " + circumference);
        
        System.out.println("___________________________________");
        
        double area = pi*Math.pow(radius, 2);
        System.out.println("Area = " + area);
        
        System.out.println("___________________________________");
    }
}
