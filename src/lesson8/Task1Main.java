package lesson8;

/**
 * Реализовать класс-счетчик.
 * Полями класса должны выступать название счетчика и, непосредственно, целочисленный счетчик.
 * <p>
 * Реализовать для созданного класса конструктор с двумя параметрами,
 * с одним (значение счетчика в таком случае инициализировать как 0),
 * методы увеличения и уменьшения счетчиков на 1 и на заданное пользователем целом значение.
 * Методы должны возвращать актуальное значение счетчика.
 * <p>
 * Используя созданный класс,
 * посчитать количество четных и количество нечетных чисел в ряду от 1 до 100.
 * Конечные показатели счетчиков вывести в консоль.
 */

public class Task1Main {
    public static void main(String[] args) {
        Task1Counter evenCounter = new Task1Counter("Чётные числа");
        Task1Counter oddCounter = new Task1Counter("Нечётные числа");

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                evenCounter.increase();
            } else {
                oddCounter.increase();
            }
        }

        printCounterNameAndCurrentValue(evenCounter);
        printCounterNameAndCurrentValue(oddCounter);
    }

    static void printCounterNameAndCurrentValue(Task1Counter counter) {
        System.out.printf("%s: %d\n", counter.name, counter.counter);
    }
}
