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

public class Computer {
    private CPU cpu;
    private Harddrive harddrive;
    private Memory memory;
    private VideoCard videoCard;
    
    public Computer() {
        cpu = new CPU();
        harddrive = new Harddrive();
        memory = new Memory();
        videoCard = new VideoCard();
    }
    public Computer(CPU cpu, Harddrive harddrive, Memory memory, VideoCard videoCard) {
        this.cpu = cpu;
        this.harddrive = harddrive;
        this.memory = memory;
        this.videoCard = videoCard;
    }
    public void displayInfo()  {
        System.out.println("____________________________");
        System.out.println("Computer Info");
        System.out.println("____________________________");
        System.out.println("");
        
        cpu.displayInfo();
        harddrive.displayInfo();
        memory.displayInfo();
        videoCard.displayInfo();
        
        System.out.println("____________________________");
        System.out.println("Computer total price = " + computerPrice());
    }
    public double computerPrice() {
        double price = cpu.getPrice() + harddrive.getPrice() + memory.getPrice() + videoCard.getPrice();
        return price;
    }
}
