package com.monocept.model;

import java.util.ArrayList;

public class SmartHome {

    private ArrayList<SmartDevice> smartDevices = new ArrayList<>();

    public void controlDevice(String deviceID, boolean turnOn) {
        for (SmartDevice device : smartDevices) {
        	
            if (device.getDeviceID().equals(deviceID) && device instanceof Controllable) {
               
                    Controllable controllableDevice = (Controllable) device;
                    checkControl(turnOn,controllableDevice);
                    checkSecurityCamera(device,turnOn);
                    
                
                
                System.out.println("Device " + device.getName() + " is now " + (device.isOn() ? "ON" : "OFF"));
            }
        }
    }

    private void checkSecurityCamera(SmartDevice device, boolean turnOn) {
    	if (device instanceof SecurityCamera) {
            SecurityCamera securityCamera = (SecurityCamera) device;
            securityCamera.setRecording(turnOn);
        }
		
	}

	private boolean checkControl(boolean turnOn, Controllable controllableDevice) {
    	if (turnOn) {
            controllableDevice.turnOn();
            return false;
        } 
            controllableDevice.turnOf();
        return true;
		
	}

	public void listAllDevices() {
        for (SmartDevice device : smartDevices) {
            System.out.println("Device ID: " + device.getDeviceID() + ", Name: " + device.getName() + ", Status: " + (device.isOn() ? "ON" : "OFF"));
        }
    }

    public void addDevice(SmartDevice device) {
        smartDevices.add(device);
        System.out.println("Added device: " + device.getName());
    }
}
