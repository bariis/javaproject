
package Vehicles;

import GUI.LoginFrame;
import SysClassesAndMain.VehicleSys;
import java.io.Serializable;


public abstract class Vehicle implements Serializable{
    protected int listingId;
    protected String name; 
    protected double price;
    protected String listingDate;
    protected int modelYear;
    protected String model;
    protected String type;
    protected static int totalVehicles;
    
    public Vehicle() {
    }

    public Vehicle(String name, double price, String listingDate, int modelYear, String model, String type) {
        this.name = name;
        this.price = price;
        this.listingDate = listingDate;
        this.modelYear = modelYear;
        this.model = model;
        this.type = type;
        totalVehicles++;
        listingId = totalVehicles;
    }
    
    //abstract method. car and motorcycle will treat differently.
    public abstract double calculateTax();

    public int getListingId() {
        return listingId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getListingDate() {
        return listingDate;
    }

    public int getModelYear() {
        return modelYear;
    }

    public String getModel() {
        return model;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setListingDate(String listingDate) {
        this.listingDate = listingDate;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public static int getTotalVehicles() {
        return totalVehicles;
    }

    public static void setTotalVehicles(int totalVehicles) {
        Vehicle.totalVehicles = totalVehicles;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setListingId(int listingId) {
        this.listingId = listingId;
    }
    
     @Override
    // toString will most likely not be used
    public String toString() {
        return "\nListing Name: " + name + "\nListing Price: " + price + "$" + 
                "\nListing Date: " + listingDate + "\nModel Year: " + modelYear +
                "\nModel Name: " + model + "\nType: " + type;
    }
    
    
}