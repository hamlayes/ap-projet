package com.example.ap_projet;

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
    public void testImcValueIs14(){
        personne personneTest;
        personneTest = new personne("testImc14",1.88f,49.5f);
        assertEquals(14.0,personneTest.calculerImc(),2);
    }
}