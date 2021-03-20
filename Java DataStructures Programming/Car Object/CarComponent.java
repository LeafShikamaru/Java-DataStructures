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

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class CarComponent extends JComponent {
    
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        
        Car car1 = new Car(0, 0);
        
        int x = getWidth() - 60;
        int y = getHeight() - 30;
        
        Car car2 = new Car(x, y);
        
        car1.draw(g2);
        car2.draw(g2);
    }
}
