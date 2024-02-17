package org.example;

import org.example.Macros.Carbohydrates;
import org.example.Macros.Fat;
import org.example.Macros.MacronutrientBreakdown;
import org.example.Macros.Protein;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Do you want to enter an ingredient manually or select one?");
        System.out.println("1. Select a pre-created meal");
        System.out.println("2. Enter an ingredient manually");


        int choice = scanner.nextInt();

        if (choice == 1) {
            selectPreCreatedMeal(scanner);
        } else if (choice == 2) {
            enterIngredientManually(scanner);
        } else {
            System.out.println("Invalid choice. Please enter 1 or 2.");
        }
    }

    private static void selectPreCreatedMeal(Scanner scanner) {
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

        Food foodObj = new Food(foodName, new Carbohydrates(), new Protein(), new Fat());

        double totalCalories = foodObj.calculateTotalCalories(carbsAmount, proteinAmount, fatAmount);
        MacronutrientBreakdown breakdown = foodObj.calculateMacronutrientBreakdown(carbsAmount, proteinAmount, fatAmount);

        System.out.println("Total calories in " + foodName + ": " + totalCalories);
        System.out.println("Macronutrient breakdown:");
        System.out.println("Carbs: " + breakdown.getCarbs() + "g");
        System.out.println("Protein: " + breakdown.getProtein() + "g");
        System.out.println("Fat: " + breakdown.getFat() + "g");
    }

    private static void enterIngredientManually(Scanner scanner) {
        System.out.println("Enter Food Name:");
        String foodName = scanner.next();

        System.out.println("Enter the amount of carbs in grams:");
        double carbsAmount = scanner.nextDouble();

        System.out.println("Enter the amount of protein in grams:");
        double proteinAmount = scanner.nextDouble();

        System.out.println("Enter the amount of fat in grams:");
        double fatAmount = scanner.nextDouble();

        Food foodObj = new Food(foodName, new Carbohydrates(), new Protein(), new Fat());

        double totalCalories = foodObj.calculateTotalCalories(carbsAmount, proteinAmount, fatAmount);
        MacronutrientBreakdown breakdown = foodObj.calculateMacronutrientBreakdown(carbsAmount, proteinAmount, fatAmount);

        System.out.println("Total calories in " + foodName + ": " + totalCalories);
        System.out.println("Macronutrient breakdown:");
        System.out.println("Carbs: " + breakdown.getCarbs() + "g");
        System.out.println("Protein: " + breakdown.getProtein() + "g");
        System.out.println("Fat: " + breakdown.getFat() + "g");
    }
}
