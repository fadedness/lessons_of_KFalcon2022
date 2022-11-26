package lesson9;

/**
 * реализуйте неизменность поля названия у класса Counter.
 * Ведь очень странно, если мы можем менять название счетчика по ходу выполнения программы, не так ли?
 */

public class Task2Main {
    public static void main(String[] args) {
        Task2Counter evenCounter = new Task2Counter("Чётные числа");
        Task2Counter oddCounter = new Task2Counter("Нечётные числа");

        //cannot assign a value to final variable name
        //evenCounter.name = "New name";
        //task complete

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

    static void printCounterNameAndCurrentValue(Task2Counter counter) {
        System.out.printf("%s: %d\n", counter.name, counter.counter);
    }
}
