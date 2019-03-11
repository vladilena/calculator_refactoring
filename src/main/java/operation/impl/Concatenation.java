package operation.impl;

import operation.Operation;

import java.util.Objects;

public class Concatenation implements Operation <String> {
    @Override
    public String operate(String a, String b) {
        Objects.requireNonNull(a);
        Objects.requireNonNull(b);
        return a+b;
    }
}


