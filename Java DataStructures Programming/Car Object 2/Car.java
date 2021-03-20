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

public class Car {
    private int id;
    private String manufacturer;
    private String model;
    private Color color;
    private Engine engine;
    
    public Car() {
        id = 999;
        manufacturer = "NA";
        model = "NA";
        color = Color.BLACK;
        engine = new Engine();
    }
    
    public Car(int id, String manufacturer) {
        this.id = id;
        this.manufacturer = manufacturer;
    }
    
    public Car(int id, String manufacturer, String model, Color color, Engine engine) {
        this.id = id;
        this.manufacturer = manufacturer;
        this.model = model;
        this.color = color;
        this.engine = engine;
    }
    
    public int getId() {
        return id;
    }
    
    public String getManufacturer() {
        return manufacturer;
    }
    
    public String getModel() {
        return model;
    }
    
    public Color getColor() {
        return color;
    }
    
    public Engine getEngine() {
        return engine;
    }
    
    public void setId (int id) {
        this.id = id;
    }
    
    public void setManufacturer (String manufacturer) {
        this.manufacturer = manufacturer;
    }
    
    public void setModel (String model) {
        this.model = model;
    }
    
    public void setColor (Color color) {
        this.color = color;
    }
    
    public void setEngine (Engine engine) {
        this.engine = engine;
    }
    
}
