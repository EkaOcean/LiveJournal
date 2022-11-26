package org.example.lesson4;

import org.example.lesson4.Triangle;
import org.example.lesson4.MyException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TriangleTest {

    @Test
    void test () throws MyException {
        Triangle triangle = new Triangle();
        Assertions.assertEquals(43.30127018922193,triangle.triangleSquare(10,10, 10));
        Assertions.assertThrows(MyException.class,()-> triangle.triangleSquare(-10,10, 10));
    }

    @ParameterizedTest
    @CsvSource({"10, 20, 15, 72.61843774138907","100, 200, 150, 7261.843774138907","1, 2, 1.5, 0.7261843774138906"})
    void testWithCsvSourcePositive (double a, double b, double c, double square) throws MyException {
        Triangle triangle = new Triangle();
        Assertions.assertEquals(triangle.triangleSquare(a,b,c), square);
    }

    @ParameterizedTest
    @CsvSource({"-10, 20, 15","100, 200, -150","1, -2, 1.5"})
    void testWithCsvSourceNegativeMinus (double a, double b, double c) throws MyException {
        Triangle triangle = new Triangle();
        Assertions.assertThrows(MyException.class,()-> triangle.triangleSquare(a, b, c));
    }

    @ParameterizedTest
    @CsvSource({"0, 20, 15","100, 200, 0","1, 0, 1.5"})
    void testWithCsvSourceNegativeZero (double a, double b, double c) throws MyException {
        Triangle triangle = new Triangle();
        Assertions.assertThrows(MyException.class,()-> triangle.triangleSquare(a, b, c));
    }

}
