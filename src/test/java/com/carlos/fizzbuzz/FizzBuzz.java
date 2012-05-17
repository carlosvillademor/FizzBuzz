package com.carlos.fizzbuzz;

public class FizzBuzz {

    public String write(Integer number) {
        if (number%3 == 0) {
            return "Fizz";
        }
        return number.toString();
    }

}