package com.stackroute.unittest.pe4;

import org.junit.Test;

import static org.junit.Assert.*;

public class CountOccurrenceTest {
    private CountOccurrence count = new CountOccurrence();


    @Test
    public void testcountOccurrence()
    {
        assertEquals(4, count.countOccurrence("java is java",'a'));

    }
    @Test
    public void testcountOccurrence1()
    {
        assertEquals(0, count.countOccurrence("java is java",'c'));

    }
}