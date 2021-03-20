//=============================================================================
// PROGRAMMER:Anaisy Garcia		
// PANTHER ID:5734454		
//
// CLASS: COP2210 Programming 1    		
// SECTION: U15     	
// SEMESTER: Spring 2019    	
// CLASSTIME: MoWe 5:00 PM - 6:25PM   	
//
// Project: Lab 6     
// DUE: March 4        
//
// CERTIFICATION: I certify that this work is my own and that
//                 none of it is the work of any other person.
//=============================================================================
package mathhelper;



public class ComplexCalculator {
    public static final double VERSION = 1.0;
    
    public ComplexCalculator(){
        System.out.println("-------------------------------------------------");
        System.out.println("Complex Calculator is setting up... running version: " + VERSION);
        System.out.println("-------------------------------------------------");
        System.out.println("");
    }
    
    public double futureValue(double principle, double interestRate, int years) {
        double futureValue = Math.pow(principle * (1 + interestRate), years);
        return futureValue;
    }
    
    public double areaOfCircle(double radius) {
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }
    
    public double round(double value, int roundTo) {
        double multiplier = Math.pow(10, roundTo);
        double multiply = value * multiplier;
        double roundToo = Math.round(multiply);
        double end = roundToo/multiplier;
        return end;
    }
    
    public double crazyEquation() {
        double result = (((100/Math.sqrt(18))*200)+(Math.pow(2.1, 3)))/(2+(Math.log10(6)*Math.pow(2.15, 3)));
        return result;
        
    }
}
