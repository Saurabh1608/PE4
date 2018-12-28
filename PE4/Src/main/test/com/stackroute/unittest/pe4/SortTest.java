package com.stackroute.unittest.pe4;
import org.junit.After;
 import org.junit.Before;
 import org.junit.Test;
 import static org.junit.Assert.*;

public class SortTest {
    Sort obj;

    @Before
    public void setUp() throws Exception {
        obj=new Sort();
    }

    @After
    public void tearDown() throws Exception {
        obj=null;
    }



    @Test
    public void word_sort() {



        assertEquals(
                "Boeing India Limited Limited",obj.word_sort("Boeing India Limited Limited") );
        assertEquals("error",
                "list of sorted the words",obj.word_sort("the sorted list of words") );

    }
}