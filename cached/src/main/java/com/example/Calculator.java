package com.example;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * This is the Calculator class which implements the main method that calculates the Euler number using the Executor with Cached Thread Pool.
 */
public class Calculator {
    public static void main(String[] args) {

        System.out.println("Calculating Euler...");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type how many terms you want to calculate:");
        int terms = scanner.nextInt();

        System.out.println("calculating for " + terms + " terms");

        ExecutorService executor = Executors.newCachedThreadPool();
   
         

        List<Future<BigDecimal>> termsList = new ArrayList<>();
        BigDecimal finalResult = BigDecimal.ONE;
        
        
        for (int i = 1; i <= terms; i++) {
            termsList.add(executor.submit(new EulerTermCalculator(i)));
        }

        try {
            for (Future<BigDecimal> term : termsList) {
                finalResult = finalResult.add(term.get());
            }
        } catch (ExecutionException | InterruptedException e) {
            e.printStackTrace();
        } finally {
            executor.shutdown();
        }

        System.out.println("Euler's number is: " + finalResult);
        
    }
}