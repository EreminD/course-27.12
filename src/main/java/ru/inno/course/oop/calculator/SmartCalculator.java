package ru.inno.course.oop.calculator;

import java.util.Collection;

public class SmartCalculator implements Calculator {
    @Override
    public int sum(int a, int b) {
        return 0;
    }

    @Override
    public int sub(int a, int b) {
        return 0;
    }

    @Override
    public int mul(int a, int b) {
        return 0;
    }

    @Override
    public double div(int a, int b) throws Exception {
        if (b == 0) {
            throw new ArithmeticException("На ноль делить низя!");
        }

        return a / b;
    }

    @Override
    public double avg(Collection<Integer> nums) {
        return 0;
    }

    @Override
    public int min(Collection<Integer> nums) {
        return 0;
    }

    @Override
    public int max(Collection<Integer> nums) {
        return 0;
    }
}
