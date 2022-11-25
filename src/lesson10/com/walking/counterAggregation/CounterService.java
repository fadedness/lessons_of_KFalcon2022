package lesson10.com.walking.counterAggregation;

class CounterService {
    private Counter[] countersArray;

    CounterService(Counter...args) {
        int totalCounters = 0;
        for (Counter counter : args) {
            totalCounters++;
        }
        countersArray = new Counter[totalCounters];
        for (int i = 0; i < args.length; i++) {
            countersArray[i] = args[i];
        }
    }

    Counter[] getCountersArray() {
        return countersArray;
    }

    Counter getCounterByName(String name) {
        int index = -1;
        for (int i = 0; i < countersArray.length; i++) {
            if (name == countersArray[i].getName()) {
                index = i;
                break;
            }
        }

        /**
         * если нет такого счётчика будет ошибка
         * Index -1 out of bounds
         * её надо ловить там, где вызывается этот метод
         * но мы пока не проходили это
         */

        return countersArray[index];
    }

    void increaseCounter(Counter counter, int amount) {
        counter.increase(amount);
    }

    void increaseCounter(String name, int amount) {
        Counter counter = getCounterByName(name);
        counter.increase(amount);
    }

    void increaseCounter(Counter counter) {
        counter.increase();
    }

    void increaseCounter(String name) {
        Counter counter = getCounterByName(name);
        counter.increase();
    }

    void resetCounter(Counter counter) {
        counter.reset();
    }

    void resetCounter(String name) {
        Counter counter = getCounterByName(name);
        counter.reset();
    }
}
