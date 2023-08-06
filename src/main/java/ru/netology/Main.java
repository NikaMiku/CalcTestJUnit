package ru.netology;

public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2); // a = 3 (1 + 2)
        int b = calc.minus.apply(1, 1); // b = 0 (1 - 1)
        int c = calc.divide.apply(a, b); // (3/0) ???? DO IT!!! ... JUST DO IT!!!

        calc.println.accept(c);
    }
}
