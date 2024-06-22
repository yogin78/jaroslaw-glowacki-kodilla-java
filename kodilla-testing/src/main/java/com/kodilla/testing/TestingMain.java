package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {

        Calculator addAtoB = new Calculator ();

        int result = Calculator.addAtoB(10, 5);

        if (result==(10 + 5)) {
            System.out.println("test OK");
        }else{
            System.out.println("test FAIL");
        }

        result = Calculator.substractBfromA(10, 5);
        if (result==(10 - 5)) {
            System.out.println("test OK");
        }else{
            System.out.println("test FAIL");
        }
    }
}
