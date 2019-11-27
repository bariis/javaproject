/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brktrksvr
 */
public class Motorcycle extends Vehicle{
    private String licensePlate;
    private int capacity;
    private double topSpeed;
    private double engineSize;

    public Motorcycle() {
    }

    public Motorcycle(String licensePlate, int capacity, double topSpeed, double engineSize, String name, double price, String listingDate, int modelYear, String model, String type) {
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
    
    
}
