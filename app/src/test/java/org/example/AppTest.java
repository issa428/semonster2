/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test public void appHasAGreeting() {
        App classUnderTest = new App();
        assertEquals("Hello World!", classUnderTest.getGreeting());
    }

    @Test
    public void testSub() {
        Calculate_sub calculate = new Calculate_sub();
        int expected = 1;
        assertEquals(expected, calculate.sub(2, 1));
    }
}
