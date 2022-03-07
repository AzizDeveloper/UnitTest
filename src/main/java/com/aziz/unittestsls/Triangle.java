package com.aziz.unittestsls;

public class Triangle {
    int a, b, c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle(2, 3, 5);
        System.out.println("triangle.find(2, 3, 5) = " + triangle.find(2, 3, 5));
    }

    public int find(int a, int b, int c) {
        int s;
        s = a + b + c;
        return s;
    }
}
