package com.epam.rd.autotasks;

import java.util.Locale;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double determinant = Math.pow(b,2) - 4.0*a*c; // Simple determinant formula

        if (determinant > 0) { // x1 , x2 --> 2 roots , det>0
            double x1 = ((-1.0)*b + Math.sqrt(determinant))/(2.0*a);
            double x2 = ((-1.0)*b - Math.sqrt(determinant))/(2.0*a);
            System.out.println(x1 + " " + x2);
        } else if (determinant == 0) {  // only 1 root as det=0
            double x = ((-1.0)*b)/(2.0*a);
            System.out.println(x);
        } else System.out.println("no roots"); // NO ROOTS as det<0

    }

}