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


public class CPU {
    private String manufacturer;
    private String frequency;
    private int cores;
    private int watts;
    private double price;
    
    public CPU() {
        manufacturer = "NA";
        frequency = "NA";
        cores = 999;
        watts = 999;
        price = 999.99;
    }
    public CPU(String manufacturer, String frequency, int cores, int watts, double price) {
        this.manufacturer = manufacturer;
        this.frequency = frequency;
        this.cores = cores;
        this.watts = watts;
        this.price = price;
    }
    public void displayInfo()  {
        System.out.println("____________________________");
        System.out.println("CPU Info");
        System.out.println("____________________________");
        System.out.println("Manufacturer = " + manufacturer);
        System.out.println("Frequency = " + frequency);
        System.out.println("Cores = " + cores);
    }
    public String getManufacturer() {
        return manufacturer;
    }
    public void setManufacturer (String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public String getFrequency() {
        return frequency;
    }
    public void setFrequency (String frequency) {
        this.frequency = frequency;
    }
    public int getCores() {
        return cores;
    }
    public void setCores (int cores) {
        this.cores = cores;
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
