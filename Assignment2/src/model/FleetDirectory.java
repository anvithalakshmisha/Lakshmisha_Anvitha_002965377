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
public class FleetDirectory {

    public FleetDirectory() {
        this.fleetList = new ArrayList<Fleet>();
    }

    public ArrayList<Fleet> getFleet() {
        return fleetList;
    }

    public void setFleet(ArrayList<Fleet> fleet) {
        this.fleetList = fleet;
    }

    public Fleet addFleet() {
        Fleet newFleet = new Fleet();
        fleetList.add(newFleet);
        return newFleet;
    }

    public void removeFleet(Fleet f) {
        fleetList.remove(f);
    }
    private ArrayList<Fleet> fleetList;

}
