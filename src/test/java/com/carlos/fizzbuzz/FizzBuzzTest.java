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

    @Test
    public void when_fizzbuzz_play_then_numbers_from_1_to_100_translated_with_FizzBuzz_rules_should_be_printed() {
        //When
        String result = fizzbuzz.play();

        //Then
        assertThat("The result is incorrect", result, is("1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz 16 17 Fizz 19 Buzz Fizz 22 23 Fizz Buzz 26 Fizz 28 29 FizzBuzz 31 32 Fizz 34 Buzz Fizz 37 38 Fizz Buzz 41 Fizz 43 44 FizzBuzz 46 47 Fizz 49 Buzz Fizz 52 53 Fizz Buzz 56 Fizz 58 59 FizzBuzz 61 62 Fizz 64 Buzz Fizz 67 68 Fizz Buzz 71 Fizz 73 74 FizzBuzz 76 77 Fizz 79 Buzz Fizz 82 83 Fizz Buzz 86 Fizz 88 89 FizzBuzz 91 92 Fizz 94 Buzz Fizz 97 98 Fizz Buzz "));
    }

}