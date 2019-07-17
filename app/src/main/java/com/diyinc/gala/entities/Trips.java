package com.diyinc.gala.entities;

public class Trips {

    String tripName;

    String tripLocation;

    String tripBio;

    String tripStartDate;

    String tripEndDate;

    String tripImageUrl;

    String tripMaker;

    public Trips(String tripName, String tripLocation, String tripBio, String tripStartDate, String tripEndDate, String tripImageUrl, String tripMaker) {
        this.tripName = tripName;
        this.tripLocation = tripLocation;
        this.tripBio = tripBio;
        this.tripStartDate = tripStartDate;
        this.tripEndDate = tripEndDate;
        this.tripImageUrl = tripImageUrl;
        this.tripMaker = tripMaker;
    }

    public String getTripName() {
        return tripName;
    }

    public void setTripName(String tripName) {
        this.tripName = tripName;
    }

    public String getTripLocation() {
        return tripLocation;
    }

    public void setTripLocation(String tripLocation) {
        this.tripLocation = tripLocation;
    }

    public String getTripBio() {
        return tripBio;
    }

    public void setTripBio(String tripBio) {
        this.tripBio = tripBio;
    }

    public String getTripStartDate() {
        return tripStartDate;
    }

    public void setTripStartDate(String tripStartDate) {
        this.tripStartDate = tripStartDate;
    }

    public String getTripEndDate() {
        return tripEndDate;
    }

    public void setTripEndDate(String tripEndDate) {
        this.tripEndDate = tripEndDate;
    }

    public String getTripImageUrl() {
        return tripImageUrl;
    }

    public void setTripImageUrl(String tripImageUrl) {
        this.tripImageUrl = tripImageUrl;
    }

    public String getTripMaker() {
        return tripMaker;
    }

    public void setTripMaker(String tripMaker) {
        this.tripMaker = tripMaker;
    }


}
