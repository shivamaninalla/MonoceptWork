package com.monocept.model;

public class Thermostat implements SmartDevice, Controllable, Monitorable {

    private String deviceID;
    private String name;
    private boolean on;
    private double temperature;

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public void setDeviceID(String deviceID) {
        this.deviceID = deviceID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    @Override
    public String getStatus() {
        return on ? "ON" : "OFF";
    }

    @Override
    public void turnOn() {
        this.on = true;
    }

    @Override
    public void turnOf() {
        this.on = false;
    }

    @Override
    public String getDeviceID() {
        return deviceID;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isOn() {
        return on;
    }
}
