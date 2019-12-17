
package Vehicles;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brktrksvr
 */
public class Boat extends Vehicle{
    private double length;
    private double width;
    private String flag;
    private String engineType;
    private int cabinCount;
    private int bathroomCount;

    public Boat() {
    }

    public Boat(double length, double width, String flag, String engineType, 
            int cabinCount, int bathroomCount, String name, double price, String listingDate, int modelYear, String model, String type) {
        super(name, price, listingDate, modelYear, model, type);
        this.length = length;
        this.width = width;
        this.flag = flag;
        this.engineType = engineType;
        this.cabinCount = cabinCount;
        this.bathroomCount = bathroomCount;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public String getFlag() {
        return flag;
    }

    public String getEngineType() {
        return engineType;
    }

    public int getCabinCount() {
        return cabinCount;
    }

    public int getBathroomCount() {
        return bathroomCount;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public void setCabinCount(int cabinCount) {
        this.cabinCount = cabinCount;
    }

    public void setBathroomCount(int bathroomCount) {
        this.bathroomCount = bathroomCount;
    }

    @Override
    public double calculateTax() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
