package com.monocept.model;

public class Light implements SmartDevice, Controllable {

    private String deviceID;
    private String name;
    private boolean on;

    public Light() {
        super();
    }

    public Light(String deviceID, String name, boolean on) {
        super();
        this.deviceID = deviceID;
        this.name = name;
        this.on = on;
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

    public boolean getOn() {
        return on;
    }

    @Override
    public boolean isOn() {
        return on;
    }
}
