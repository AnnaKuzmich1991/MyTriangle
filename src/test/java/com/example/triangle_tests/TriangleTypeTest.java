package com.example.triangle_tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.runners.Parameterized.*;

@RunWith(value = Parameterized.class)
public class TriangleTypeTest {
    private Integer a, b, c;
    private String type;

    @Parameters
    public static Collection<Object[]> testDataTypeTriangle() {
        return Arrays.asList(
                new Object[][]{
                        {7, 5, 3, "Разносторонний"},
                        {6, 6, 8, "Равнобедренный"},
                        {6, 6, 6, "Равносторонний"},
                        {5, 5, 10, "Не существует"},
                        {1, null, 2, null},
                        {2, null, 2, null},
                        {3, null, 3, null},
                        {-1, 2, 3, null},
                });
    }

    public TriangleTypeTest(Integer a, Integer b, Integer c, String type) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.type = type;
    }

    @Test()
    public void TriangleTest() {
        if (a != null && b != null && c != null) {
            assertEquals(Triangle.checkTriangleType(a, b, c), type);
        } else {
            // Если какой-то из параметров равен null, пропустить тест
            System.out.println("Не существует");
        }
    }
}
