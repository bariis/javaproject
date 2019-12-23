
package SysClassesAndMain;


import Vehicles.Boat;
import Vehicles.Car;
import Vehicles.Vehicle;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    public static boolean checkList(String name){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getName().equalsIgnoreCase(name)){
                return true;
            }
        }
        return false;
    }
    
    // add functional but feels like something is missing
    // check back later
    public static boolean addVehicle(Vehicle obj){
        if(!checkList(obj.getName())){
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
                Vehicle.setTotalVehicles(Vehicle.getTotalVehicles()-1);
                return true;
            }
        }
        return false;
    }
    
      // displays every Vehicle in the list
      public static String displayVehicles() {
        String output = "";

        for (int i = 0; i < list.size(); i++) {
            output += list.get(i).toString();
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
       
       public static Vehicle searchVehicleName(String listingName) {
        for (Vehicle vehicle : list) {
            if (vehicle.getName().equalsIgnoreCase(listingName)) {
                return vehicle;
            }
        }

        return null;
    }
       
    // reads vehicle information from the file 
    public static void readAllVehiclesFromFile(){
        try {
            ObjectInputStream is = new ObjectInputStream(new FileInputStream("vehicles.bin"));
            try {
                list.addAll((ArrayList<Vehicle>) is.readObject());
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(VehicleSys.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (IOException ex) {
            Logger.getLogger(VehicleSys.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // writes vehicle information to the file
    public static void writeAllVehiclesToFile(){
        try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("vehicles.bin"));
            os.writeObject(list);
        } catch (IOException ex) {
            Logger.getLogger(VehicleSys.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static String[] getAllVehicleIds(){
        int i = 0;
        String[] ids = new String[list.size()];
        for(Vehicle v : list){
            ids[i] = v.getListingId() + "";
            i++;
        }
        return ids;
    }

    public static ArrayList<Vehicle> getList() {
        return list;
    }
    
    
}

