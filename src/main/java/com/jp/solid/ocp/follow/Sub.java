package com.jp.solid.ocp.follow;

import com.jp.solid.ocp.misc.Addition;
import com.jp.solid.ocp.misc.IMathOperation;
import com.jp.solid.ocp.misc.Subtraction;

public enum Sub implements IOperationEnum {
    ADD{
        @Override
        public IMathOperation operationClass() {
            return new Subtraction();
        }
    }
}
