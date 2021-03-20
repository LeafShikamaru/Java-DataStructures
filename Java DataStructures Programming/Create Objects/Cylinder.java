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

public class Cylinder {
     public static void main(String[] args)      
    {
        double diameter = 40.43;
        double height = 120.54;
        double radius = diameter/2;
        double pi = 3.14;
        
        System.out.println("___________________________________");
        
        System.out.println("Radius = " + radius);
        
        System.out.println("___________________________________");
        
        double surfaceArea = 2*pi*radius*height+2*pi*Math.pow(radius, 2);
        System.out.println("Surface Area = " + surfaceArea);
        
        System.out.println("___________________________________");
        
        double volume = height*pi*Math.pow(radius, 2);
        System.out.println("Volume = " + volume);
        
        System.out.println("___________________________________");
    }
}
