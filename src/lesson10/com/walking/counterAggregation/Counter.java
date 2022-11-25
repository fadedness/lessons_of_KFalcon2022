package lesson10.com.walking.counterAggregation;

class Counter {
    private final String name;
    private final String unitType;
    private int counter;

    String getName() {
        return this.name;
    }

    String getUnitType() {
        return this.unitType;
    }

    int getCounter() {
        return this.counter;
    }

    Counter(String name, String unitType, int counter) {
        this.name = name;
        this.unitType = unitType;
        this.counter = counter;
    }

    Counter(String name, String unitType) {
        this(name, unitType, 0);
    }

    int increase() {
        this.counter++;
        return this.counter;
    }

    int decrease() {
        this.counter--;
        return this.counter;
    }

    int increase(int number) {
        this.counter += number;
        return this.counter;
    }

    int decrease(int number) {
        this.counter -= number;
        return this.counter;
    }

    int reset() {
        this.counter = 0;
        return this.counter;
    }

    String str() {
        return name + ": " + counter + " " + unitType;
    }
}
