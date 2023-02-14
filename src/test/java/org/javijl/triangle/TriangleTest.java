package org.javijl.triangle;

import static org.junit.jupiter.api.Assertions.*;

/*
    Test cases: (Test Case -> EXPECTED OUTPUT)
    1. Valid Scalene Triangle (2-3-4) -> SCALENE
        1.1. Non-Valid Scalene Triangle (2-5-10) -> RuntimeException
    2. Valid Equilateral Triangle (2-2-2) -> EQUILATERAL
    3. Valid Isosceles Triangle (11-11-9) -> ISOSCELES
        3.1. Non-Valid Isosceles Triangle (2-2-4) -> RuntimeException
    4. Three Permutations of a Valid Isosceles Triangle -> ISOSCELES
        4.1. Case (3-3-4)
        4.2. Case (3-4-3)
        4.3. Case (4-3-3)
    5. One Side is Zero (2-2-0) -> RuntimeException
    6. One Side is Negative (2-2-(-4))-> RuntimeException
    7. Three Permutations of a Sum of Two Numbers is Equal to the Third -> RuntimeException
        7.1. Case (1-2-3)
        7.2. Case (1-3-2)
        7.3. Case (3-1-2)
    8. Three Permutations of a Sum of Two Numbers is Less Than the Third -> RuntimeException
        8.1. Case (1-2-4)
        8.2. Case (1-4-2)
        8.3. Case (4-1-2)
    9. All Sides are Zero (0-0-0) -> RuntimeException
    10. Non-Integer Triangle (2.5-3.5-5.5) -> SCALENE
 */

class TriangleTest {

}