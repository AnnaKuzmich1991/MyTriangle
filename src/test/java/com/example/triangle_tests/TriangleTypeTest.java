package com.example.triangle_tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(value = Parameterized.class)
public class TriangleTypeTest {
    private Integer a, b, c;
    private String type;

    @Parameterized.Parameters
    public static Collection testDataTypeTriangle() {
        return Arrays.asList(
                new Object[][]{
                        {7, 10, 9, "Разносторонний"},
                        {7, 10, 10, "Равнобедренный"},
                        {7, 7, 7, "Равносторонний"},
                        {5, 5, 10, "Не существует"},
                        {0, 1, 2, null},
                        {1, 0, 2, null},
                        {1, 2, 0, null},
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
        assertEquals(Triangle.checkTriangleType(a, b, c), type);
    }
}