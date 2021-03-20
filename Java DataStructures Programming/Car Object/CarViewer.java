//=============================================================================
// PROGRAMMER:Anaisy Garcia		
// PANTHER ID:5734454		
//
// CLASS: COP2210 Programming 1    		
// SECTION: U15     	
// SEMESTER: Spring 2019    	
// CLASSTIME: MoWe 5:00 PM - 6:25PM   	
//
// Project: Lab 3     
// DUE: Febuary 4         
//
// CERTIFICATION: I certify that this work is my own and that
//                 none of it is the work of any other person.
//=============================================================================
package cop2210_lab3;

import javax.swing.JFrame;

public class CarViewer {
    
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        
        frame.setSize(300, 400);
        frame.setTitle("Two cars");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        CarComponent component = new CarComponent();
        frame.add(component);
        
        frame.setVisible(true);
    }
}
