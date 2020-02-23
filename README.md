# Complex Number Program

## ComplexNumber	
*Float* **real**; Real component of complex number.

*Float* **imag**; Imaginary component of complex number.

## ComplexNumberCalculator
*ComplexNumber* **add**(*ComplexNumber* c1, *ComplexNumber* c2); Add c1 and c2.

*ComplexNumber* subtract(*ComplexNumber* c1, *ComplexNumber* c2); Subtract c2 from c1.

*ComplexNumber* multiply(*ComplexNumber* c1, *ComplexNumber* c2); Multiply c1 and c2.

*ComplexNumber* divide(*ComplexNumber* c1, *ComplexNumber* c2); Divide c1 by c2.

## Test Cases
Run TestComplexNumberCalculator.java to see some test cases:

1. add test: 1.0-2.0i and 2.0-1.0i
expected: 3.0-3.0i

2. subtract test: 3.0+2.0i and 5.0-4.0i
expected: -2.0+6.0i

3. multiply test: 3.0-2.0i and 1.0+2.0i
expected: 7.0+4.0i

4. divide test: 4.0-2.0i and 1.0+1.0i
expected: 1.0-3.0i
