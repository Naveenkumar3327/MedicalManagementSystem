package com.healthcare.service;

import com.healthcare.model.Patient;

public class PreventiveCareServiceImpl implements PreventiveCareService {
    @Override
    public void recommendPreventiveCare(Patient patient) {
        System.out.println("Preventive care recommendations for " + patient.getName() + ":");

        if (patient.getAge() > 50) {
            System.out.println("Regular colonoscopy screenings every 10 years.");
        }
        
        if ("female".equalsIgnoreCase(patient.getGender()) && patient.getAge() > 40) {
            System.out.println("Annual mammogram screening.");
        }
        
        System.out.println("General recommendations: Balanced diet, regular exercise, and avoiding smoking.");
    }
}
