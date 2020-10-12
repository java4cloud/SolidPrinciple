package com.jp.solid.ocp.follow;

import com.jp.solid.ocp.misc.IMathOperation;

public class OcpMathFactory {
    public static IMathOperation operation(IOperationEnum anEnum){
        return anEnum.operationClass();
    }
}
