package lesson12.com.walking.counterAggregation;

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

    void setCounter(int value) {
        this.counter = value;
    }

    Counter(String name, String unitType, int counter) {
        this.name = name;
        this.unitType = unitType;
        this.counter = counter;
    }

    Counter(String name, String unitType) {
        this(name, unitType, 0);
    }

    String str() {
        return name + ": " + counter + " " + unitType;
    }
}
