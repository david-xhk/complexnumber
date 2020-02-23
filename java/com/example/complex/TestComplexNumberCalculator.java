package com.example.complex;

public class TestComplexNumberCalculator {

    public static void main(String[] args) {
        testAdd();
        System.out.println();

        testSubtract();
        System.out.println();

        testMultiply();
        System.out.println();

        testDivide();
        System.out.println();
    }

    public static void testAdd() {
        ComplexNumber a = new ComplexNumber(1, -2);
        ComplexNumber b = new ComplexNumber(2, -1);
        System.out.println("add test: " + a + " and " + b);

        ComplexNumber c = new ComplexNumberCalculator().add(a, b);
        ComplexNumber expected = new ComplexNumber(3, -3);
        System.out.println("result: " + c + ", expected: " + expected);
        System.out.println("add test: " + (
                c.getReal()==expected.getReal() && c.getImag()==expected.getImag() ?
                        "passed" : "failed"));
    }

    public static void testSubtract() {
        ComplexNumber a = new ComplexNumber(3, 2);
        ComplexNumber b = new ComplexNumber(5, -4);
        System.out.println("subtract test: " + a + " and " + b);

        ComplexNumber c = new ComplexNumberCalculator().subtract(a, b);
        ComplexNumber expected = new ComplexNumber(-2, 6);
        System.out.println("result: " + c + ", expected: " + expected);
        System.out.println("subtract test: " + (
                c.getReal()==expected.getReal() && c.getImag()==expected.getImag() ?
                        "passed" : "failed"));
    }

    public static void testMultiply() {
        ComplexNumber a = new ComplexNumber(3, -2);
        ComplexNumber b = new ComplexNumber(1, 2);
        System.out.println("multiply test: " + a + " and " + b);

        ComplexNumber c = new ComplexNumberCalculator().multiply(a, b);
        ComplexNumber expected = new ComplexNumber(7,4);
        System.out.println("result: " + c + ", expected: " + expected);
        System.out.println("multiply test: " + (
                c.getReal()==expected.getReal() && c.getImag()==expected.getImag() ?
                        "passed" : "failed"));
    }

    public static void testDivide() {
        ComplexNumber a = new ComplexNumber(4, -2);
        ComplexNumber b = new ComplexNumber(1, 1);
        System.out.println("divide test: " + a + " and " + b);

        ComplexNumber c = new ComplexNumberCalculator().divide(a, b);
        ComplexNumber expected = new ComplexNumber(1,-3);
        System.out.println("result: " + c + ", expected: " + expected);
        System.out.println("divide test: " + (
                c.getReal()==expected.getReal() && c.getImag()==expected.getImag() ?
                        "passed" : "failed"));
    }
}
