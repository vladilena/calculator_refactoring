import org.junit.Assert;
import org.junit.Test;

public class Operation {

Calculator calc = Calculator.getInstance();

    @Test
    public void operationTest(){
        Assert.assertEquals(8.0, calc.getOperation("add").operate(3,5));
        Assert.assertEquals(0.6, calc.getOperation("div").operate(3,5));
        Assert.assertEquals(15.0, calc.getOperation("mult").operate(3,5));
        Assert.assertEquals(-2.0, calc.getOperation("sub").operate(3,5));
        Assert.assertEquals("35", calc.getOperation("concat").operate("3","5"));


    }


}


