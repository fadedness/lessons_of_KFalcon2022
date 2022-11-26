package lesson10;

public class Task3PrimeNumbersFinder {
    public final int[] primeNumbers;

    public Task3PrimeNumbersFinder(int totalNumbers) {
        this.primeNumbers = new int[totalNumbers];
    }

    public Task3PrimeNumbersFinder() {
        this(10);
    }

    public int[] findPrimeNumbers() {
        for (int i = 0; i < primeNumbers.length; i++) {
            if (i == 0) {
                primeNumbers[i] = 2;
            } else {
                int addingValue = i == 1 ? 1 : 2;
                int number = primeNumbers[i - 1] + addingValue;
                primeNumbers[i] = findNextPrimeNumber(number, i);
            }
        }
        return  primeNumbers;
    }

    //    В данном случае, рекурсивно реализован вызов проверки для нового числа в рамках
    //    заполнения одного элемента массива
    private int findNextPrimeNumber(int number, int currentIndex) {
        boolean isPrime = isPrime(number, currentIndex);

        if (isPrime) {
            return number;
        }

        number += 2;

        return findNextPrimeNumber(number, currentIndex);
    }

    //    Метод проверки конкретного числа на то, является ли оно простым
    private boolean isPrime(int number, int currentIndex) {
        int j = 0;
        boolean isPrime = true;

        while (isPrime && j < currentIndex && number / primeNumbers[j] > 1) {
            if (number % primeNumbers[j] == 0) {
                isPrime = false;
            } else {
                j++;
            }
        }
        return isPrime;
    }

    public int sum(int firstNumbers) {
        int sumOfPrimeNumbers = 0;
        for (int i = 0; i < firstNumbers; i++) {
            sumOfPrimeNumbers += primeNumbers[i];
        }
        return sumOfPrimeNumbers;
    }

    public int sum() {
        return  sum(primeNumbers.length);
    }
}
