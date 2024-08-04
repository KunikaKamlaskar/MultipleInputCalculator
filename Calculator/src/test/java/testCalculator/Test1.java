
package testCalculator;
import Operations.MultipleInputCalculator;


import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.Arrays;
import org.junit.Test;
 
public class Test1 {
 
    @Test

    public void testAdd() {

        assertEquals(30.0, MultipleInputCalculator.add(Arrays.asList(5.0, 10.0, 15.0)), 0.01);

        assertEquals(-10.0, MultipleInputCalculator.add(Arrays.asList(-5.0, -5.0)), 0.01);

    }
 
    @Test

    public void testSubtract() {

        assertEquals(12.0, MultipleInputCalculator.sub(Arrays.asList(20.0, 5.0, 3.0)), 0.01);

        assertEquals(0.0, MultipleInputCalculator.sub(Arrays.asList(5.0, 5.0)), 0.01);

    }
 
    @Test

    public void testMultiply() {

        assertEquals(24.0, MultipleInputCalculator.mul(Arrays.asList(2.0, 3.0, 4.0)), 0.01);

        assertEquals(0.0, MultipleInputCalculator.mul(Arrays.asList(0.0, 100.0)), 0.01);

    }
 
    @Test

    public void testDivide() {

        assertEquals(10.0, MultipleInputCalculator.divide(Arrays.asList(100.0, 5.0, 2.0)), 0.01);

        try {

            MultipleInputCalculator.divide(Arrays.asList(100.0, 0.0));
            fail("Expected an ArithmeticException to be thrown");

        } catch (ArithmeticException e) {

            assertEquals("Divide by 0 is not allowed.", e.getMessage());

        }
      

    }
 
    @Test

    public void testSquareRoot() {

        assertEquals(4.0, MultipleInputCalculator.sqRoot(16.0), 0.01);

        try {

            MultipleInputCalculator.sqRoot(-4.0);

        } catch (ArithmeticException e) {

            assertEquals("Cannot take the square root of a negative number.", e.getMessage());

        }

    }

}
