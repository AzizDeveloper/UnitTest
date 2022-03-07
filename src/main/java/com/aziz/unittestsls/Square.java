package com.aziz.unittestsls;

public class Square {
    int a;

    public Square(int a) {
        this.a = a;
    }

    public static void main(String[] args) {
        Square square = new Square(25);
        System.out.println("square.find() = " + square.find());
    }

    public int find() {
        int p = a * 4;
        return p;
    }
}