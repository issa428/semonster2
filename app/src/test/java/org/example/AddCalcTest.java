package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AddCalcTest {

    @Test
    public void appHasAddCalc() {
      AddCalc classUnderTest = new AddCalc();
      assertNotNull("app should have a greeting", classUnderTest.AddCalculate());
    }
}