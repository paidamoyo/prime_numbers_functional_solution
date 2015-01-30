package com.primenumberlogic.domain;

import com.google.common.collect.ImmutableList;

public class PrimeNumberCounter {

    public int count(int maxNumber) {

        return aggregate(maxNumber, maxNumber, new ImmutableList.Builder<Integer>().build()).size();

    }

    private ImmutableList<Integer> aggregate(int maxNumber, int decrement, ImmutableList<Integer> primeNumbers) {

        int currentNumber = maxNumber - decrement;

        if (currentNumber == maxNumber) {
            return isPrime(currentNumber, primeNumbers) ? addPrimeNumber(primeNumbers, currentNumber) : primeNumbers;
        }

        if (isPrime(currentNumber, primeNumbers)) {
            return aggregate(maxNumber, decrement - 1, addPrimeNumber(primeNumbers, currentNumber));
        }


        return aggregate(maxNumber, decrement - 1, primeNumbers);
    }

    private ImmutableList<Integer> addPrimeNumber(ImmutableList<Integer> primeNumbers, int primeNumber) {
        return new ImmutableList.Builder<Integer>().addAll(primeNumbers).add(primeNumber).build();
    }

    private boolean isPrime(int number, ImmutableList<Integer> primeNumbers) {

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
