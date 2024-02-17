package org.example;

import org.example.Macros.Carbohydrates;
import org.example.Macros.Fat;
import org.example.Macros.Macro;
import org.example.Macros.Protein;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Macro carbs = new Carbohydrates();
        Macro protein = new Protein();
        Macro fat = new Fat();
        Scanner scnr = new Scanner(System.in.toString());
        String food = scnr.next();

        Food foodObj = new Food(food, carbs, protein, fat);

        double totalCalories = foodObj.calculateTotalCalories(50, 30, 20);
        System.out.println("Total calories in Chicken Breast: " + totalCalories);

    }
}