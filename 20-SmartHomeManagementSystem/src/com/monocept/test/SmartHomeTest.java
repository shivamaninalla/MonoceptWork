package com.monocept.test;

import java.util.Scanner;

import com.monocept.model.Light;
import com.monocept.model.SecurityCamera;
import com.monocept.model.SmartHome;
import com.monocept.model.Thermostat;

public class SmartHomeTest {

    public static void main(String[] args) {
        SmartHome smartHome = new SmartHome();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Light \n2. Add Thermostat \n3. Add Security Camera \n4. Control Device \n5. List All Devices \n6. Exit");
            System.out.println("Enter number of the option you want:");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    Light light = enterLight(scanner, new Light());
                    smartHome.addDevice(light);
                    break;
                case 2:
                    Thermostat thermostat = enterThermostat(scanner, new Thermostat());
                    smartHome.addDevice(thermostat);
                    break;
                case 3:
                    SecurityCamera securityCamera = enterSecurityCamera(scanner, new SecurityCamera());
                    smartHome.addDevice(securityCamera);
                    break;
                case 4:
                    System.out.println("Enter Device ID to control:");
                    String deviceID = scanner.next();
                    System.out.println("Enter true to turn on or false to turn off:");
                    boolean turnOn = scanner.nextBoolean();
                    smartHome.controlDevice(deviceID, turnOn);
                    break;
                case 5:
                    smartHome.listAllDevices();
                    break;
                case 6:
                	System.out.println("Thank you client");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    public static Light enterLight(Scanner scanner, Light light) {
        System.out.println("Enter Device Id:");
        light.setDeviceID(scanner.next());
        System.out.println("Enter Device Name:");
        light.setName(scanner.next());
        light.setOn(false);
        return light;
    }

    public static Thermostat enterThermostat(Scanner scanner, Thermostat thermostat) {
        System.out.println("Enter Device Id:");
        thermostat.setDeviceID(scanner.next());
        System.out.println("Enter Device Name:");
        thermostat.setName(scanner.next());
        System.out.println("Enter Device Status:");
        thermostat.setOn(scanner.nextBoolean());
        System.out.println("Enter Device Temperature:");
        thermostat.setTemperature(scanner.nextDouble());
        return thermostat;
    }

    public static SecurityCamera enterSecurityCamera(Scanner scanner, SecurityCamera securityCamera) {
        System.out.println("Enter Device Id:");
        securityCamera.setDeviceId(scanner.next());
        System.out.println("Enter Device Name:");
        securityCamera.setName(scanner.next());
        System.out.println("Enter Device Recording status:");
        securityCamera.setRecording(scanner.nextBoolean());
        return securityCamera;
    }
}
