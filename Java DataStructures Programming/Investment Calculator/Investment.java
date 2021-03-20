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

public class Investment {
    
    public static void main(String[] args) 
    {
        double yearOneInterestRate = 0.05;
        double yearTwoInterestRate = 0.07;
        double yearThreeInterestRate = 0.02;
        double yearFourInterestRate = -0.05;
        double yearFiveInterestRate = 0.11;
        double principle = 1000.00;
        
        System.out.println("___________________________________");
        
        double yearOnePrinciple = principle*(yearOneInterestRate+1);
        System.out.println("Year One Principle = $" + yearOnePrinciple);
        
        System.out.println("___________________________________");
        
        double yearTwoPrinciple = yearOnePrinciple*(yearTwoInterestRate+1);
        System.out.println("Year Two Principle = $" + yearTwoPrinciple);
        
        System.out.println("___________________________________");
        
        double yearThreePrinciple = yearTwoPrinciple*(yearThreeInterestRate+1);
        System.out.println("Year Three Principle = $" + yearThreePrinciple);
        
        System.out.println("___________________________________");
        
        double yearFourPrinciple = yearThreePrinciple*(yearFourInterestRate+1);
        System.out.println("Year Four Principle = $" + yearFourPrinciple);
        
        System.out.println("___________________________________");
        
        double yearFivePrinciple = yearFourPrinciple*(yearFiveInterestRate+1);
        System.out.println("Year Five Principle = $" + yearFivePrinciple);
        
        System.out.println("___________________________________");
    }
    
}