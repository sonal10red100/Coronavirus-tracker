package com.sonal.tracker.coronavirustracker.models;

public class LocationStats {
    private String state;
    private String country;
    private String latestTotalCases;
    private String diffFromPreviousDay;

    public String getDiffFromPreviousDay() {
        return diffFromPreviousDay;
    }

    public void setDiffFromPreviousDay(String diffFromPreviousDay) {
        this.diffFromPreviousDay = diffFromPreviousDay;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLatestTotalCases() {
        return latestTotalCases;
    }

    public void setLatestTotalCases(String latestTotalCases) {
        this.latestTotalCases = latestTotalCases;
    }
}
