package lesson9;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 1.    Вынесите поиск простых чисел в отдельный класс.
 *
 * 2.    Реализуйте возможность вывода на экран суммы N первых простых чисел, где N – число,
 *       введенное пользователем с клавиатуры;
 *
 * 3.    Вынесите нужные вам переменные в поля класса.
 *       Если необходимо – сделайте их константами уровня класса или объекта.
 *       Помните, константа ссылочного типа гарантирует неизменность ссылки, а не содержимого объекта.
 *       Массив – ссылочный тип.
 */

public class Task3Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter how many Prime numbers to find: ");
        int numbersToFind = scanner.nextInt();

        Task3PrimeNumbersFinder primeNumbersFinder = new Task3PrimeNumbersFinder(numbersToFind);
        primeNumbersFinder.findPrimeNumbers();

        printPrimeNumbers(primeNumbersFinder.primeNumbers);
        printPrimeNumbersSum(primeNumbersFinder, requirePrimeNumbersAmount(primeNumbersFinder, scanner));
        System.out.println("Goodbye!");

        scanner.close();
    }

    public static void printPrimeNumbers(int[] primeNumbers) {
        System.out.printf("First %d Prime numbers found:\n", primeNumbers.length);
        System.out.println(Arrays.toString(primeNumbers));
    }

    public static void printPrimeNumbersSum(Task3PrimeNumbersFinder primeNumbersFinder, int primeNumbersAmount) {
        if (primeNumbersAmount > 0) {
            System.out.println("");
            System.out.printf("The sum of first %d Prime numbers is ", primeNumbersAmount);
            System.out.println(primeNumbersFinder.sum(primeNumbersAmount));
        }
    }

    public static int requirePrimeNumbersAmount(Task3PrimeNumbersFinder primeNumbersFinder, Scanner scanner) {
        int primeNumbersAmount = 0;
        System.out.println("Print the sum of these numbers?\n1. Yes\n2. No\n3. Enter how many.");
        int menuChoice = scanner.nextInt();

        if (menuChoice == 1) {
            primeNumbersAmount = primeNumbersFinder.primeNumbers.length;
        }
        else if (menuChoice == 3) {
            System.out.print("Enter strictly positive number: ");
            primeNumbersAmount = scanner.nextInt();
            if (primeNumbersAmount > primeNumbersFinder.primeNumbers.length) {
                System.out.print("Amount entered is more than Prime numbers found. Overriding to all.");
                primeNumbersAmount = primeNumbersFinder.primeNumbers.length;
            }
            else if (primeNumbersAmount < 1) {
                System.out.println("Amount entered is less than 1. Not going to print the sum.");
            }
        }

        return primeNumbersAmount;
    }
}
