package com.jp.solid.ocp.misc;

@FunctionalInterface
public interface IMathOperation<I,O> {
    O calculate(I i1, I i2);
}
