package com.healthcare.service;

import com.healthcare.model.Patient;
import com.healthcare.model.Treatment;
import java.util.ArrayList;
import java.util.List;

public class TreatmentServiceImpl implements TreatmentService {
    @Override
    public void suggestTreatment(Patient patient) {
        List<Treatment> treatments = new ArrayList<>();
        
        // Example logic based on patient medical history
        if (patient.getMedicalHistory().toLowerCase().contains("diabetes")) {
            treatments.add(new Treatment(1, "Insulin Therapy", "Regular insulin injections to manage blood sugar."));
        }
        
        if (patient.getMedicalHistory().toLowerCase().contains("hypertension")) {
            treatments.add(new Treatment(2, "ACE Inhibitors", "Medication to lower blood pressure."));
        }
        
        System.out.println("Suggested treatments for " + patient.getName() + ":");
        for (Treatment treatment : treatments) {
            System.out.println(treatment.getTreatmentName() + " - " + treatment.getDescription());
        }
        if (treatments.isEmpty()) {
            System.out.println("No specific treatments recommended based on current medical history.");
        }
    }
}
