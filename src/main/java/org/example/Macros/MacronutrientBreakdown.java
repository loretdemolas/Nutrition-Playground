package org.example.Macros;

public class MacronutrientBreakdown {
    private double carbs;
    private double protein;
    private double fat;

    public MacronutrientBreakdown(double carbs, double protein, double fat) {
        this.carbs = carbs;
        this.protein = protein;
        this.fat = fat;
    }

    public double getCarbs() {
        return carbs;
    }

    public double getProtein() {
        return protein;
    }

    public double getFat() {
        return fat;
    }
}
