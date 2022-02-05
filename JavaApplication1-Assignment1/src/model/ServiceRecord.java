/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author anvithalakshmisha
 */
public class ServiceRecord {
    private String lastMaintenanceDate;

    public String getLastMaintenanceDate() {
        return lastMaintenanceDate;
    }

    public void setLastMaintenanceDate(String lastMaintenanceDate) {
        this.lastMaintenanceDate = lastMaintenanceDate;
    }

    public String getPreviousOwner() {
        return previousOwner;
    }

    public void setPreviousOwner(String previousOwner) {
        this.previousOwner = previousOwner;
    }

    public int getNumberOfMaintenanceHistory() {
        return numberOfMaintenanceHistory;
    }

    public void setNumberOfMaintenanceHistory(int numberOfMaintenanceHistory) {
        this.numberOfMaintenanceHistory = numberOfMaintenanceHistory;
    }
    private String previousOwner;
    private int numberOfMaintenanceHistory;
    private ArrayList<ServiceRecord> record;
    
    public ServiceRecord () {
        this.record = new ArrayList<ServiceRecord>();
    }

    public ArrayList<ServiceRecord> getServiceRecord() {
        return record;
    }

    public void setServiceRecord(ArrayList<ServiceRecord> record) {
        this.record = record;
    }
    
    public ServiceRecord addNewServiceRecord() {
        ServiceRecord newService = new ServiceRecord();
        record.add(newService);
        return newService;
    }

//    public void deleteSerRecord(Product selectedProduct) {
//        record.remove(selectedProduct);
//    }
}
