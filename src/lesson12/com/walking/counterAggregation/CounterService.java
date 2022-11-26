package lesson12.com.walking.counterAggregation;

class CounterService {
    private Counter[] countersArray;

    CounterService(Counter...counters) {
        countersArray = counters;
    }

    Counter[] getCountersArray() {
        return countersArray;
    }

    Counter getCounterByName(String name) {
        for (int i = 0; i < countersArray.length; i++) {
            if (name == countersArray[i].getName()) {
                return countersArray[i];
            }
        }

        return null;
    }

    Counter increaseCounter(Counter counter, int amount) {
        counter.setCounter(counter.getCounter() + amount);
        return counter;
    }

    Counter increaseCounter(String name, int amount) {
        Counter counter = getCounterByName(name);
        counter.setCounter(counter.getCounter() + amount);
        return counter;
    }

    Counter incrementCounter(Counter counter) {
        counter.setCounter(counter.getCounter() + 1);
        return counter;
    }

    Counter incrementCounter(String name) {
        Counter counter = getCounterByName(name);
        counter.setCounter(counter.getCounter() + 1);
        return counter;
    }

    Counter decreaseCounter(Counter counter, int amount) {
        counter.setCounter(counter.getCounter() - amount);
        return counter;
    }

    Counter decreaseCounter(String name, int amount) {
        Counter counter = getCounterByName(name);
        counter.setCounter(counter.getCounter() - amount);
        return counter;
    }

    Counter decrementCounter(Counter counter) {
        counter.setCounter(counter.getCounter() - 1);
        return counter;
    }

    Counter decrementCounter(String name) {
        Counter counter = getCounterByName(name);
        counter.setCounter(counter.getCounter() - 1);
        return counter;
    }

    Counter resetCounter(Counter counter) {
        counter.setCounter(0);
        return counter;
    }

    Counter resetCounter(String name) {
        Counter counter = getCounterByName(name);
        counter.setCounter(0);
        return counter;
    }
}
