package org.example;

import org.example.pharmacy.Medication;
import org.example.pharmacy.Pharmacy;

public class Main {
    public static void main(String[] args) {
        Pharmacy pharmacy = new Pharmacy();
        pharmacy.saveMedication(new Medication("paracetamol", 214, true));
        pharmacy.saveMedication(new Medication("ibu", 400, true));
        pharmacy.saveMedication(new Medication("aspirin", 400, true));


        pharmacy.getMedications();
        System.out.println("Medications :" +pharmacy.getMedications());

        pharmacy.deleteMedication("paracetamol");

        System.out.println("Count :" +pharmacy.getMedications().size());


        Medication paracetamol = pharmacy.getMedications().get(0);
        if(paracetamol !=null){
            System.out.println(paracetamol);
        }
        System.out.println("paracetamol not found");

    }
}