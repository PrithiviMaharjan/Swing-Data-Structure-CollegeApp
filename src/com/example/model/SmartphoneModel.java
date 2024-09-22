package com.example.model;

/**
 *
 * @author Prithivi Maharjan
 * LMU ID: 15043736
 */

public class SmartphoneModel {
    private String modelCode;
    private String name;
    private double displaySize;
    private double price;
    private int memory;
    private int ram;

    // Constructor to initialize variables
    public SmartphoneModel(String modelCode, String name, double displaySize, double price, int memory, int ram) {
        this.modelCode = modelCode;
        this.name = name;
        this.displaySize = displaySize;
        this.price = price;
        this.memory = memory;
        this.ram = ram;
    }


    // Getter and setter methods
    public String getModelCode() {
        return modelCode;
    }

    public void setModelCode(String modelCode) {
        this.modelCode = modelCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDisplaySize() {
        return displaySize;
    }

    public void setDisplaySize(double displaySize) {
        this.displaySize = displaySize;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }
}