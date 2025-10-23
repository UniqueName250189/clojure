package test;

import java.util.ArrayList;
import java.util.Random;

public class JavaExample {
    private static ArrayList array = new ArrayList<>();

    public static void multiply(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public static int getRandomNumber() {
        Random rand = new Random();
        return rand.nextInt();
    }

    public static void addIntToArrayList(int numbr) {
        array.add(numbr);
    }

    public static ArrayList returnArrayList() {
        return array;
    }
}