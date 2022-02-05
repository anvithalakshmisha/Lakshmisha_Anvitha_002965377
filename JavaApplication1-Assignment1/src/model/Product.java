/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.swing.Icon;

/**
 *
 * @author anvithalakshmisha
 */
public class Product {
    
    private String brand;
    private String model;
    private String color;
    private int year;
    private String engineNo;
    private int seatsNo;
    private String licensePlate;
    private String ownerName;
    private int telephoneNo;
    private String emailAddress;
    private String driverLicense;
    private String ssn;
    private String address;
    private String[] serviceRecords;

    public String[] getServiceRecords() {
        return serviceRecords;
    }

    public void setServiceRecords(String[] serviceRecords) {
        this.serviceRecords = serviceRecords;
    }
    private int warrantyYear;
    private Icon pic;

//    public ServiceRecord getServiceRecord() {
//        return serviceRecord;
//    }
//
//    public void setServiceRecord(ServiceRecord serviceRecord) {
//        this.serviceRecord = serviceRecord;
//    }
    
//    private String lastMaintenanceDate;
//    private String previousOwner;
//    private int numberOfMaintenanceHistory;
//    private ServiceRecord serviceRecord;
//    private ArrayList<String> serviceRecords;

//    public ArrayList<String> getServiceRecords() {
//        return serviceRecords;
//    }
//
//    public void setServiceRecords(ArrayList<String> serviceRecords) {
//        this.serviceRecords = serviceRecords;
//    }

    public String getBrand() {
        return brand;
    }

//    public String getLastMaintenanceDate() {
//        return lastMaintenanceDate;
//    }
//
//    public void setLastMaintenanceDate(String lastMaintenanceDate) {
//        this.lastMaintenanceDate = lastMaintenanceDate;
//    }
//
//    public String getPreviousOwner() {
//        return previousOwner;
//    }
//
//    public void setPreviousOwner(String previousOwner) {
//        this.previousOwner = previousOwner;
//    }
//
//    public int getNumberOfMaintenanceHistory() {
//        return numberOfMaintenanceHistory;
//    }
//
//    public void setNumberOfMaintenanceHistory(int numberOfMaintenanceHistory) {
//        this.numberOfMaintenanceHistory = numberOfMaintenanceHistory;
//    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getEngineNo() {
        return engineNo;
    }

    public void setEngineNo(String engineNo) {
        this.engineNo = engineNo;
    }

    public int getSeatsNo() {
        return seatsNo;
    }

    public void setSeatsNo(int seatsNo) {
        this.seatsNo = seatsNo;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getTelephoneNo() {
        return telephoneNo;
    }

    public void setTelephoneNo(int telephoneNo) {
        this.telephoneNo = telephoneNo;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(String driverLicense) {
        this.driverLicense = driverLicense;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

//    public String[] getServiceRecords() {
//        return serviceRecords;
//    }
//
//    public void setServiceRecords(String[] serviceRecords) {
//        this.serviceRecords = serviceRecords;
//    }

    public int getWarrantyYear() {
        return warrantyYear;
    }

    public void setWarrantyYear(int warrantyYear) {
        this.warrantyYear = warrantyYear;
    }

    public Icon getPic() {
        return pic;
    }

    public void setPic(Icon pic) {
        this.pic = pic;
    }
    
    public int toInt() {
        return warrantyYear;
    }
    
    
}
