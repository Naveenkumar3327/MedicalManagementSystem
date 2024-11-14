package com.healthcare.model;

public class Treatment {
    private int treatmentId;
    private String treatmentName;
    private String description;

    public Treatment(int treatmentId, String treatmentName, String description) {
        this.treatmentId = treatmentId;
        this.treatmentName = treatmentName;
        this.description = description;
    }

    public int getTreatmentId() {
        return treatmentId;
    }

    public String getTreatmentName() {
        return treatmentName;
    }

    public String getDescription() {
        return description;
    }
}
