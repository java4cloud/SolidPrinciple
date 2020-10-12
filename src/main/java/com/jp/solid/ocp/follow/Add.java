package com.jp.solid.ocp.follow;

import com.jp.solid.ocp.misc.Addition;
import com.jp.solid.ocp.misc.IMathOperation;

public enum Add implements IOperationEnum {
    ADD{
        @Override
        public IMathOperation operationClass() {
            return new Addition();
        }
    }
}
