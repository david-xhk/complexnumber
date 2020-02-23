package com.example.complex;

public class ComplexNumberCalculator {

    ComplexNumber add(ComplexNumber c1, ComplexNumber c2) {
        return new ComplexNumber(c1.getReal()+c2.getReal(),
                c1.getImag()+c2.getImag());
    }

    ComplexNumber subtract(ComplexNumber c1, ComplexNumber c2) {
        return new ComplexNumber(c1.getReal()-c2.getReal(),
                c1.getImag()-c2.getImag());
    }

    ComplexNumber multiply(ComplexNumber c1, ComplexNumber c2) {
        return new ComplexNumber(c1.getReal()*c2.getReal()-c1.getImag()*c2.getImag(),
                c1.getReal()*c2.getImag()+c1.getImag()*c2.getReal());
    }

    ComplexNumber divide(ComplexNumber c1, ComplexNumber c2) {
        ComplexNumber conj = new ComplexNumber(c2.getReal(), c2.getImag()*-1);
        Float denominator = multiply(conj, c2).getReal();
        ComplexNumber answer = multiply(conj, c1);
        answer.setReal(answer.getReal()/denominator);
        answer.setImag(answer.getImag()/denominator);
        return answer;
    }
}
