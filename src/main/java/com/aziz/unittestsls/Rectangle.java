package com.aziz.unittestsls;

public class Rectangle {
    int a, b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 20);
        System.out.println("rectangle.find() = " + rectangle.find());
    }

    public int find() {
        int p;
        p = 2 * (a + b);
        return p;
    }
}
