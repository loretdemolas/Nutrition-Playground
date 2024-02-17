package org.example.Macros;

public class Protein implements Macro{
    @Override
    public double calculateCalories(double amount) {

        return amount * 4;
    }
}

