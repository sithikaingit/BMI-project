package com.example.calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class BMICalculatorTest {

    @Test
    public void testCalculateBMI() {
        double weight = 60;
        double height = 1.5;
        double expectedBMI = 26.67;
        double actualBMI = BMICALCULATOR.calculateBMI(weight, height);
        assertEquals(expectedBMI, actualBMI, 0.01);
    }

    @Test
    public void testClassifyBMI() {
        double bmi = 26.67;
        String expectedCategory = "Overweight";
        String actualCategory = BMICALCULATOR.classifyBMI(bmi);
        assertEquals(expectedCategory, actualCategory);
    }
}
