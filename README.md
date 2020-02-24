# ComplexNumberProgram
Example usage of ComplexNumberProgram:
```
cd ~/Downloads/complexnumber
java com.example.complex.ComplexNumberProgram
Please input real component of first complex number: 1
Please input imaginary component of first complex number: -2
Please input real component of second complex number: 3
Please input imaginary component of second complex number: -4
Your complex numbers are: 1.0-2.0i and 3.0-4.0i
1.0-2.0i + 3.0-4.0i = 4.0-6.0i
1.0-2.0i - 3.0-4.0i = -2.0+2.0i
1.0-2.0i * 3.0-4.0i = -5.0-10.0i
1.0-2.0i / 3.0-4.0i = 0.44-0.08i
Thank you for using ComplexNumberProgram. Goodbye!
```

# Documentation
## ComplexNumber	
*Float* **real**; Real component of complex number.

*Float* **imag**; Imaginary component of complex number.

## ComplexNumberCalculator
*ComplexNumber* **add**(*ComplexNumber* c1, *ComplexNumber* c2); Add c1 and c2.

*ComplexNumber* **subtract**(*ComplexNumber* c1, *ComplexNumber* c2); Subtract c2 from c1.

*ComplexNumber* **multiply**(*ComplexNumber* c1, *ComplexNumber* c2); Multiply c1 and c2.

*ComplexNumber* **divide**(*ComplexNumber* c1, *ComplexNumber* c2); Divide c1 by c2.

## Test Cases
Run the following to see some test cases.
```
java com.example.complex.TestComplexNumberCalculator
add test: 1.0-2.0i and 2.0-1.0i
result: 3.0-3.0i, expected: 3.0-3.0i
add test: passed

subtract test: 3.0+2.0i and 5.0-4.0i
result: -2.0+6.0i, expected: -2.0+6.0i
subtract test: passed

multiply test: 3.0-2.0i and 1.0+2.0i
result: 7.0+4.0i, expected: 7.0+4.0i
multiply test: passed

divide test: 4.0-2.0i and 1.0+1.0i
result: 1.0-3.0i, expected: 1.0-3.0i
divide test: passed
```


