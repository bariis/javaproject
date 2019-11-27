/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brktrksvr
 */
public abstract class Car extends Vehicle {
    protected int horsePower;
    protected String licensePlate;
    protected String tireModel;
    protected String color;

    public Car() {
    }

    
    public Car(int horsePower, String licensePlate, String tireModel, String color, 
            String name, double price, String listingDate, int modelYear) {
        super(name, price, listingDate, modelYear);
        this.horsePower = horsePower;
        this.licensePlate = licensePlate;
        this.tireModel = tireModel;
        this.color = color;
    }
    
    
}
