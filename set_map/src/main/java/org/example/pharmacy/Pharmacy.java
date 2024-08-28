package org.example.pharmacy;

import java.util.HashMap;
import java.util.Map;

public class Pharmacy {
    private Map<String, Medication> medications;

    public Pharmacy(){
        medications = new HashMap<>();
    }

    public int getCountMedications(){
        return medications.size();
    }

    public void saveMedication(Medication medication){
        medications.put(medication.getName(), medication);

    }

    public Medication findMedication(String name){
        for(Medication medication:medications.values()){
            if(medication.getName().equals(name)){
                return medication;
            }
        }
        return null;
    }

    public void deleteMedication(String name){
        //for(Medication medication:medications.values()){
            //if(medication.getName().equals(name)){
                medications.remove(name);

        }

    public Map<String,Medication>getMedications(){
        return medications;
    }
    }



