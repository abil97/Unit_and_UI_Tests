package com.example.utests;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void CorrectInput(){
        assertTrue(MainActivity.checkCorrectInput("Abil"));
        assertTrue(MainActivity.checkCorrectInput("Somename"));
        assertTrue(MainActivity.checkCorrectInput("Hello"));
        assertTrue(MainActivity.checkCorrectInput("Foo"));
        assertTrue(MainActivity.checkCorrectInput("Dbshsiiueudw"));
    }

    public void IncorrectInput(){
        assertFalse(MainActivity.checkCorrectInput("abil"));
        assertFalse(MainActivity.checkCorrectInput("aBiL"));
        assertFalse(MainActivity.checkCorrectInput("abiL"));
        assertFalse(MainActivity.checkCorrectInput("ABIL"));
        assertFalse(MainActivity.checkCorrectInput("abil_001"));
        assertFalse(MainActivity.checkCorrectInput("a1b2c3d4"));
        assertFalse(MainActivity.checkCorrectInput("a_b_i_l"));
        assertFalse(MainActivity.checkCorrectInput("AbiL"));
        assertFalse(MainActivity.checkCorrectInput("Abil009"));
        assertFalse(MainActivity.checkCorrectInput("Abil_001"));

    }


}