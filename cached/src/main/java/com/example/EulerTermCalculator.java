package com.example;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.concurrent.Callable;


/**
 * This class calculates the nth term of the Euler series. It implements the Callable interface.
 */
public class EulerTermCalculator implements Callable<BigDecimal> {

    /**
     * This is the number of the term to be calculated.
     */
    private final int n;

    /**
     * This is the constructor of the class.
     * @param n This is the number of the term to be calculated.
     */
    public EulerTermCalculator(int n) {
        this.n = n;
    }

    /**
     * This is the method that calculates the nth term of the Euler series and print the numbers of running Threads.
     * @return The nth term of the Euler series.
     */
    @Override
    public BigDecimal call() {
        System.out.println("Number of threads executing: "  + Thread.activeCount());
        return BigDecimal.ONE.divide(factorial(n), 100, RoundingMode.HALF_UP);
    }

    /**
     * This is the method that calculates the factorial of a number. It is used to calculate the euler term.
     * @param n The number to calculate the factorial.
     * @return The factorial of the number.
     */
    private static BigDecimal factorial(int n) {
        BigDecimal result = BigDecimal.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigDecimal.valueOf(i));
        }
        return result;
    }
}

