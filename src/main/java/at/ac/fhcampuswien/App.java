package at.ac.fhcampuswien;

import com.sun.tools.jdeprscan.scan.Scan;

import java.util.Random;
import java.util.Scanner;

public class App {

    public static void oneMonthCalendar (int numberDays, int startingDay) {
        int[] monthOutput = new int[numberDays];
        for (int i = 0; i < monthOutput.length; i++) {
            monthOutput[i] = i + 1;
        }

        int counter = 1;

        if (startingDay != 1) {
            for (int j = 1; j < startingDay; j++) {
                System.out.print("   ");
                counter++;
            }
        }

        for (int i = 0; i < numberDays; i++) {

            System.out.print(String.format("%2d", monthOutput[i]) + " ");
            if ((counter % 7) == 0 || i == numberDays - 1) {
                System.out.print(System.lineSeparator());
            }
            counter++;

        }


    }

    public static long[] lcg(long seed) {
        long current = seed;
        final long FAKTOR = 1103515245;
        final long MODUL = (long) Math.pow(2, 31);
        final long INKREMENT = 12345;
        long[] randomNumbers = new long[10];

        for (int i = 0; i < randomNumbers.length; i++) {
            current = (FAKTOR * current + INKREMENT) % MODUL;
            randomNumbers[i] = current;
        }

        return randomNumbers;
    }

    public static void guessingGame(int numberToGuess) {
        Scanner scanner = new Scanner(System.in);
        int k = 1;
        int input = 0;
        for (int i = 0; i < k; i++) {
            System.out.print("Guess number " + (i + 1) + ": ");
            input = scanner.nextInt();

            if (input < numberToGuess && i != 9) {
                System.out.print("The number AI picked is higher than your guess." + System.lineSeparator());
            } else if (input > numberToGuess && i != 9) {
                System.out.print("The number AI picked is lower than your guess." + System.lineSeparator());
            }

            if (i < 9 && input != numberToGuess) {
                k++;
            } else if (input == numberToGuess) {
                System.out.print("You won wisenheimer!" + System.lineSeparator());
            } else if (i == 9 && input != numberToGuess) {
                System.out.print("You lost! Have you ever heard of divide & conquer?" + System.lineSeparator());
            }
        }
    }

    public static int randomNumberBetweenOneAndHundred() {
        int randomNumber = 0;
        randomNumber = (int) (Math.random() * 99) + 1;
        return randomNumber;
    }

    public static boolean swapArrays(int[] array1, int[] array2) {
        int temp = 0;

        if (array1.length != array2.length) {
            return false;
        }

        for (int i = 0; i < array1.length; i++) {
            temp = array1[i];
            array1[i] = array2[i];
            array2[i] = temp;
        }

        return true;
    }

    public static String camelCase() {


        return null;
    }

    public static int checkDigit(int[] code) {
        int product, sum = 0, mod11, codeOut;
        for (int i = 0; i < code.length; i++) {
            product = code[i] * (i + 2);
            sum += product;
        }
        mod11 = sum % 11;
        codeOut = 11 - mod11;
        if (codeOut == 10) {
            codeOut = 0;
        } else if (codeOut == 11) {
            codeOut = 5;
        }

        return codeOut;
    }

    public static void main(String[] args) {
        for (int i =0; i < 100; i++) {
            System.out.println(randomNumberBetweenOneAndHundred());
        }
    }
}