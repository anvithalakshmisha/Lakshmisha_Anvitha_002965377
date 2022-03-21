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
public class AbnormalClass {
//    public AbnormalClass() {
//        this.abnormalities = new ArrayList<String>();
//    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public ArrayList<String> getAbnormalities() {
//        return abnormalities;
//    }

//    public void setAbnormalities(ArrayList<String> abnormalities) {
//        this.abnormalities = abnormalities;
//    }

    String name;
    String community;
//    ArrayList<String> abnormalities;

//    public void addAbnormality(String abnormality) {
//        abnormalities.add(abnormality);
//    }
}
