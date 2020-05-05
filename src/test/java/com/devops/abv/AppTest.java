package com.devops.abv;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private App calculator;

    @Before
    public void setUp() {
        calculator = new App();
    }
    @Test
    public void testAdd() {
        int a = 15;
        int b = 20;
        int expectedResult = 35;
        long result = calculator.addition(a, b);
        System.out.println("Addition test case passed");
        Assert.assertEquals(expectedResult, result);;
    }
    public void testSub() {
        int a = 20;
        int b = 15;
        int expectedResult = 5;
        long result = calculator.subtraction(a, b);
        System.out.println("Subtraction test case passed");
        Assert.assertEquals(expectedResult, result);;
    }
}
