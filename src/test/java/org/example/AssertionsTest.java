package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AssertionsTest {

    @Test
    public void testVariousAssertions() {
        // Checks if two values are equal
        assertEquals("Expected 2 + 3 to be 5", 5, 2 + 3);

        // Checks if a condition is true
        assertTrue("Expected 5 > 3 to be true", 5 > 3);

        // Checks if a condition is false
        assertFalse("Expected 5 < 3 to be false", 5 < 3);

        // Checks if the object is null
        assertNull("Expected null value",null);

        // Checks if the object is not null
        assertNotNull("Expected non-null object", new Object());
    }
}
