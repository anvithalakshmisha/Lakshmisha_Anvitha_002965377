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
public class EncounterHistory extends Encounter {

    private ArrayList<Encounter> encounterList;

    public EncounterHistory() {
        this.encounterList = new ArrayList<Encounter>();
    }

    public ArrayList<Encounter> getEncounterList() {
        return encounterList;
    }

    public void addEncounter(Encounter e) {
        if (encounterList == null) {
            this.encounterList = new ArrayList<Encounter>();
        }
        encounterList.add(e);
    }

    public void removeEncounter() {
        this.encounterList.removeAll(encounterList);
    }
}
