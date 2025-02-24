package com.test.testcases;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    public void intilaize()
    {
        calculator = new Calculator();
    }

    @Test
    public void testAdd()
    {
        assertEquals(7,calculator.add(3,5));
    }

}
