
package Vehicles;

import VehicleInterface.VehicleInterface;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brktrksvr
 */
public class Motorcycle extends Vehicle implements VehicleInterface{
    private String licensePlate;
    private int capacity;
    private double topSpeed;
    private double engineSize;

    public Motorcycle() {
    }

    public Motorcycle(String licensePlate, int capacity, double topSpeed,
            double engineSize, String name, double price, String listingDate, 
            int modelYear, String model, String type) {
        super(name, price, listingDate, modelYear, model, type);
        this.licensePlate = licensePlate;
        this.capacity = capacity;
        this.topSpeed = topSpeed;
        this.engineSize = engineSize;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getTopSpeed() {
        return topSpeed;
    }

    public double getEngineSize() {
        return engineSize;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setTopSpeed(double topSpeed) {
        this.topSpeed = topSpeed;
    }

    public void setEngineSize(double engineSize) {
        this.engineSize = engineSize;
    }
    
    
    // recalculate the price according to the engine size
    public double calculateTax(){
            if(this.engineSize > 0 && this.engineSize <=  125){
                return 0.25 * this.price;
            }
            else if(this.engineSize > 125 && this.engineSize <= 250){
                return 0.50 * this.price;
            }
            else {
                return 0.70 * this.price;
            }
    }
    
    
    
    public String toString(){
        return "Motorcycle" + super.toString() + "\nLicense Plate= " + licensePlate + "\nCapacity= " + capacity + "\nTop speed= " + topSpeed + "\nEngine size= " + engineSize + "\n";
    }

    @Override
    public int calculateMaxCapacity() {
        if(this.type.equalsIgnoreCase("Sport")){
            return 1;
        }
        else if (this.type.equalsIgnoreCase("Cruiser")){
            return 2;
        }
        else {
            return 1;
        }
    }
    
}
