package com.primenumberlogic.domain;

import com.google.common.collect.ImmutableList;

import java.util.List;

public class PrimeNumberCounter {

    public int count(int maxNumber) {

        return incrementCount(maxNumber, maxNumber, new ImmutableList.Builder<Integer>().build());

    }

    private int incrementCount(int maxNumber, int decrement, ImmutableList<Integer> primeNumbers) {

        int currentNumber = maxNumber - decrement;

        if (currentNumber == maxNumber) {
            return isPrime(currentNumber, primeNumbers) ? primeNumbers.size() + 1 : primeNumbers.size();
        }

        if (isPrime(currentNumber, primeNumbers)) {
            final ImmutableList<Integer> newPrimeNumbers = new ImmutableList.Builder<Integer>().addAll(primeNumbers).add(currentNumber).build();
            return incrementCount(maxNumber, decrement - 1, newPrimeNumbers);
        }


        return incrementCount(maxNumber, decrement - 1, primeNumbers);
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
