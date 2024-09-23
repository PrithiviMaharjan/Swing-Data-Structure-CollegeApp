package com.example.view;

import com.example.controller.StoreController;
import com.example.model.SmartphoneModel;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Prithivi Maharjan LMU ID: 15043736
 */
public class StoreApp {

    private static final ArrayList<SmartphoneModel> smartphoneModelList = new ArrayList<>();

    public static void main(String[] args) {
        int choice;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("\nStore Operations:");
            System.out.println("1. Add New Product");
            System.out.println("2. Delete Product");
            System.out.println("3. Update Product");
            System.out.println("4. Get Smartphone Information");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 ->
                    StoreController.addNewProduct(smartphoneModelList);
                case 2 ->
                    StoreController.deleteProduct(smartphoneModelList);
                case 3 ->
                    StoreController.updateProduct(smartphoneModelList);
                case 4 ->
                    StoreController.getSmartphoneInfo(smartphoneModelList);
                case 5 ->
                    System.out.println("Exiting the program. Thank you!");
                default ->
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }

        } while (choice != 5);
    }
}
