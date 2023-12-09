package com.example.triangle_tests;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import static com.example.triangle_tests.Triangle.*;

@SpringBootApplication
public class  TriangleTestsApplication {

    public static void main(String[] args) {
        SpringApplication.run(TriangleTestsApplication.class, args);
        Triangle triangle = new Triangle();
        Scanner sc = new Scanner(System.in);
        String user_answer;

        while (true) {
            System.out.println("Нажмите любую клавишу для продолжения или \"q\" для выхода");
            System.out.println("Ваш ответ: ");
            user_answer = sc.next();
            if (user_answer.equals("q")) {
                System.out.println("Выход");
                break;
            }

            System.out.println("\nВведите три целых числа больше нуля");
            try {
                System.out.println("Сторона a: ");
                int a = sc.nextInt();
                System.out.println("Сторона b: ");
                int b = sc.nextInt();
                System.out.println("Сторона c: ");
                int c = sc.nextInt();
                if (triangle.checkIfTriangle(a, b, c)) {
                    checkTriangleType(a, b, c);
                }

            } catch (InputMismatchException e) {
                System.out.println("Ошибка ввода, введите целые числа больше нуля");
            }
        }
    }
}
