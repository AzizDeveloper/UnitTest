package com.aziz.unittestsls;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnotherClassTest {

    @Test
    void getSomething() {
        var anotherClass = new AnotherClass();
        assertEquals( "Hello what's up!", anotherClass.getSomething());
    }
}