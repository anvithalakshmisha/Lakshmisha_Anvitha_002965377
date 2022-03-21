/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author anvithalakshmisha
 */
public class City extends Community {

    private String city;
    private PersonDirectory personDir;
    private ArrayList<Patient> patientList;
    private ArrayList<Community> communityList;

    public City() {
        this.communityList = new ArrayList<Community>();
    }

    public ArrayList<Community> getCommunityList() {
        return communityList;
    }

    public void addCommunity(Community c) {
        communityList.add(c);
    }

    public void removeCommunity(Community f) {
        communityList.remove(f);
    }

}
