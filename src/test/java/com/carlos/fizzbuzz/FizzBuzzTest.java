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

    @Test
    public void given_number_3_when_fizzbuzz_write_then_Fizz_is_printed() {
        //Given
        Integer number = 3;

        //When
        String result = fizzbuzz.write(number);

        //Then
        assertThat("The result is incorrect", result, is("Fizz"));
    }

    @Test
    public void given_number_multiple_of_3_when_fizzbuzz_write_then_Fizz_is_printed() {
        //Given
        Integer number = 27;

        //When
        String result = fizzbuzz.write(number);

        //Then
        assertThat("The result is incorrect", result, is("Fizz"));
    }

    @Test
    public void given_number_5_when_fizzbuzz_write_then_Buzz_is_printed() {
        //Given
        Integer number = 5;

        //When
        String result = fizzbuzz.write(number);

        //Then
        assertThat("The result is incorrect", result, is("Buzz"));
    }

    @Test
    public void given_number_multiple_of_5_when_fizzbuzz_write_then_Buzz_is_printed() {
        //Given
        Integer number = 25;

        //When
        String result = fizzbuzz.write(number);

        //Then
        assertThat("The result is incorrect", result, is("Buzz"));
    }

    @Test
    public void given_number_multiple_of_3_and_5_when_fizzbuzz_write_then_FizzBuzz_is_printed() {
        //Given
        Integer number = 15;

        //When
        String result = fizzbuzz.write(number);

        //Then
        assertThat("The result is incorrect", result, is("FizzBuzz"));
    }

}