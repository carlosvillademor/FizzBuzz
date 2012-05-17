package com.carlos.fizzbuzz;

public class FizzBuzz {

    public String write(Integer number) {
        if (isMultipleOf3(number)) {
            return "Fizz";
        }
        if (isMultipleOf5(number)) {
            return "Buzz";
        }
        return number.toString();
    }

    private boolean isMultipleOf5(Integer number) {
        return number%5 == 0;
    }

    private boolean isMultipleOf3(Integer number) {
        return number%3 == 0;
    }

}