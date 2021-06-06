package ÜbungenJava;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        assertEquals(4, Calculator.add(3,1));
        assertEquals(4, Calculator.add(2,2));
        assertEquals(4, Calculator.add(-1,5));
        assertEquals(4, Calculator.add(-4,8));
    }
    @Test
    void addfail(){
        assertEquals(4, Calculator.add(2,1));
    }

    @Test
    void sub() {
        assertEquals(5, Calculator.sub(9,4));
        assertEquals(-4, Calculator.sub(2,6));
        assertEquals(-5, Calculator.sub(-1,4));
        assertEquals(-2, Calculator.sub(-4,-2));
    }

    @Test
    void subfail() {
        assertEquals(4, Calculator.sub(2, 1));
    }

    @Test
    void mul() {
        assertEquals(49, Calculator.mul(7,7));
        assertEquals(4, Calculator.mul(2,2));
        assertEquals(-4, Calculator.mul(-1,4));
        assertEquals(8, Calculator.mul(-4,-2));
    }

    @Test
    void mulfail(){
        assertEquals(4, Calculator.mul(2,1));
    }


    @Test
    void div() {
        assertEquals(2, Calculator.div(2,1));
        assertEquals(10, Calculator.div(100,10));
        assertEquals(8, Calculator.div(64,8));
        assertEquals(2, Calculator.div(-4,-2));
        assertEquals(0, Calculator.div(5,0));
    }

    @Test
    void divfail(){
        assertEquals(4, Calculator.div(2,1));
    }
}