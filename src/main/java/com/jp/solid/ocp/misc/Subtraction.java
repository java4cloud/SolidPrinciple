package com.jp.solid.ocp.misc;

public class Subtraction implements IMathOperation<Integer, Integer> {
    @Override
    public Integer calculate(Integer i1, Integer i2) {
        return i1-i2;
    }
}
