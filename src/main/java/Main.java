import operation.Operation;

public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.getInstance();
        print(calc.getOperation("add").operate(3,5));
        print(calc.getOperation("div").operate(3,5));
        print(calc.getOperation("mult").operate(3,5));
        print(calc.getOperation("sub").operate(3,5));
        print(calc.getOperation("concat").operate("3","5"));

    }
    private static void print(Object result){
        System.out.println("result is : "+ result);
    }
}


