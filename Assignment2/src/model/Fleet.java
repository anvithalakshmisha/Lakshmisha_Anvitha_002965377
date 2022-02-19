/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author anvithalakshmisha
 */
public class Fleet {

    private String model;
    private String carManufacturer;
    private int carManufactureYear;
    private String city;

    public String getFileLocation() {
        return FileLocation;
    }

    public void setFileLocation(String FileLocation) {
        this.FileLocation = FileLocation;
    }

    public FleetDirectory getFleetdirec() {
        return fleetdirec;
    }

    public void setFleetdirec(FleetDirectory fleetdirec) {
        this.fleetdirec = fleetdirec;
    }
    private int seatCount;
    private String modelNumber;
    private Date lastUpdatedFleetCatalog;
    private String isMaintenanceExpired;
    private String SerialNumber;
    private String Available;
    private String FileLocation;
    private FleetDirectory fleetdirec;

    public String getAvailable() {
        return Available;
    }

    public void setAvailable(String Available) {
        this.Available = Available;
    }

    public String getSerialNumber() {
        return SerialNumber;
    }

    public void setSerialNumber(String SerialNumber) {
        this.SerialNumber = SerialNumber;
    }

    public String isIsMaintenanceExpired() {
        return isMaintenanceExpired;
    }

    public void setIsMaintenanceExpired(String isMaintenanceExpired) {
        this.isMaintenanceExpired = isMaintenanceExpired;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCarManufacturer() {
        return carManufacturer;
    }

    public void setCarManufacturer(String carManufacturer) {
        this.carManufacturer = carManufacturer;
    }

    public int getCarManufactureYear() {
        return carManufactureYear;
    }

    public void setCarManufactureYear(int carManufactureYear) {
        this.carManufactureYear = carManufactureYear;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public Date getLastUpdatedFleetCatalog() {
        return lastUpdatedFleetCatalog;
    }

    public void setLastUpdatedFleetCatalog() {
        this.lastUpdatedFleetCatalog = java.util.Calendar.getInstance().getTime();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    
    @Override 
    public String toString() {
        return this.model;
    }
    

}
