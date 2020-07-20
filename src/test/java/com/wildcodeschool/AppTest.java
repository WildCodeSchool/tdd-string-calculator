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

    @Test
    public void test2() {
        assertEquals(10, App.add("1,2,3,4"));
    }

    @Test
    public void test3() {
        assertEquals(10, App.add("1\n2,3,4"));
    }

    @Test
    public void test4() {
        assertEquals(10, App.add("//?\n1\n2?3?4"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void test5() {
        App.add("//?\n1\n2?3?4?-6");
    }

    @Test
    public void test5a() {
        try {
            App.add("//?\n1\n2?3?4?-6");
        } catch (IllegalArgumentException e) {
            assertEquals("negatives not allowed: [-6]", e.getMessage());
        }
    }

    @Test
    public void test5b() {
        try {
            App.add("//?\n1\n2?3?4?-6?-1");
        } catch (IllegalArgumentException e) {
            assertEquals("negatives not allowed: [-6, -1]", e.getMessage());
        }
    }
}
