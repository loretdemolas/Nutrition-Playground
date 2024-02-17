package org.example;

import org.example.Macros.Macro;
import org.example.Macros.MacronutrientBreakdown;


public class Food {
    private String name;
    private Macro carbs;
    private Macro protein;
    private Macro fat;

    public Food(String name, Macro carbs, Macro protein, Macro fat) {
        this.name = name;
        this.carbs = carbs;
        this.protein = protein;
        this.fat = fat;
    }
    public MacronutrientBreakdown calculateMacronutrientBreakdown(double carbsAmount, double proteinAmount, double fatAmount) {
        return new MacronutrientBreakdown(carbsAmount, proteinAmount, fatAmount);
    }

    public double calculateTotalCalories(double carbsAmount, double proteinAmount, double fatAmount) {
        double totalCalories = 0.0;
        totalCalories += carbs.calculateCalories(carbsAmount);
        totalCalories += protein.calculateCalories(proteinAmount);
        totalCalories += fat.calculateCalories(fatAmount);
        return totalCalories;
    }
}
