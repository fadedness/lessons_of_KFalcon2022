package lesson12.com.walking.counterAggregation;

public class Main {
    public void main() {
        Counter gasCounter = new Counter("Газ", "м³");
        Counter coldWaterCounter = new Counter("Холодная", "м³");
        Counter hotWaterCounter = new Counter("Горячая", "м³");
        Counter electricityCounter = new Counter("Электричество", "кВт.ч");

        CounterService counterService = new CounterService(gasCounter, coldWaterCounter, hotWaterCounter, electricityCounter);

        //получаем массив счётчиков
        Counter[] countersAll = counterService.getCountersArray();

        //выводим в консоль каждый счётчик
        System.out.println("Counters we have initialized:");
        printCounters(countersAll);

        //1 нахождение счётчика по названию и увеличение его значения внутри метода
        counterService.increaseCounter("Холодная", 251);

        //2 тоже самое, но увеличение на 1 без указания числа
        counterService.incrementCounter("Газ");
        counterService.incrementCounter("Газ");
        counterService.incrementCounter("Газ");

        //3 передавая счётчик в сервис
        //Газ
        counterService.incrementCounter(countersAll[0]);
        counterService.increaseCounter(countersAll[0], 45);

        //остальные
        counterService.increaseCounter("Горячая", 307);
        counterService.increaseCounter("Электричество", 1003);

        //выводим в консоль каждый счётчик уже с новыми значениями
        System.out.println("Counters after their values were increased:");
        printCounters(countersAll);

        //обнуляем счётчики
        //Газ
        counterService.resetCounter("Газ");
        //Холодная
        counterService.resetCounter(countersAll[1]);
        //Горячая
        counterService.resetCounter("Горячая");
        //Электричество
        counterService.resetCounter(countersAll[3]);

        //выводим в консоль
        System.out.println("Counters after their values were reset:");
        printCounters(countersAll);
    }

    private void printCounters(Counter[] counters) {
        for (Counter counter : counters) {
            System.out.println(counter.str());
        }
    }
}