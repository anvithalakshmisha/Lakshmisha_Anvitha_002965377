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
public class PatientDirectory extends Patient {

    Patient patient;
    private ArrayList<Patient> patientList;

    public PatientDirectory() {
        this.patientList = new ArrayList<Patient>();
    }

    public ArrayList<Patient> getPatientList() {
        return patientList;
    }

    public void addPatient(Patient p) {
        patientList.add(p);
    }

    public void removePatient(Patient p) {
        p.encounterHistory.removeEncounter();
        patientList.remove(p);
    }

    public Patient getPatient(String name) {
        for (Patient p : patientList) {
            if (p.person.getName().equals(name)) {
                return p;
            }
        }
        Patient existingPatient = new Patient();
        return existingPatient;
    }
}
