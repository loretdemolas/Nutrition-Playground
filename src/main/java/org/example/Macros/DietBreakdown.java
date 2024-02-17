package org.example.Macros;

public class DietBreakdown {
    private static double totalCalories = 0;
    private static double totalCarbs = 0;
    private static double totalProtein = 0;
    private static double totalFat = 0;

    public static void addFood(double calories, double carbs, double protein, double fat) {
        totalCalories += calories;
        totalCarbs += carbs;
        totalProtein += protein;
        totalFat += fat;
    }

    public static double getTotalCalories() {
        return totalCalories;
    }

    public static double getTotalCarbs() {
        return totalCarbs;
    }

    public static double getTotalProtein() {
        return totalProtein;
    }

    public static double getTotalFat() {
        return totalFat;
    }
}
