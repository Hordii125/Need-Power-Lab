package org.example;

public class TriangleNumberCalculator {

    // Returns the nth triangular number using recursion
    public int value(int n) {
        if (n <= 1) return n;
        return n + value(n - 1);
    }

    // Returns the sum of the nth and mth triangular numbers
    public int add(int n, int m) {
        return value(n) + value(m);
    }

    // Returns the difference between the nth and mth triangular numbers
    public int subtract(int n, int m) {
        return value(n) - value(m);
    } 
}
