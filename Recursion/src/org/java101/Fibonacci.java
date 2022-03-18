package org.java101;

public class Fibonacci {
    public static void main(String[] args) {
        int out = getFibonacci(4);
        System.out.println(out);
    }

    public static int getFibonacci(int n) {
        if (n > 0 && n < 2) {
            return n;
        }
        return getFibonacci(n - 1) + getFibonacci(n - 2);
    }
}
