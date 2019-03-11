package operation.impl;


import operation.Operation;

import java.util.Objects;

public class  Multiply implements Operation <Number>{


    @Override
    public Number operate(Number a, Number b) {
        Objects.requireNonNull(a);
        Objects.requireNonNull(b);
        return a.doubleValue()*b.doubleValue();
    }
}


