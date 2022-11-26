package lesson9;

/**
 * вынести строковые и символьные литералы в константы.
 * Попробуйте нарисовать прямоугольник, используя "==" для каждой единицы длины
 * и "||" – для каждой единицы ширины.
 *
 * Также попробуйте записать в константу переменную scanner.
 * Упростится ли использование сканера внутри методов чтения с клавиатуры?
 */

import java.util.Scanner;

/**
 * Написать программу, которая принимает длину и ширину прямоугольника (2 целых числа).
 * Нарисовать в консоли заданный прямоугольник, используя “-“ и “|”.
 * Углы прямоугольника обозначить символом “ “.
 * Каждая единица длины должна обозначаться одним символом “-“,
 * каждая единица ширины – символом “|“.
 * <p>
 * Произвести декомпозицию по своему усмотрению. Рекомендую скинуть на проверку. Контакт ниже.
 */

public class Task1Main {
    final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int length = requireInt("Enter rectangle's length: ");
        int width = requireInt("Enter rectangle's width: ");

        scanner.close();

        Task1Drawer drawer = new Task1Drawer("==", "||", " ");
        String rectangle = drawer.drawRectangle(length, width);
        printRectangle(rectangle);
    }

    private static int requireInt(String requiringMessage) {
        System.out.print(requiringMessage);

        return scanner.nextInt();
    }

    private static void printRectangle(String rectangle) {
        System.out.print(rectangle);
    }
}