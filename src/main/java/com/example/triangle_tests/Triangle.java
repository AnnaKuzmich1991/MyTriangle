package com.example.triangle_tests;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.Scanner;

public class Triangle {
    static boolean checkIfTriangle(Integer a, Integer b, Integer c) {
        boolean triangleExist = false;
        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Стороны треугольника должны быть больше нуля");
        } else if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Треугольника не существует");
        } else if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Треугольник существует");
            triangleExist = true;
        }
        return triangleExist;
    }

    static String checkTriangleType(int a, int b, int c) {
        String type;
        if (a == b || a == c || b == c) {
            if (a == b && a == c) {
                System.out.println("Равносторонний треугольник");
                type = "Равносторонний";
            } else if (a + b == c || a + c == b || b + c == a) {
                System.out.println("Треугольника не существует");
                type = "Не существует";
            } else {
                System.out.println("Равнобедренный треугольник");
                type = "Равнобедренный";
            }
        } else if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Разносторонний треугольник");
            type = "Разносторонний";
        } else {
            System.out.println("Не существует");
            type = null;
        }
        return type;
    }

}
