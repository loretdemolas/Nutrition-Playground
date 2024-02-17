package org.example.Macros;

public class Alcohol implements Macro {
    @Override
    public double calculateCalories(double amount) {
        return amount * 7;
    }
}
