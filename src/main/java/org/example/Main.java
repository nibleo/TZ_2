package org.example;

public class Main {
    public static void main(String[] args) {
    }

    static int min(int[] mass) {
        int min = Integer.MAX_VALUE;
        for (int j : mass) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }

    static int max(int[] mass) {
        int max = Integer.MIN_VALUE;
        for (int j : mass) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }

    static long sum(int[] mass) {
        long sum = 0;
        try {
            for (int j : mass) {
                sum = Math.addExact(sum, j);
            }
        } catch (Exception e) {
            return Long.MIN_VALUE;
        }
        return sum;
    }

    static long mult(int[] mass) {
        long mult = 1;
        try {
            for (int j : mass) {
                mult = Math.multiplyExact(j, mult);
            }
        } catch (ArithmeticException e) {
            return Long.MIN_VALUE;
        }
        return mult;
    }
}