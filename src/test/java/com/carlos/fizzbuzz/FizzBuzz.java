package com.carlos.fizzbuzz;

public class FizzBuzz {

    public String write(Integer number) {
        if (isMultipleOf(number, 3)) {
            return "Fizz";
        }
        if (isMultipleOf(number, 5)) {
            return "Buzz";
        }
        return number.toString();
    }

    private boolean isMultipleOf(Integer number, Integer multipleOf) {
        return number%multipleOf == 0;
    }

}