package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class Calculate_subTest {
    @Test
    public void testSub() {
        Calculate_sub calculate = new Calculate_sub();
        int expected = 1;
        assertEquals(expected, calculate.sub(2, 1));
    }
}
