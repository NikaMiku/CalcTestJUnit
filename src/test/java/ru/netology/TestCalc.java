package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TestCalc {
    private static int[] positiveNumbers;
    private static int zero;
    private static Calculator calc;

    @BeforeAll
    static void beforeAll() {
        positiveNumbers = new int[] {1,2,3,4,5,6,7,8,9};
        zero = 0;
        calc = new Calculator();
    }

    @Test
    void plusTest() {
        Assertions.assertEquals(100, calc.plus.apply(50,50));
    }
    @Test
    void multiplyTest() {
        for (int i = 0; i < positiveNumbers.length; i++) {
            Assertions.assertEquals(calc.multiply.apply(positiveNumbers[i], positiveNumbers[1]), calc.plus.apply(positiveNumbers[i], positiveNumbers[i]));
            Assertions.assertEquals(0, calc.multiply.apply(positiveNumbers[i], zero));
        }
    }
    @Test
    void divideTest() {
        Assertions.assertEquals(1, calc.divide.apply(100, 100));
    }
}
