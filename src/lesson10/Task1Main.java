package lesson10;
import lesson10.com.walking.counterAggregation.Main;

/**
 * Не стал создавать отдельный репозиторий для com.walking поэтому он внутри lesson10
 */

/**
 * Разработать программу в рамках компании com.walking, позволяющую следить за счетчиками на газ,
 * холодную воду, горячую воду и электричество. Обозначение программы в рамках компании — counterAggregation.
 *
 * Используя за основу задачу из темы про классы и объекты (ссылка на разбор), реализовать класс счетчика,
 * который хранит название счетчика и его значение, его единицы измерения, а также обеспечивает доступ к значениям.
 * Название счетчика и его единицы измерения должны быть неизменны.
 *
 * Также реализовать сервис CounterService, зона ответственности которого — хранение массива доступных счетчиков,
 * получение всех доступных счетчиков, получение доступа к счетчику по названию,
 * увеличение значения счетчика на единицу или заданное значение, а также сброс счетчика до нулевого значения.
 *
 * Ответственность класса, содержащего main() — создание счетчиков. Сам класс также предлагаю назвать Main.
 *
 * Также реализовать в классе Main приватный метод, который позволяет вывести значения счетчиков в виде:
 * <Название счетчика>: <Значение счетчика>. Например:
 *
 * Газ: 2333
 *
 * Горячая вода: 0
 *
 * Холодная вода: 23
 */

public class Task1Main {
    public static void main(String[] args) {
        Main comWalkingMain = new Main();
        comWalkingMain.main();
    }
}
