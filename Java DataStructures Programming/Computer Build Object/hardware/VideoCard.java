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
package hardware;

public class VideoCard {
    private String manufacturer;
    private String memory;
    private int watts;
    private double price;
    
    public VideoCard() {
        manufacturer = "NA";
        memory = "NA";
        watts = 999;
        price = 999.99;
    }
    public VideoCard(String manufacturer, String memory, int watts, double price) {
        this.manufacturer = manufacturer;
        this.memory = memory;
        this.watts = watts;
        this.price = price;
    }
    public void displayInfo()  {
        System.out.println("____________________________");
        System.out.println("Video Card Info");
        System.out.println("____________________________");
        System.out.println("Manufacturer = " + manufacturer);
        System.out.println("Memory = " + memory);
        System.out.println("Watts = " + watts);
        System.out.println("Price = " + price);
    }
    public String getManufacturer() {
        return manufacturer;
    }
    public void setManufacturer (String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public String getMemory() {
        return memory;
    }
    public void setMemory (String memory) {
        this.memory = memory;
    }
    public int getWatts() {
        return watts;
    }
    public void setWatts (int watts) {
        this.watts = watts;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice (double price) {
        this.price = price;
    }
}
