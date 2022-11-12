package com.example;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.concurrent.Callable;

public class EulerTermCalculator implements Callable<BigDecimal> {
    private final int n;

    public EulerTermCalculator(int n) {
        this.n = n;
    }

    @Override
    public BigDecimal call() {
        return BigDecimal.ONE.divide(factorial(n), 100, RoundingMode.HALF_UP);
    }

    private static BigDecimal factorial(int n) {
        BigDecimal result = BigDecimal.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigDecimal.valueOf(i));
        }
        return result;
    }
}

