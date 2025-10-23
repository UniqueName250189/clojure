package test;

import java.util.Random;

public class JavaExample {
    public static void multiply(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public static int getRandomNumber() {
        Random rand = new Random();
        return rand.nextInt();
    }
}