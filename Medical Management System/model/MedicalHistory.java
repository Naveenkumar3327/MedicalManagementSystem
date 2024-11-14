package com.healthcare.model;

public class MedicalHistory {
    private int patientId;
    private String historyDetails;

    
    public MedicalHistory(int patientId, String historyDetails) {
        this.patientId = patientId;
        this.historyDetails = historyDetails;
    }

    public int getPatientId() { return patientId; }
    public String getHistoryDetails() { return historyDetails; }
}
