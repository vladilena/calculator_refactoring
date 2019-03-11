import operation.Operation;
import operation.impl.*;

import java.util.HashMap;


public class Calculator {
private static Calculator instance;
    private Calculator() {
    }

    public static Calculator getInstance() {
        if (instance == null) {
            instance = new Calculator();
        }
        return instance;
    }
   private HashMap <String, Operation> operations = new HashMap<>();
    {
        operations.put("add", new Add());
        operations.put("concat", new Concatenation());
        operations.put("mult", new Multiply());
        operations.put("sub", new Substraction());
        operations.put("div", new Division());
    }
    public Operation getOperation (String request){
        return operations.get(request);
    }
}


