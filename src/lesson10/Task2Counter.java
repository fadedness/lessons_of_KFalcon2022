package lesson10;

public class Task2Counter {
    public final String name;
    public int counter;

    public Task2Counter(String name, int counter) {
        this.name = name;
        this.counter = counter;
    }

    public Task2Counter(String name) {
        this(name, 0);
    }

    public int increase() {
        return ++counter;
    }

    public int decrease() {
        return --counter;
    }

    public int increaseBy(int number) {
        this.counter += number;
        return this.counter;
    }

    public int decreaseBy(int number) {
        this.counter -= number;
        return this.counter;
    }
}
