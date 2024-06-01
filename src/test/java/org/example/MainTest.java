package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    static int[] massMax = {38};
    static long[] massSum = {30L};
    static long go;
    static int i;
    @BeforeEach
    public void start() {
        go = System.currentTimeMillis();
    }

    @AfterEach
    public void end() {
        System.out.println("При " + (int) Math.pow(10, i) + " чисел, время работы: " + (System.currentTimeMillis() - go) + " мс");
    }


    @org.junit.jupiter.api.Test
    void min() {

    }

    @ParameterizedTest
    @ValueSource(ints = {1})
    void testForMax(int number) throws FileNotFoundException {
        i = number;
        String file = "src/test/java/org/example/testik" + i + ".txt";
        Scanner scanner = new Scanner(new File(file));
        String[] str = scanner.nextLine().split(" ");
        int[] arr = new int[str.length];
        for (int j = 0; j < str.length; j++) {
            arr[j] = Integer.parseInt(str[j]);
        }

        int result = Main.max(arr);
        assertEquals(massMax[i - 1], result);

    }


    @ParameterizedTest
    @ValueSource(ints = {1})
    void testForSum(int number) throws FileNotFoundException {
        i = number;
        String file = "src/test/java/org/example/testik" + i + ".txt";
        Scanner scanner = new Scanner(new File(file));
        String[] str = scanner.nextLine().split(" ");
        int[] arr = new int[str.length];
        for (int j = 0; j < str.length; j++) {
            arr[j] = Integer.parseInt(str[j]);
        }

        long result = Main.sum(arr);
        assertEquals(massSum[i - 1], result);

    }

    @org.junit.jupiter.api.Test
    void mult() {
    }
}
