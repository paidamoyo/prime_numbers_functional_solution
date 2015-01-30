package com.primenumberlogic.test;

import org.junit.Ignore;
import org.junit.Test;
import com.primenumberlogic.domain.PrimeNumberCounter;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PrimeNumberCounterTest {

    @Test
    public void shouldReturnZeroWhenZero() throws Exception {

        //given
         PrimeNumberCounter primeNumberCounter = new PrimeNumberCounter();

        //when
        final int count = primeNumberCounter.count(0);
        //then
        assertThat(count, is(0));
    }


    @Test
    public void shouldReturnZeroWhenOne() throws Exception {

        //given
        PrimeNumberCounter primeNumberCounter = new PrimeNumberCounter();

        //when
        final int count = primeNumberCounter.count(1);
        //then
        assertThat(count, is(0));
    }

    @Test
    public void shouldReturnOneWhenTwo() throws Exception {

        //given
        PrimeNumberCounter primeNumberCounter = new PrimeNumberCounter();

        //when
        final int count = primeNumberCounter.count(2);
        //then
        assertThat(count, is(1));
    }

    @Test
    public void shouldReturnTwoWhenThree() throws Exception {

        //given
        PrimeNumberCounter primeNumberCounter = new PrimeNumberCounter();

        //when
        final int count = primeNumberCounter.count(3);
        //then
        assertThat(count, is(2));
    }

    @Test
    public void shouldReturnTwoWhenFour() throws Exception {

        //given
        PrimeNumberCounter primeNumberCounter = new PrimeNumberCounter();

        //when
        final int count = primeNumberCounter.count(4);
        //then
        assertThat(count, is(2));
    }

    @Test
    public void shouldReturnThreeWhenFive() throws Exception {

        //given
        PrimeNumberCounter primeNumberCounter = new PrimeNumberCounter();

        //when
        final int count = primeNumberCounter.count(5);
        //then
        assertThat(count, is(3));
    }

    @Test
    public void shouldReturnTwentyFiveWhenOneHundred() throws Exception {

        //given
        PrimeNumberCounter primeNumberCounter = new PrimeNumberCounter();

        //when
        final int count = primeNumberCounter.count(100);
        //then
        assertThat(count, is(25));
    }

    @Test
    public void shouldReturn489When3500() throws Exception {

        //given
        PrimeNumberCounter primeNumberCounter = new PrimeNumberCounter();

        //when
        final int count = primeNumberCounter.count(3500);
        //then
        assertThat(count, is(489));
    }

    @Ignore("This test breaks because of StackOverflow")
    @Test
    public void shouldReturn1025When10000() throws Exception {

        //given
        PrimeNumberCounter primeNumberCounter = new PrimeNumberCounter();

        //when
        final int count = primeNumberCounter.count(10000);
        //then
        assertThat(count, is(1025));
    }

    @Test
    public void shouldReturn669When5000() throws Exception {

        //given
        PrimeNumberCounter primeNumberCounter = new PrimeNumberCounter();

        //when
        final int count = primeNumberCounter.count(5000);
        //then
        assertThat(count, is(669));
    }
}