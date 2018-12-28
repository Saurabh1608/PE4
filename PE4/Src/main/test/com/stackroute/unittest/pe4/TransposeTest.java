package com.stackroute.unittest.pe4;

import org.junit.Test;

import static org.junit.Assert.*;

public class TransposeTest {

    @Test
    public void testReserveWords() {

        assertEquals("yliad yrd", Transpose.reserveWords("daily dry"));
    }
    @Test
    public void testReserveWords1() {

        assertEquals("a kciuq nworb xof spmuj revo eht yzal god", Transpose.reserveWords(" a quick brown fox jumps over the lazy dog"));
    }

}