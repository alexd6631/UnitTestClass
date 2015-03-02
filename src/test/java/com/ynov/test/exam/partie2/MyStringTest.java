package com.ynov.test.exam.partie2;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyStringTest {

    @Test
    public void testToUpperCase() throws Exception {
        MyString s = new MyString("abcdefg");
        s.toUpperCase();
        assertEquals("ABCDEFG", s.getString());
    }

    @Test
    public void testNumberOfChar() throws Exception {
        MyString s = new MyString("The quick brown fox");
        assertEquals(0, s.numberOfChar('z'));
        assertEquals(2, s.numberOfChar('o'));
        assertEquals(1, s.numberOfChar('w'));
    }

    @Test
    public void testNumberOfVoyels() throws Exception {
        MyString s = new MyString("The quick brown fox");
        assertEquals(5, s.numberOfVoyels());

        MyString s2 = new MyString("zvbxfgh");
        assertEquals(0, s2.numberOfVoyels());
    }

    @Test
    public void testGetString() throws Exception {

    }

    @Test
    public void testSetString() throws Exception {

    }

    @Test
    public void testGetFirstWord() throws Exception {
        MyString s = new MyString("The quick brown fox");
        assertEquals("The", s.getFirstWord());

        MyString s2 = new MyString("");
        assertEquals("", s2.getFirstWord());

        MyString s3 = new MyString("abcd");
        assertEquals("abcd", s3.getFirstWord());
    }

    @Test
    public void testIsPalindrome() throws Exception {
        assertTrue(new MyString("kayak kayak").isPalindrome());
        assertTrue(new MyString("radar").isPalindrome());
        assertFalse(new MyString("foobar").isPalindrome());

    }
}