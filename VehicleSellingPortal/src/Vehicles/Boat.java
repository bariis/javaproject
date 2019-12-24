
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

    public Boat() {
    }

    public Boat(double length, double width, String flag, String engineType, 
            int cabinCount, String name, double price, String listingDate, 
            int modelYear, String model, String type) {
        super(name, price, listingDate, modelYear, model, type);
        this.length = length;
        this.width = width;
        this.flag = flag;
        this.engineType = engineType;
        this.cabinCount = cabinCount;
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

    
    @Override
    public double calculateTax(){
       
            if(this.flag.equalsIgnoreCase("Turkish")){
                return 0.10 * this.price;
            }
            else if(this.flag.equalsIgnoreCase("American")){
                return 0.30 * this.price;
            }
            else {
                return 0.20 * this.price;
            }
    }
    
    public int calculateMaxCapacity(){
        return cabinCount * 2;
    }
     
    @Override
    public String toString() {
        return "Boat" + super.toString() + "\nlength=" + length + "\nwidth=" + width + "\nflag=" + 
                flag + "\nengineType=" + engineType + "\ncabinCount=" + cabinCount + "\nMax Capacity= "
                + calculateMaxCapacity() + "\nTax= " + calculateTax() + "\n\n";
    }
     
     
    
    
}
