package lesson10.com.walking;
import lesson10.com.walking.counterAggregation;

class CounterService {
    private counterAggregation[] countersArray;

    CounterService(counterAggregation ...args) {
        int totalCounters = 0;
        for (counterAggregation counter : args) {
            totalCounters++;
        }
        countersArray = new counterAggregation[totalCounters];
        for (int i = 0; i < args.length; i++) {
            countersArray[i] = args[i];
        }
    }

    counterAggregation[] getCountersArray() {
        return countersArray;
    }

    counterAggregation getCounterByName(String name) {
        int index = -1;
        for (int i = 0; i < countersArray.length; i++) {
            if (name == countersArray[i].getName()) {
                index = i;
                break;
            }
        }
        return countersArray[index];
    }

    void increaseCounter(counterAggregation counter, int amount) {
        counter.increase(amount);
    }

    void increaseCounter(String name, int amount) {
        counterAggregation counter = getCounterByName(name);
        counter.increase(amount);
    }

    void increaseCounter(counterAggregation counter) {
        counter.increase();
    }

    void increaseCounter(String name) {
        counterAggregation counter = getCounterByName(name);
        counter.increase();
    }

    void resetCounter(counterAggregation counter) {
        counter.reset();
    }

    void resetCounter(String name) {
        counterAggregation counter = getCounterByName(name);
        counter.reset();
    }
}
