package com.healthcare.service;

import com.healthcare.model.Patient;
import java.util.ArrayList;
import java.util.List;

public class HealthRecommendationService {

    public List<String> getHealthTips(Patient patient) {
        List<String> healthTips = new ArrayList<>();
        String medicalHistory = patient.getMedicalHistory().toLowerCase();

        if (medicalHistory.contains("heart problem")) {
            healthTips.add("Avoid strenuous activities.");
            healthTips.add("Get regular cardiovascular check-ups.");
            healthTips.add("Quit smoking and reduce alcohol intake.");
        }
        if (medicalHistory.contains("diabetes")) {
            healthTips.add("Monitor blood sugar levels regularly.");
            healthTips.add("Follow a low-sugar, high-fiber diet.");
            healthTips.add("Engage in regular exercise to maintain a healthy weight.");
        }
        if (medicalHistory.contains("cancer")) {
            healthTips.add("Eat a diet rich in fruits and vegetables.");
            healthTips.add("Limit red and processed meats.");
            healthTips.add("Stay active and avoid exposure to carcinogens.");
        }
        if (medicalHistory.contains("stroke")) {
            healthTips.add("Control blood pressure with regular checks.");
            healthTips.add("Maintain a healthy weight.");
            healthTips.add("Engage in physical activity to improve circulation.");
        }

        if (healthTips.isEmpty()) {
            healthTips.add("No specific health tips based on the provided medical history.");
        }

        return healthTips;
    }

    public List<String> getSuggestedTreatments(Patient patient) {
        List<String> treatments = new ArrayList<>();
        String medicalHistory = patient.getMedicalHistory().toLowerCase();

        if (medicalHistory.contains("heart problem")) {
            treatments.add("Beta-blockers to manage blood pressure.");
            treatments.add("Cholesterol-lowering medications.");
            treatments.add("Regular ECG and cardiac stress tests.");
        }
        if (medicalHistory.contains("diabetes")) {
            treatments.add("Insulin therapy for blood sugar control.");
            treatments.add("Medication to manage blood glucose levels.");
        }
        if (medicalHistory.contains("cancer")) {
            treatments.add("Chemotherapy and radiation as advised.");
            treatments.add("Targeted therapy based on cancer type.");
        }
        if (medicalHistory.contains("stroke")) {
            treatments.add("Blood thinners to prevent clots.");
            treatments.add("Physical therapy for mobility recovery.");
        }

        if (treatments.isEmpty()) {
            treatments.add("No specific treatments based on the provided medical history.");
        }

        return treatments;
    }

    public List<String> getFoodSuggestions(Patient patient) {
        List<String> foodSuggestions = new ArrayList<>();
        String medicalHistory = patient.getMedicalHistory().toLowerCase();

        if (medicalHistory.contains("heart problem")) {
            foodSuggestions.add("Eat a diet rich in omega-3 fatty acids.");
            foodSuggestions.add("Limit salt and processed food intake.");
            foodSuggestions.add("Increase intake of leafy greens and whole grains.");
        }
        if (medicalHistory.contains("diabetes")) {
            foodSuggestions.add("Eat whole grains instead of refined carbs.");
            foodSuggestions.add("Increase fiber intake to manage blood sugar.");
            foodSuggestions.add("Limit sugary drinks and desserts.");
        }
        if (medicalHistory.contains("cancer")) {
            foodSuggestions.add("Increase intake of antioxidants (berries, nuts).");
            foodSuggestions.add("Limit red and processed meats.");
            foodSuggestions.add("Consume foods rich in vitamins A, C, and E.");
        }
        if (medicalHistory.contains("stroke")) {
            foodSuggestions.add("Eat foods low in saturated fat and cholesterol.");
            foodSuggestions.add("Increase intake of fruits, vegetables, and fish.");
            foodSuggestions.add("Reduce sodium to control blood pressure.");
        }

        if (foodSuggestions.isEmpty()) {
            foodSuggestions.add("No specific food suggestions based on the provided medical history.");
        }

        return foodSuggestions;
    }
}
