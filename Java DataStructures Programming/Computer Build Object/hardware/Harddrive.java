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

public class Harddrive {
    private String manufacturer;
    private String interfacebus;
    private int cache;
    private double formFactor;
    private double price;
    
    public Harddrive() {
        manufacturer = "NA";
        interfacebus = "NA";
        cache = 999;
        formFactor = 999.999;
        price = 999.99;
    }
    public Harddrive(String manufacturer, String interfacebus, int cache, double formFactor, double price) {
        this.manufacturer = manufacturer;
        this.interfacebus = interfacebus;
        this.cache = cache;
        this.formFactor = formFactor;
        this.price = price;
    }
    public void displayInfo()  {
        System.out.println("____________________________");
        System.out.println("Harddrive Info");
        System.out.println("____________________________");
        System.out.println("Manufacturer = " + manufacturer);
        System.out.println("InterfaceBus = " + interfacebus);
        System.out.println("Cache = " + cache);
        System.out.println("Form Factor = " + formFactor);
        System.out.println("Price = " + price);
    }
    public String getManufacturer() {
        return manufacturer;
    }
    public void setManufacturer (String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public String getInterfacebus() {
        return interfacebus;
    }
    public void setInterfacebus (String interfacebus) {
        this.interfacebus = interfacebus;
    }
    public int getCache() {
        return cache;
    }
    public void setCache (int cache) {
        this.cache = cache;
    }
    public double getFormFactor() {
        return formFactor;
    }
    public void setFormFactor (double formFactor) {
        this.formFactor = formFactor;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice (double price) {
        this.price = price;
    }
}
