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
    protected String model;
    
    public Vehicle() {
    }

    public Vehicle(String name, double price, String listingDate, int modelYear, String model) {
        this.name = name;
        this.price = price;
        this.listingDate = listingDate;
        this.modelYear = modelYear;
        this.model = model;
        listingId++;
    }

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
    
}