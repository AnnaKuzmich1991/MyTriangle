package com.example.triangle_tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.runners.Parameterized.*;

@RunWith(value = Parameterized.class)
public class TriangleTest {
    private Integer a, b, c;
    private boolean isTriangle;

    @Parameters
    public static Collection testDataIsTriangleExists() {
        return Arrays.asList(
                new Object[][]{
                        {6, 12, 8, true},
                        {2, 12, 12, true},
                        {2, 8, 8, true},

                        {2, 8, 12, false},
                        {0, 4, 6, false},
                        {3, 0, 7, false},
                        {3, 6, 0, false},

                        {-3, 2, 3, false},
                        {7, -4, 3, false},
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




