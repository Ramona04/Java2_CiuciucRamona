package com.endava.calculator;

public interface Calculator {
    public Long addNumbers(Integer... list);

    public Long addNumbers(Long... list);

    public Double addNumbers(Double... list);

    public Long substractNumbers(Integer... list);

    public Long substractNumbers(Long... list);

    public Double substractNumbers(Double... list);

    public Integer factorial(Integer n);
}
