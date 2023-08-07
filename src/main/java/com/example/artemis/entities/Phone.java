package com.example.artemis.entities;

public class Phone {

    private int id;
    private String modelNo;
    private String imei;
    private double screenSize;
    private int batterySize;

    public Phone(int id, String modelNo, String imei, double screenSize, int batterySize) {
        this.id = id;
        this.modelNo = modelNo;
        this.imei = imei;
        this.screenSize = screenSize;
        this.batterySize = batterySize;
    }

    public Phone(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelNo() {
        return modelNo;
    }

    public void setModelNo(String modelNo) {
        this.modelNo = modelNo;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public void setBatterySize(int batterySize) {
        this.batterySize = batterySize;
    }
}
