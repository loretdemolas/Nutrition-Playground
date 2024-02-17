package org.example.Macros;

public class Carbohydrates implements Macro {
    @Override
    public double calculateCalories(double amount) {
        return amount * 4;
    }
}
