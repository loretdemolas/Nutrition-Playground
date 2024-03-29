package org.example;

import org.example.Macros.*;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean done = false;
        while (!done) {
            System.out.println("Do you want to enter an ingredient manually or select one?");
            System.out.println("1. Select a pre-created meal");
            System.out.println("2. Enter an ingredient manually");
            System.out.println("3. Done");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    selectPreCreatedMeal();
                    break;
                case 2:
                    enterIngredientManually();
                    break;
                case 3:
                    done = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                    break;
            }
        }
    }

    private static void selectPreCreatedMeal() {
        System.out.println("Do you want to enter Chicken or Steak?");
        System.out.println("1. Chicken");
        System.out.println("2. Steak");

        int choice = scanner.nextInt();

        String foodName;
        double carbsAmount = 0;
        double proteinAmount;
        double fatAmount;

        switch (choice) {
            case 1:
                foodName = "Chicken";
                proteinAmount = 15;
                fatAmount = 2;
                break;
            case 2:
                foodName = "Steak";
                proteinAmount = 20;
                fatAmount = 12;
                break;
            default:
                System.out.println("Invalid choice. Please enter 1 or 2.");
                return;
        }

        addFood(foodName, carbsAmount, proteinAmount, fatAmount);
    }

    private static void enterIngredientManually() {
        scanner.nextLine(); // Consume newline character
        System.out.println("Enter Food Name:");
        String foodName = scanner.nextLine();

        System.out.println("Enter the amount of carbs in grams:");
        double carbsAmount = scanner.nextDouble();

        System.out.println("Enter the amount of protein in grams:");
        double proteinAmount = scanner.nextDouble();

        System.out.println("Enter the amount of fat in grams:");
        double fatAmount = scanner.nextDouble();

        addFood(foodName, carbsAmount, proteinAmount, fatAmount);
    }

    private static void addFood(String foodName, double carbsAmount, double proteinAmount, double fatAmount) {
        Food foodObj = new Food(foodName, new Carbohydrates(), new Protein(), new Fat());

        double totalCalories = foodObj.calculateTotalCalories(carbsAmount, proteinAmount, fatAmount);
        MacronutrientBreakdown breakdown = foodObj.calculateMacronutrientBreakdown(carbsAmount, proteinAmount, fatAmount);
        DietBreakdown.addFood(totalCalories, carbsAmount, proteinAmount, fatAmount);

        printDietBreakdown(foodName, totalCalories, breakdown);
    }

    private static void printDietBreakdown(String foodName, double totalCalories, MacronutrientBreakdown breakdown) {
        System.out.println();
        System.out.println("Total calories in Diet: " + DietBreakdown.getTotalCalories() + " Kcal");
        System.out.println("Total Carbohydrates in Diet: " + DietBreakdown.getTotalCarbs() + " g");
        System.out.println("Total Protein in Diet:" + DietBreakdown.getTotalProtein() + " g");
        System.out.println("Total Fat in Diet" + DietBreakdown.getTotalFat() + " g");
        System.out.println();
        System.out.println("Total calories in " + foodName + ": " + totalCalories);
        System.out.println();
        System.out.println("Macronutrient breakdown:");
        System.out.println("Carbs: " + breakdown.getCarbs() + "g");
        System.out.println("Protein: " + breakdown.getProtein() + "g");
        System.out.println("Fat: " + breakdown.getFat() + "g");
        System.out.println();
        System.out.println();
    }
}
