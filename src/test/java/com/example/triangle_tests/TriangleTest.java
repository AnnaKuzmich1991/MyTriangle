package com.example.triangle_tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(value = Parameterized.class)
public class TriangleTest {
    private Integer a, b, c;
    private boolean isTriangle;

    @Parameterized.Parameters
    public static Collection testDataIsTriangleExists() {
        return Arrays.asList(
                new Object[][]{
                        {7, 10, 9, true},
                        {7, 10, 10, true},
                        {7, 7, 7, true},
                        {5, 5, 10, false},
                        {0, 1, 2, false},
                        {1, 0, 2, false},
                        {1, 2, 0, false},
                        {-1, 2, 3, false},
                        {1, -2, 3, false},
                }
        );
    }

    public TriangleTest(Integer a, Integer b, Integer c, boolean isTriangle) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.isTriangle = isTriangle;
    }

    @Test()
    public void TriangleTest() {
        assertEquals(Triangle.checkIfTriangle(a, b, c), isTriangle);
    }

}




