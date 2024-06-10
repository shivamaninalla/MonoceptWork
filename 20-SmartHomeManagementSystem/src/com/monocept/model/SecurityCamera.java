package com.monocept.model;

public class SecurityCamera implements SmartDevice, Monitorable {

    private String deviceId;
    private String name;
    private boolean recording;

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public boolean isRecording() {
        return recording;
    }

    public void setRecording(boolean recording) {
        this.recording = recording;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getStatus() {
        return recording ? "Recording" : "Not Recording";
    }

    @Override
    public String getDeviceID() {
        return deviceId;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isOn() {
        return recording;
    }
}
