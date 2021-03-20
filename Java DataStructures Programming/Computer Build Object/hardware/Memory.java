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

public class Memory {
    private String manufacturer;
    private String speed;
    private String size;
    private double price;
    
    public Memory() {
        manufacturer = "NA";
        speed = "NA";
        size = "NA";
        price = 999.99;
    }
    public Memory(String manufacturer, String speed, String size, double price) {
        this.manufacturer = manufacturer;
        this.speed = speed;
        this.size = size;
        this.price = price;
    }
    public void displayInfo()  {
        System.out.println("____________________________");
        System.out.println("Memory Info");
        System.out.println("____________________________");
        System.out.println("Manufacturer = " + manufacturer);
        System.out.println("Speed = " + speed);
        System.out.println("Size = " + size);
        System.out.println("Price = " + price);
    }
    public String getManufacturer() {
        return manufacturer;
    }
    public void setManufacturer (String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public String getSpeed() {
        return speed;
    }
    public void setSpeed (String speed) {
        this.speed = speed;
    }
    public String getSize() {
        return size;
    }
    public void setSize (String size) {
        this.size = size;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice (double price) {
        this.price = price;
    }
}
