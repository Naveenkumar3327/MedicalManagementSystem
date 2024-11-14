package com.healthcare.service;

import com.healthcare.model.Patient;

public class RiskAssessmentServiceImpl implements RiskAssessmentService {
    @Override
    public void analyzeRiskFactors(Patient patient) {
        System.out.println("Risk factor analysis for " + patient.getName() + ":");
        
        if (patient.getMedicalHistory().toLowerCase().contains("smoking")) {
            System.out.println("Increased risk of respiratory diseases and heart conditions.");
        }
        
        if (patient.getMedicalHistory().toLowerCase().contains("diabetes")) {
            System.out.println("Increased risk of cardiovascular diseases and neuropathy.");
        }

        System.out.println("Recommend regular health check-ups and monitoring.");
    }
}
