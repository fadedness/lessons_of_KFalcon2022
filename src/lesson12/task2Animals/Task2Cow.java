package lesson12.task2Animals;

public class Task2Cow extends Task2Animal {
    public Task2Cow(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.printf("%s says moo.\n", this.name);
    }
}
