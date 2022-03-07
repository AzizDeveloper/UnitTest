package com.aziz.unittestsls;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    int a = 2, b = 3, c = 5;

    @Test
    void find() {

        int s = a + b + c;
        assertEquals(10, s);
    }
}