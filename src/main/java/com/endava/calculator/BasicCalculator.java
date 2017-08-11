package com.endava.calculator;

public class BasicCalculator implements Calculator {


    public Long addNumbers(Integer... list) {
        Integer suma = 0;
        for (Integer i : list) {
            suma = suma + i;
        }
        return suma.longValue();
    }


    public Long addNumbers(Long... list) {
        Long suma = 0L;
        for (Long i : list) {
            suma += i;
        }
        return suma;
    }


    public Double addNumbers(Double... list) {
        Double suma = 0.0;
        for (Double i : list) {
            suma += i;
        }
        return suma;
    }

    public Long substractNumbers(Integer... list) {
        Integer suma = 0;
        for (Integer i : list) {
            suma = suma - i;
        }
        return suma.longValue();
    }


    public Long substractNumbers(Long... list) {
        Long suma = 0L;
        for (Long i : list) {
            suma += i;
        }
        return suma;
    }


    public Double substractNumbers(Double... list) {
        Double suma = 0.0;
        for (Double i : list) {
            suma += i;
        }
        return suma;
    }


    public Integer factorial(Integer n) {
        throw new RuntimeException("This method is not implemented! Please use the Expert Calculator");
    }

}
