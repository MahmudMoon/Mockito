package com.example.moon.mockito.calculator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator_service calculator_service = null;
    Calculator calculator = null;
    @Before
    public void setUp() throws Exception {
        calculator_service = Mockito.mock(Calculator_service.class);
        calculator = new Calculator();
        calculator.setCalculator_service(calculator_service);
    }

    @Test
    public void performAdditon() {
        Mockito.when(calculator_service.add(2,3)).thenReturn(5);
        assertEquals(5,calculator.performAdditon(2,3),1);
    }

    @Test
    public void performSubtraction() {
        Mockito.when(calculator_service.sub(5,2)).thenReturn(3);
        assertEquals(3,calculator.performSubtraction(5,2),1);
    }

    @Test
    public void performMul() {
        Mockito.when(calculator_service.mul(2,3)).thenReturn(6);
        assertEquals(6,calculator.performMul(2,3),1);
    }

    @Test
    public void performDiv() {
        Mockito.when(calculator_service.div(6,3)).thenReturn(2.0f);
        assertEquals(2.0f,calculator.performDiv(6,3),0.01);
    }

    @After
    public void tearDown() throws Exception {
        calculator_service = null;
    }


}