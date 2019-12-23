/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SysClassesAndMain;

import GUI.LoginFrame;
import Vehicles.Car;
import Vehicles.Motorcycle;

/**
 *
 * @author barisertas
 */
public class Main {
    public static void main(String[] args) {
        // public Car(int horsePower, String licensePlate, String tireModel, String color, double topSpeed, 
          //  String name, double price, String listingDate, int modelYear, String model, String type)
          
          //public Motorcycle(String licensePlate, int capacity, double topSpeed,
         //   double engineSize, String name, double price, String listingDate, 
            //int modelYear, String model, String type) 
                  
          Motorcycle motor = new Motorcycle("456-def-456", 2, 180.0, 23.4, "t", 123.444, "02.02.02", 1999, "m", "l");
          Car car = new Car(50, "123-abc-123", "x", "red", 245.0, "y", 345.000, "01.01.01", 1994, "g", "t");
          Car carx = new Car(50, "123-abc-123", "x", "red", 245.0, "c", 345.000, "01.01.01", 1998, "g", "t");
          
          VehicleSys.addVehicle(car);
          VehicleSys.addVehicle(motor);
          VehicleSys.addVehicle(carx);
          
          VehicleSys.writeAllVehiclesToFile();
          VehicleSys.readAllVehiclesFromFile();
            String[] ids = VehicleSys.getAllVehicleIds();
            
            for(int i = 0; i<ids.length; i++)
                System.out.println(ids[i]);
            
         UserSystem.readAllUsersFromFile();
        LoginFrame loginFrame = new LoginFrame();
        loginFrame.setVisible(true);
        
    }
}
