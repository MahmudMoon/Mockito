package com.example.moon.mockito.calculator;

public class Calculator {
    Calculator_service calculator_service = null;

    public Calculator_service getCalculator_service() {
        return calculator_service;
    }

    public void setCalculator_service(Calculator_service calculator_service) {
        this.calculator_service = calculator_service;
    }

    public int performAdditon(int i,int j){
        return calculator_service.add(i,j);
    }

    public int performSubtraction(int i,int j){
        return calculator_service.sub(i,j);
    }

    public int performMul(int i,int j){
        return calculator_service.mul(i,j);
    }

    public float performDiv(int i, int j){
        return calculator_service.div(i,j);
    }
}
