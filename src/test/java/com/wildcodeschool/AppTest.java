package com.wildcodeschool;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void test1() {
        assertEquals(0, App.add(""));
        assertEquals(0, App.add("0"));
        assertEquals(1, App.add("1"));
        assertEquals(42, App.add("42"));
        assertEquals(3, App.add("1,2"));
        assertEquals(42, App.add("0,42"));
    }
}
