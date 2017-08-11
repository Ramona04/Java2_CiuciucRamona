package com.endava.calculator;

public class ExpertCalculator extends BasicCalculator {
    public Integer factorial(Integer n) {
        Integer fact = 1;
        if (n == 0 || n == 1)
            fact = 1;
        for (Integer i = 2; i <= n; i++) {
            fact = i * fact;
        }
        return fact;
    }
}
