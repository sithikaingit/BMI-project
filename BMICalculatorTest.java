package com.example.calculator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class BMICalculatorTest {

    @Test
    public void testCalculateBMI() {
        double weight = 60.0;
        double height = 1.5;
        double expectedBMI = 26.67; // Adjusted to two decimal places
        double actualBMI = BMICALCULATOR.calculateBMI(weight, height);
        assertEquals(expectedBMI, actualBMI, 0.01); // Allow a small delta for rounding
    }

    @Test
    public void testClassifyBMI() {
        double bmi = 26.67;
        String expectedCategory = "Overweight";
        String actualCategory = BMICALCULATOR.classifyBMI(bmi);
        assertEquals(expectedCategory, actualCategory);
    }
}
