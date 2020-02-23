package com.example.complex;

public class ComplexNumber {

    private float real, imag;

    public ComplexNumber(float real, float imag) {
        this.real = real;
        this.imag = imag;
    }

    public float getReal() {
        return real;
    }

    public void setReal(float real) {
        this.real = real;
    }

    public float getImag() {
        return imag;
    }

    public void setImag(float imag) {
        this.imag = imag;
    }

    @Override
    public String toString() {
        if (imag < 0)
            return "" + real + "" + imag + "i";
        else
            return "" + real + "+" + imag + "i";
    }
}
