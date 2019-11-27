/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brktrksvr
 */

public abstract class Vehicle {
    protected int listingId = 0;
    protected String name; 
    protected double price;
    protected String listingDate;
    protected int modelYear;

    public Vehicle() {
    }

    public Vehicle(String name, double price, String listingDate, int modelYear) {
        this.name = name;
        this.price = price;
        this.listingDate = listingDate;
        this.modelYear = modelYear;
        listingId++;
    }


    
    
    // COMMIT TEST
}