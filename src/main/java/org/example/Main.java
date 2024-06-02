package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        // Путь к файлу, который вы хотите прочитать
        System.out.println("Добрый день! укажите, пожалуйста, путь к Вашему файлу, чтобы программа смогла найти значения минимума, максимума, суммы и произведения :)");
        Scanner scan = new Scanner(System.in);
        String filePath = scan.nextLine();
        scan.close();


        Scanner scanner = new Scanner(new File(filePath));
        ArrayList<Integer> mass = new ArrayList<>();
        while (scanner.hasNext()) {
            mass.add(scanner.nextInt());
        }
        scanner.close();
        int result_of_max = Main.max(mass);
        int result_of_min = Main.min(mass);
        long result_of_sum = Main.sum(mass);
        long result_of_mult = Main.mult(mass);
        System.out.println("min = " + result_of_min);
        System.out.println("max = " + result_of_max);
        if (result_of_sum == Long.MIN_VALUE) {
            System.out.println("Сумма слишком велика");
        }else{
            System.out.println("sum = " + result_of_sum);
        }
        if (result_of_mult == Long.MIN_VALUE) {
            System.out.println("Произведение слишком велико");
        }else{
            System.out.println("mult = " + result_of_mult);
        }


    }

    static int min(ArrayList<Integer> mass) {
        int min = Integer.MAX_VALUE;
        for (int j : mass) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }

    static int max(ArrayList<Integer> mass) {
        int max = Integer.MIN_VALUE;
        for (int j : mass) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }

    static long sum(ArrayList<Integer> mass) {
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

    static long mult(ArrayList<Integer> mass) {
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