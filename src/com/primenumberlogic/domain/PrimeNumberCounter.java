package com.primenumberlogic.domain;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberCounter {

    public int count(int maxNumber) {

        return incrementCount(maxNumber, maxNumber, new ArrayList<Integer>());

    }

    private int incrementCount(int maxNumber, int currentNumber, List<Integer> primeNumbers) {

        List<Integer> newList = new ArrayList<Integer>();
        newList.addAll(primeNumbers);

        int diff = maxNumber - currentNumber;

        if (currentNumber == 0) {
            return isPrime(diff, newList) ? primeNumbers.size() + 1 : primeNumbers.size();
        }

        if (isPrime(diff, primeNumbers)) {
            newList.add(diff);
            return incrementCount(maxNumber, currentNumber - 1, newList);
        }

        return incrementCount(maxNumber, currentNumber - 1, newList);
    }

    private boolean isPrime(int number, List<Integer> primeNumbers) {

        if (number <= 1) {
            return false;
        }

        for (Integer prime : primeNumbers) {
            if (number % prime == 0) {
                return false;
            }
        }
        return true;
    }

}
