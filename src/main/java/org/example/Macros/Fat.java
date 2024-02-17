package org.example.Macros;

public class Fat implements Macro{
    @Override
    public double calculateCalories(double amount) {

        return amount * 9;
    }
}
