
package com.example.controller;

import java.util.ArrayList;
import java.util.Scanner;
import com.example.model.SmartphoneModel;

/**
 *
 * @author Prithivi
 */
public class StoreController {
     // Method to add new mobile information to the system
    public static void addNewProduct(ArrayList<SmartphoneModel> smartphoneModel) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter model code:");
        String modelCode = scanner.next();

        // Check if the model code already exists
        for (SmartphoneModel smartphone : smartphoneModel) {
            if (smartphone.getModelCode().equals(modelCode)) {
                System.out.println("Product with model code " + modelCode + " already exists.");
                return;
            }
        }

        System.out.println("Enter name:");
        String name = scanner.next();

        System.out.println("Enter display size:");
        double displaySize = scanner.nextDouble();

        System.out.println("Enter price:");
        double price = scanner.nextDouble();

        System.out.println("Enter memory:");
        int memory = scanner.nextInt();

        System.out.println("Enter RAM:");
        int ram = scanner.nextInt();

        // Use SmartphoneModel to collect all the data
        SmartphoneModel smartphone = new SmartphoneModel(modelCode, name, displaySize, price, memory, ram);

        // Add the data to ArrayList<SmartphoneModel>
        smartphoneModel.add(smartphone);

        System.out.println("Smartphone added successfully!");
    }

    // Method to delete existing data from the ArrayList based on model code
    public static void deleteProduct(ArrayList<SmartphoneModel> smartphoneModel) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter model code to delete:");
        String modelCode = scanner.next();

        // Find the index of the smartphone with the provided model code
        int indexToRemove = -1;
        for (int i = 0; i < smartphoneModel.size(); i++) {
            if (smartphoneModel.get(i).getModelCode().equals(modelCode)) {
                indexToRemove = i;
                break;
            }
        }

        // Remove the smartphone if found
        if (indexToRemove != -1) {
            smartphoneModel.remove(indexToRemove);
            System.out.println("Smartphone with model code " + modelCode + " deleted successfully!");
        } else {
            System.out.println("Smartphone with model code " + modelCode + " not found.");
        }
    }

    // Method to update existing data based on the model code
    public static void updateProduct(ArrayList<SmartphoneModel> smartphoneModel) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter model code to update:");
        String modelCode = scanner.next();

        // Find the index of the smartphone with the provided model code
        int indexToUpdate = -1;
        for (int i = 0; i < smartphoneModel.size(); i++) {
            if (smartphoneModel.get(i).getModelCode().equals(modelCode)) {
                indexToUpdate = i;
                break;
            }
        }

        // Update the smartphone if found
        if (indexToUpdate != -1) {
            System.out.println("Enter new name:");
            String newName = scanner.next();

            System.out.println("Enter new display size:");
            double newDisplaySize = scanner.nextDouble();

            System.out.println("Enter new price:");
            double newPrice = scanner.nextDouble();

            System.out.println("Enter new memory:");
            int newMemory = scanner.nextInt();

            System.out.println("Enter new RAM:");
            int newRam = scanner.nextInt();

            // Use SmartphoneModel to collect and update the data
            SmartphoneModel updatedSmartphone = new SmartphoneModel(
                    modelCode, newName, newDisplaySize, newPrice, newMemory, newRam);

            // Update the modified data in ArrayList<SmartphoneModel>
            smartphoneModel.set(indexToUpdate, updatedSmartphone);

            System.out.println("Smartphone with model code " + modelCode + " updated successfully!");
        } else {
            System.out.println("Smartphone with model code " + modelCode + " not found.");
        }
    }

    // Method to get information about a specific smartphone
    public static void getSmartphoneInfo(ArrayList<SmartphoneModel> smartphoneModel) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter model code to get information:");
        String modelCode = scanner.next();

        // Find the smartphone with the provided model code
        for (SmartphoneModel smartphone : smartphoneModel) {
            if (smartphone.getModelCode().equals(modelCode)) {
                // Display the information about the smartphone
                System.out.println("Model Code: " + smartphone.getModelCode());
                System.out.println("Name: " + smartphone.getName());
                System.out.println("Display Size: " + smartphone.getDisplaySize());
                System.out.println("Price: " + smartphone.getPrice());
                System.out.println("Memory: " + smartphone.getMemory());
                System.out.println("RAM: " + smartphone.getRam());
                return;
            }
        }

        // Display a message if the smartphone is not found
        System.out.println("Smartphone with model code " + modelCode + " not found.");
    }
   
}
