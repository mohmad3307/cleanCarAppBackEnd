package com.applcation.cleanApp.user;

public class userCars {
    private String type;
    private String moudle;
    private String licensePlate;
    private  String color;
    private String licenseType;

    public userCars(String type, String moudle, String licensePlate, String color, String licenseType) {
        this.type = type;
        this.moudle = moudle;
        this.licensePlate = licensePlate;
        this.color = color;
        this.licenseType = licenseType;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMoudle() {
        return moudle;
    }

    public void setMoudle(String moudle) {
        this.moudle = moudle;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLicenseType() {
        return licenseType;
    }

    public void setLicenseType(String licenseType) {
        this.licenseType = licenseType;
    }
}
