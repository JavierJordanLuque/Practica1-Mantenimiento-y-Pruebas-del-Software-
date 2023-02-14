package org.javijl.triangle;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
    Triangle triangle;

    @BeforeEach
    void setUp() {
        triangle = new Triangle();
    }

    @AfterEach
    void shutDown() {
        triangle = null;
    }

    @Test
    void triangleTwoThreeFourIsScalene() {
        Triangle.TriangleType obtainedValue = triangle.getType(2, 3, 4);
        Triangle.TriangleType expectedValue = Triangle.TriangleType.SCALENE;

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    void triangleTwoFiveTenIsException() {
        assertThrows(RuntimeException.class, () -> triangle.getType(2, 5, 10));
    }

    @Test
    void triangleTwoTwoTwoIsEquilateral() {
        Triangle.TriangleType obtainedValue = triangle.getType(2, 2, 2);
        Triangle.TriangleType expectedValue = Triangle.TriangleType.EQUILATERAL;

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    void triangleElevenElevenNineIsIsosceles() {
        Triangle.TriangleType obtainedValue = triangle.getType(11, 11, 9);
        Triangle.TriangleType expectedValue = Triangle.TriangleType.ISOSCELES;

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    void triangleTwoTwoFourIsException() {
        assertThrows(RuntimeException.class, () -> triangle.getType(2, 2, 4));
    }

    @Test
    void triangleThreeThreeFourIsIsosceles() {
        Triangle.TriangleType obtainedValue = triangle.getType(3, 3, 4);
        Triangle.TriangleType expectedValue = Triangle.TriangleType.ISOSCELES;

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    void triangleThreeFourThreeIsIsosceles() {
        Triangle.TriangleType obtainedValue = triangle.getType(3, 4, 3);
        Triangle.TriangleType expectedValue = Triangle.TriangleType.ISOSCELES;

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    void triangleFourThreeThreeIsIsosceles() {
        Triangle.TriangleType obtainedValue = triangle.getType(4, 3, 3);
        Triangle.TriangleType expectedValue = Triangle.TriangleType.ISOSCELES;

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    void triangleTwoTwoZeroIsException() {
        assertThrows(RuntimeException.class, () -> triangle.getType(2, 2, 0));
    }

    @Test
    void triangleTwoTwoMinusFourIsException() {
        assertThrows(RuntimeException.class, () -> triangle.getType(2, 2, -4));
    }

    @Test
    void triangleOneTwoThreeIsException() {
        assertThrows(RuntimeException.class, () -> triangle.getType(1, 2, 3));
    }

    @Test
    void triangleOneThreeTwoIsException() {
        assertThrows(RuntimeException.class, () -> triangle.getType(1, 3, 2));
    }

    @Test
    void triangleThreeOneTwoIsException() {
        assertThrows(RuntimeException.class, () -> triangle.getType(3, 1, 2));
    }

    @Test
    void triangleOneTwoFourIsException() {
        assertThrows(RuntimeException.class, () -> triangle.getType(1, 2, 4));
    }

    @Test
    void triangleOneFourTwoIsException() {
        assertThrows(RuntimeException.class, () -> triangle.getType(1, 4, 2));
    }

    @Test
    void triangleFourOneTwoIsException() {
        assertThrows(RuntimeException.class, () -> triangle.getType(4, 1, 2));
    }

    @Test
    void triangleZeroZeroZeroIsException() {
        assertThrows(RuntimeException.class, () -> triangle.getType(0, 0, 0));
    }

    @Test
    void triangleTwo_FiveThree_FiveFive_FiveIsScalene() {
        Triangle.TriangleType obtainedValue = triangle.getType(2.5, 3.5, 5.5);
        Triangle.TriangleType expectedValue = Triangle.TriangleType.SCALENE;

        assertEquals(expectedValue, obtainedValue);
    }
}