package lesson9;

import java.util.Arrays;
import java.util.Scanner;

public class Task3Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter how many Prime numbers to find: ");
        int numbersToFind = scanner.nextInt();

        Task3PrimeNumbersFinder primeNumbersFinder = new Task3PrimeNumbersFinder(numbersToFind);
        primeNumbersFinder.findPrimeNumbers();

        printPrimeNumbers(primeNumbersFinder.primeNumbers);
        printSumOfPrimeNumbers(primeNumbersFinder, scanner);
        System.out.println("Goodbye!");

        scanner.close();
    }

    public static void printPrimeNumbers(int[] primeNumbers) {
        System.out.printf("First %d Prime numbers found:\n", primeNumbers.length);
        System.out.println(Arrays.toString(primeNumbers));
    }

    public static void printSumOfPrimeNumbers(Task3PrimeNumbersFinder primeNumbersFinder, Scanner scanner) {
        System.out.println("Print the sum of these numbers?\n1. Yes\n2. No\n3. Enter how many.");
        int menuChoice = scanner.nextInt();

        if (menuChoice == 1) {
            System.out.printf("Sum of %d Prime numbers is ", primeNumbersFinder.totalNumbers);
            System.out.println(primeNumbersFinder.sum());
        }
        else if (menuChoice == 3) {
            System.out.print("Enter: ");
            int amountOfPrimeNumbersToSum = scanner.nextInt();
            if (amountOfPrimeNumbersToSum > primeNumbersFinder.totalNumbers) {
                System.out.print("Amount entered is more than Prime numbers found. Overriding to all.");
                amountOfPrimeNumbersToSum = primeNumbersFinder.totalNumbers;
            }
            System.out.println("");
            System.out.printf("Sum of %d Prime numbers is ", amountOfPrimeNumbersToSum);
            System.out.println(primeNumbersFinder.sum(amountOfPrimeNumbersToSum));
        }
    }
}
