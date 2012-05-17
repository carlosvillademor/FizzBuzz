package com.carlos.fizzbuzz;

public class FizzBuzz {

    public String write(Integer number) {
        String result = "";
        if (isMultipleOf(number, 3)) {
            result += "Fizz";
        }
        if (isMultipleOf(number, 5)) {
            result += "Buzz";
        }
        if ("".equals(result)) {
            result += number.toString();
        }
        return result;
    }

    private boolean isMultipleOf(Integer number, Integer multipleOf) {
        return number%multipleOf == 0;
    }

}