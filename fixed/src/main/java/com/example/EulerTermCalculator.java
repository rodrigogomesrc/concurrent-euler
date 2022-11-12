package com.example;

import java.util.concurrent.Callable;

public class EulerTermCalculator implements Callable<Double> {
    private final int n;

    public EulerTermCalculator(int n) {
        this.n = n;
    }

    @Override
    public Double call() {
        return 1 / factorial(n);
    }

    private static double factorial(int n) {
        double result = 1;
        for (int i = n; i > 1; i--) {
            result *= i;
        }
        return result;
    }
}

