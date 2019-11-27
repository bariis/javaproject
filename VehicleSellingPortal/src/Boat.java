/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brktrksvr
 */
public abstract class Boat extends Vehicle{
    protected double length;
    protected double width;
    protected String flag;
    protected String engineType;
    protected int cabinCount;

    public Boat() {
    }

    public Boat(double length, double width, String flag, String engineType, 
            int cabinCount, String name, double price, String listingDate, int modelYear) {
        super(name, price, listingDate, modelYear);
        this.length = length;
        this.width = width;
        this.flag = flag;
        this.engineType = engineType;
    }
    
    
}
