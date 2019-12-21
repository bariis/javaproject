
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
public class Car extends Vehicle implements VehicleInterface{
    private int horsePower;
    private String licensePlate;
    private String tireModel;
    private String color;
    private double topSpeed;

    public Car() {
    }

    
    public Car(int horsePower, String licensePlate, String tireModel, String color, double topSpeed, 
            String name, double price, String listingDate, int modelYear, String model, String type) {
        super(name, price, listingDate, modelYear, model, type);
        this.horsePower = horsePower;
        this.licensePlate = licensePlate;
        this.tireModel = tireModel;
        this.color = color;
        this.topSpeed = topSpeed;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getTireModel() {
        return tireModel;
    }

    public String getColor() {
        return color;
    }

    public double getTopSpeed() {
        return topSpeed;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public void setTireModel(String tireModel) {
        this.tireModel = tireModel;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTopSpeed(double topSpeed) {
        this.topSpeed = topSpeed;
    }
    
    public double calculateTax(){
       
            if(this.horsePower > 0 && this.horsePower <=  150){
                return 0.40 * this.price;
            }
            else if(this.horsePower > 150 && this.horsePower <= 300){
                return 0.80 * this.price;
            }
            else {
                return 1.20 * this.price;
            }
    }
    
     public int calculateMaxCapacity(){
        int maxCapacity;
        
        if(model.equalsIgnoreCase("SUV"))
            maxCapacity = 7;
        else if(model.equalsIgnoreCase("Sport"))
            maxCapacity = 2;
        else if(model.equalsIgnoreCase("Truck"))
            maxCapacity = 4;
        else if(model.equalsIgnoreCase("Daily"))
            maxCapacity = 4;
        else 
            maxCapacity = 4;
        
        return maxCapacity;
                
    }
    
    public String toString(){
        return "Car" + super.toString() + "\nHorsePower= " + horsePower + 
                "\nLicense Plate= " + licensePlate + "\nTire model= " + 
                tireModel +"\nColor= " + color + "\nTop Speed= " + topSpeed;
    }
    
}
