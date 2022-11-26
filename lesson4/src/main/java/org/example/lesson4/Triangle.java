package org.example.lesson4;

class Triangle {
    static double triangleSquare (double a, double b, double c) throws MyException {

        if (a <= 0 || b <= 0 || c <= 0 ) {
            throw new MyException ("Стороны треугольника не могут иметь отрицательное значение либо равняться 0");
        }
        if ( a + b <= c || a + c <= b || b + c <= a) { throw new MyException ("Сумма двух сторон треугольника не может быть меньше или равна длине третьей стороны");
        }

        double semiPerimeter = (a + b + c) / 2;

        double square = (double) Math.sqrt(semiPerimeter * (semiPerimeter - a) * (semiPerimeter - b) * (semiPerimeter - c));

        return square;
    }
}
