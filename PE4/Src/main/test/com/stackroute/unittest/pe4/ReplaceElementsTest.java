package com.stackroute.unittest.pe4;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceElementsTest {

    private ReplaceElements replace = new ReplaceElements();

    @Test
    public void replace()
    {

            assertEquals("faity fry", replace.replace("daily dry"));

        }
    }
