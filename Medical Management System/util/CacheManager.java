package com.healthcare.util;

import java.util.HashMap;
import java.util.Map;

public class CacheManager {
    private Map<Integer, String> patientCache = new HashMap<>();

    
    public void cachePatientData(int patientId, String data) {
        patientCache.put(patientId, data);
    }

    public String getCachedData(int patientId) {
        return patientCache.getOrDefault(patientId, "Data not found in cache.");
    }

    public void clearCache() {
        patientCache.clear();
    }
}
