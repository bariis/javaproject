
package SysClasses;


import Vehicles.Boat;
import Vehicles.Car;
import Vehicles.Vehicle;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zer0
 */
public class VehicleSys {
    private static ArrayList<Vehicle> list = new ArrayList<Vehicle>();

    // this method only checks if the object that will be added is already in 
    // the list, according to the name of the object
    // this is NOT the search function
    public static boolean checkList(Vehicle obj){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(0).getName().equalsIgnoreCase(obj.getName())){
                return true;
            }
        }
        return false;
    }
    
    // add functional but feels like something is missing
    // check back later
    public static boolean addVehicle(Vehicle obj){
        if(!checkList(obj)){
            list.add(obj);
            return true;
        }
        else {
            return false;
        }
    }
    
    public static boolean removeVehicle(Vehicle obj){
        for(Vehicle v : list){
            if(v == obj){
                list.remove(v);
                return true;
            }
        }
        return false;
    }
    
      // displays every Vehicle in the list
      public static String displayVehicles() {
        String output = "";

        for (Vehicle vehicle : list) {
            output += list.toString() + "\n";
        }

        return output;
    }
      
       public static Vehicle searchVehicle(int listingId) {
        for (Vehicle vehicle : list) {
            if (vehicle.getListingId() == listingId) {
                return vehicle;
            }
        }

        return null;
    }
       
    // reads vehicle information from the file 
    public static void readAllVehiclesFromFile(){
        
    }
    
    // writes vehicle information to the file
    public static void writeAllVehiclesToFile(){
       
    }
}

