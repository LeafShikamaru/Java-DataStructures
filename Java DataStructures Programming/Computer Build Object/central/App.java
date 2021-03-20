//=============================================================================
// PROGRAMMER:Anaisy Garcia		
// PANTHER ID:5734454		
//
// CLASS: COP2210 Programming 1    		
// SECTION: U15     	
// SEMESTER: Spring 2019    	
// CLASSTIME: MoWe 5:00 PM - 6:25PM   	
//
// Project: Lab 5     
// DUE: Febuary 25         
//
// CERTIFICATION: I certify that this work is my own and that
//                 none of it is the work of any other person.
//=============================================================================
package central;

import hardware.CPU;
import hardware.Harddrive;
import hardware.Memory;
import hardware.VideoCard;

public class App {

    public static void main(String[] args) {
       CPU cpu = new CPU ("AMD", "3.9GHz", 6, 65, 165.99);
       Harddrive harddrive = new Harddrive ("Western Digital", "SATA 6 Gb/s", 64, 3.5, 44.89);
       Memory memory = new Memory ("G.Skill", "DDR4-3200", "16 GB", 169.99);
       VideoCard videoCard = new VideoCard ("ASUS", "11 GB", 250, 799.99);
       Computer computer = new Computer (cpu, harddrive, memory, videoCard);
       
       computer.displayInfo();
    }
    
}
