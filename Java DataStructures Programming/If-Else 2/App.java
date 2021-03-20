//=============================================================================
// PROGRAMMER:Anaisy Garcia		
// PANTHER ID:5734454		
//
// CLASS: COP2210 Programming 1    		
// SECTION: U15     	
// SEMESTER: Spring 2019    	
// CLASSTIME: MoWe 5:00 PM - 6:25PM   	
//
// Project: Lab 8   
// DUE: April 1        
//
// CERTIFICATION: I certify that this work is my own and that
//                 none of it is the work of any other person.
//=============================================================================
package decision;


public class App {

    public static void main(String[] args) {
        int a = 2;
        int b = 2;
        int x = 3;
        int y = 5;
        
    if( x < y && a == b){
        System.out.println("OK");
    } else{
        System.out.println("Not OK");
    }//end if
    
    if( x >= y || a != b){
        System.out.println("OK");
    } else{
        System.out.println("Not OK");
    }//end if
    
    final double EPSILON = 1E-3;
    double z = 3.3293998;
    double q = 3.339222;
    if (Math.abs(z - q) <= EPSILON)
    {
        System.out.println("True");
    } else{
        System.out.println("False");
    }//end if
    
    String course1 = "COP2210";
    String course2 = "COP2211";
    
    if (course1.equals(course2)){
        System.out.println("Strings are Equal");
    } else{
        System.out.println("Strings are NOT Equal");
    }//end if
    
    String single = "YES";
    int income = 55000;
    
    if (single.equals("YES")){
        if (income <= 32000){
            System.out.println("Tax Bracket = 10%");
        } else{
            System.out.println("Tax Bracket = 25%");
        }
    } else{
        if (income <= 64000){
            System.out.println("Tax Bracket = 10%");
        } else{
            System.out.println("Tax Bracket = 25%");
        }
    }// end if
    
    }//end static
    
}//end app