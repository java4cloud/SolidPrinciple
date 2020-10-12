package com.jp.solid.ocp;

import com.jp.solid.ocp.follow.OcpMathFactory;
import com.jp.solid.ocp.voilate.Constant;
import com.jp.solid.ocp.voilate.MathFactory;

import static com.jp.solid.ocp.follow.Add.ADD;

public class OcpMain {
    public static void main(String[] args) {
        System.out.println(MathFactory.operation(Constant.ADD).calculate(2,5));
        System.out.println(OcpMathFactory.operation(ADD).calculate(2,5));
    }
}
