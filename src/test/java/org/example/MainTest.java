package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    static int[] massMax = {9, 2106781480, 99, 99995, 99997, 99999};
    static int[] massMin = {1, 54757614, 1, 9, 1, 1};
    static long[] massSum = {39L, 105837283426L, 49702L, 498286566L, 5016922438L, 49967812454L};
    static long[] massMult = {34560L, 0L, 0L, 0L, 0L, 0L};
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


    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5, 6})
    void testForMin(int number) throws FileNotFoundException {
        i = number;
        String file = "src/test/java/org/example/testik" + i + ".txt";
        Scanner scanner = new Scanner(new File(file));
        String[] str = scanner.nextLine().split(" ");
        ArrayList<Integer> arr = new ArrayList<>();
        for (int j = 0; j < str.length; j++) {
            arr.add(j, Integer.parseInt(str[j]));
        }

        int result = Main.min(arr);
        assertEquals(massMin[i - 1], result);

    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5, 6})
    void testForMax(int number) throws FileNotFoundException {
        i = number;
        String file = "src/test/java/org/example/testik" + i + ".txt";
        Scanner scanner = new Scanner(new File(file));
        String[] str = scanner.nextLine().split(" ");
        ArrayList<Integer> arr = new ArrayList<>();
        for (int j = 0; j < str.length; j++) {
            arr.add(j, Integer.parseInt(str[j]));
        }

        int result = Main.max(arr);
        assertEquals(massMax[i - 1], result);

    }


    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5, 6})
    void testForSum(int number) throws FileNotFoundException {
        i = number;
        String file = "src/test/java/org/example/testik" + i + ".txt";
        Scanner scanner = new Scanner(new File(file));
        String[] str = scanner.nextLine().split(" ");
        ArrayList<Integer> arr = new ArrayList<>();
        for (int j = 0; j < str.length; j++) {
            arr.add(j, Integer.parseInt(str[j]));
        }

        long result = Main.sum(arr);
        assertEquals(massSum[i - 1], result);

    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5, 6})
    void testForMult(int number) throws FileNotFoundException {
        i = number;
        String file = "src/test/java/org/example/testik" + i + ".txt";
        Scanner scanner = new Scanner(new File(file));
        String[] str = scanner.nextLine().split(" ");
        ArrayList<Integer> arr = new ArrayList<>();
        for (int j = 0; j < str.length; j++) {
            arr.add(j, Integer.parseInt(str[j]));
        }

        long result = Main.mult(arr);
        assertEquals(massMult[i - 1], result);

    }

}
