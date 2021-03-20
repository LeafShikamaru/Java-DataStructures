//=============================================================================
// PROGRAMMER:Anaisy Garcia		
// PANTHER ID:5734454		
//
// CLASS: COP2210 Programming 1    		
// SECTION: U15     	
// SEMESTER: Spring 2019    	
// CLASSTIME: MoWe 5:00 PM - 6:25PM   	
//
// Project: Lab 7     
// DUE: March 25        
//
// CERTIFICATION: I certify that this work is my own and that
//                 none of it is the work of any other person.
//=============================================================================
package decision;

public class App {
    
    public static void main(String[] args) {
    
    
    if (4<5) {
        System.out.println("Four is less than Five");
}else {
    System.out.println("Four is not less than Five");
}

              
int cookTime = 8;

if(cookTime == 10){
 System.out.println("Cook time is 10 minutes");
}else if(cookTime == 9 ){
 System.out.println("Cook time is 9 minutes");
}else if(cookTime == 8 ){
 System.out.println("Cook time is 8 minutes");
}else if(cookTime == 7 ){
 System.out.println("Cook time is 7 minutes");
}else{
 System.out.println("Cook time is under 7 minutes");
}

int counter = 10;

if(counter == 10){
 System.out.println("Counter is equal to 10 ");
    }

    
    double mixture = 20;   
    
    if (mixture >= 23.5){
        System.out.println("Decrease Fuel Mixture by 0.30");
        
    }else if(mixture >= 23.0){
        System.out.println("Decrease Fuel Mixture by 0.10");
        
    }else if(mixture >= 22.5){
        System.out.println("Decrease Fuel Mixture by 0.05");
  
    }else if(mixture >= 21.0){
        System.out.println("Fuel Mixture is OK");

    }else if(mixture >= 20.0){
        System.out.println("Increase Fuel Mixture by 0.10");

    }else{
        System.out.println("Sensor Needs To Be Checked");
}
}
}