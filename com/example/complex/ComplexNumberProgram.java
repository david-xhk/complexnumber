package com.example.complex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ComplexNumberProgram {

    public static void main(String[] args) {
        float r1 = getFloatInput("Please input real component of first complex number: ");
        float i1 = getFloatInput("Please input imaginary component of first complex number: ");
        float r2 = getFloatInput("Please input real component of second complex number: ");
        float i2 = getFloatInput("Please input imaginary component of second complex number: ");

        ComplexNumber c1 = new ComplexNumber(r1, i1);
        ComplexNumber c2 = new ComplexNumber(r2, i2);

        System.out.println("Your complex numbers are: " + c1 + " and " + c2);

        ComplexNumberCalculator calc = new ComplexNumberCalculator();
        System.out.println("" + c1 + " + " + c2 + " = " + calc.add(c1, c2));
        System.out.println("" + c1 + " - " + c2 + " = " + calc.subtract(c1, c2));
        System.out.println("" + c1 + " * " + c2 + " = " + calc.multiply(c1, c2));
        System.out.println("" + c1 + " / " + c2 + " = " + calc.divide(c1, c2));

        System.out.println("Thank you for using ComplexNumberProgram. Goodbye!");
    }

    public static float getFloatInput(String prompt) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            try {
                System.out.print(prompt);
                return Float.parseFloat(br.readLine());
            } catch (NullPointerException ex) {
                System.out.println("Float not provided. ");
            } catch (NumberFormatException ex) {
                System.out.println("Invalid float provided. ");
            } catch (IOException ex) {
                System.out.println("An error occurred. Please try again. ");
            }
        }
    }
}
