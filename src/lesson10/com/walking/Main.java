package lesson10.com.walking;

public class Main {
    public void main() {
        counterAggregation gasCounter = new counterAggregation("Газ", "м³");
        counterAggregation coldWaterCounter = new counterAggregation("Холодная", "м³");
        counterAggregation hotWaterCounter = new counterAggregation("Горячая", "м³");
        counterAggregation electricityCounter = new counterAggregation("Электричество", "кВт.ч");

        CounterService counterService = new CounterService(gasCounter, coldWaterCounter, hotWaterCounter, electricityCounter);

        //получаем массив счётчиков
        counterAggregation[] countersAll = counterService.getCountersArray();

        //выводим в консоль каждый счётчик
        System.out.println("Counters we have initialized:");
        for (counterAggregation counter : countersAll) {
            printCounter(counter);
        }

        //изменяем значение счётчика разными способами:
        //1.a находим счётчик по имени и увеличиваем значение найденного счётчика
        counterAggregation someCounter = counterService.getCounterByName("Горячая");
        someCounter.increase(103);

        //1.b тоже самое, но увеличение на 1 без указания числа
        counterAggregation someCounterTwo = counterService.getCounterByName("Электричество");
        for (int i = 0; i < 1007; i++) {
            someCounterTwo.increase();
        }

        //2.a нахождение счётчика и увеличение его значения внутри метода
        counterService.increaseCounter("Холодная", 251);

        //2.b тоже самое, но увеличение на 1 без указания числа
        counterService.increaseCounter("Газ");
        counterService.increaseCounter("Газ");
        counterService.increaseCounter("Газ");

        //2.c передавая объект в сервис
        //Газ
        counterService.increaseCounter(countersAll[0]);
        counterService.increaseCounter(countersAll[0], 45);

        //выводим в консоль каждый счётчик уже с новыми значениями
        System.out.println("Counters after their values were increased:");
        for (counterAggregation counter : countersAll) {
            printCounter(counter);
        }

        //обнуляем счётчики разными способами
        //Газ
        countersAll[0].reset();
        //Холодная
        countersAll[1].reset();
        //Горячая
        counterService.resetCounter("Горячая");
        //Электричество
        counterService.resetCounter(countersAll[3]);

        //выводим в консоль
        System.out.println("Counters after their values were reset:");
        for (counterAggregation counter : countersAll) {
            printCounter(counter);
        }
    }

    private void printCounter(counterAggregation counter) {
        System.out.println(counter.str());
    }
}