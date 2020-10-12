package com.jp.solid.ocp.voilate;

import com.jp.solid.ocp.misc.Addition;
import com.jp.solid.ocp.misc.IMathOperation;
import com.jp.solid.ocp.misc.Subtraction;

public class MathFactory {
    public static IMathOperation operation(String operandName) {
        IMathOperation operation = null;
        switch (operandName) {
            case "ADD":
                operation = new Addition();
                break;
            case "SUB":
                operation =  new Subtraction();
                break;
            default:
                System.out.println("Illegal Operation");
        }
        return operation;
    }
}
