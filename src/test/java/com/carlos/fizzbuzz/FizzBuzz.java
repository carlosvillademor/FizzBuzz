package com.carlos.fizzbuzz;

public class FizzBuzz {

    public String write(Integer number) {
        if (isMultipleOf3(number)) {
            return "Fizz";
        }
        return number.toString();
    }

    private boolean isMultipleOf3(Integer number) {
        return number%3 == 0;
    }

}