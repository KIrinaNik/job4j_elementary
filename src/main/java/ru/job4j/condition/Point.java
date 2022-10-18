package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double x2minusx1 = x2 - x1;
        double y2minusy1 = y2 - y1;
        double pow1 = Math.pow(x2minusx1, 2);
        double pow2 = Math.pow(y2minusy1, 2);
        double summa = pow1 + pow2;
        return Math.sqrt(summa);
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 16, 10);
        System.out.println("result (0, 0) to (2, 0) " + result);
    }
}
