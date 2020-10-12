package com.jp.solid.ocp;

import com.jp.solid.ocp.follow.Add;
import com.jp.solid.ocp.follow.OcpMathFactory;
import com.jp.solid.ocp.voilate.Constant;
import com.jp.solid.ocp.voilate.MathFactory;

public class OcpMain {
    public static void main(String[] args) {
        System.out.println(MathFactory.operation(Constant.ADD).calculate(2,5));
        System.out.println(OcpMathFactory.operation(Add.ADD).calculate(2,5));
    }
}
