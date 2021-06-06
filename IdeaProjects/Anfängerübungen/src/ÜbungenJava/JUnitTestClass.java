package ÜbungenJava;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class JUnitTestClass {

    @Test

    public void setup(){

        String str = "Das ist ein Satz.";
        assertEquals("Das ist ein Satz.", str);

    }

}
