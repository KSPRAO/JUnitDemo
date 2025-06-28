package org.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void testAddition() {
        Calculator calc = new Calculator();
        int result = calc.add(10, 5);
        assertEquals(15, result);  // ✅ Test passes if 10 + 5 = 15
    }
}
