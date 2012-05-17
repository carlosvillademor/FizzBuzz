package com.carlos.fizzbuzz;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FizzBuzzTest {

    private FizzBuzz fizzbuzz;

    @Before
    public void setUp() {
        fizzbuzz = new FizzBuzz();
    }

    @Test
    public void given_number_when_fizzbuzz_write_then_number_is_printed() {
        //Given
        Integer number = 1;

        //When
        String result = fizzbuzz.write(number);

        //Then
        assertThat("The result is incorrect", result, is(number.toString()));
    }

}