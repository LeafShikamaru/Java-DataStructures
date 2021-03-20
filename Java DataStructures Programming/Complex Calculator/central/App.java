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
package central;

import mathhelper.ComplexCalculator;

public class App {
    
    public static void main(String[] args) {
        ComplexCalculator calculator = new ComplexCalculator();
        
        double principle = 1000;
        double interestRate = 0.05;
        int years = 5;
        
        double futureValue = calculator.futureValue(principle, interestRate, years);
        double areaOfCircle = calculator.areaOfCircle(12.75);
        double roundExpValue = calculator.round(Math.E, 7);
        double result = calculator.crazyEquation();
        
        System.out.printf("Future value = %.2f\n", futureValue);
        System.out.printf("Area of Circle = %8.4f\n", areaOfCircle);
        System.out.println("Round Value of Exp = " + roundExpValue);
        System.out.println("Crazy Equation = " + result);
    }
    
}
