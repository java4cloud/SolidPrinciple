package com.jp.solid.ocp.follow;

import com.jp.solid.ocp.misc.IMathOperation;
import com.jp.solid.ocp.misc.Subtraction;

public enum Sub implements IOperationEnum {
    SUB{
        @Override
        public IMathOperation<Integer,Integer> operationClass() {
            return new Subtraction();
        }
    }
}
