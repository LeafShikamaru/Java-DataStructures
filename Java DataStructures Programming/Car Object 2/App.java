//=============================================================================
// PROGRAMMER:Anaisy Garcia		
// PANTHER ID:5734454		
//
// CLASS: COP2210 Programming 1    		
// SECTION: U15     	
// SEMESTER: Spring 2019    	
// CLASSTIME: MoWe 5:00 PM - 6:25PM   	
//
// Project: Lab 4     
// DUE: Febuary 21         
//
// CERTIFICATION: I certify that this work is my own and that
//                 none of it is the work of any other person.
//=============================================================================
package cop2210_lab4;

import java.awt.Color;
import Components.Engine;

public class App {

    public static void main(String[] args) {
        Car myCar = new Car();
        Car friendCar = new Car(123, "BMW");
        Engine engine = new Engine(200, "GAS");
        Car companyCar = new Car(20501, "Ford", "F150", Color.BLUE, engine);
    }
    
}
 