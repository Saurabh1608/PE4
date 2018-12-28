package com.stackroute.unittest.pe4;

import org.junit.Test;

import static org.junit.Assert.*;

public class RegexMatchesTest {

    private RegexMatches matcher = new RegexMatches();

    @Test
    public void multipleOccurenceUsingMatcher() {

        String input = "She sells seashells by the seashore";
        String checkPattern = "se";
        String output = "Found at:4-6" +
                "Found at:10-12" +
                "Found at:27-29";
        assertEquals(output,matcher.multipleOccurenceUsingMatcher(input,checkPattern));
    }

    @Test
    public void checkNotNull() {
        String input = "She sells seashells by the seashore";
        String checkPattern = "se";
        String output = "Found at:4-6" +
                "Found at:10-12" +
                "Found at:27-29";
        assertNotNull(matcher.multipleOccurenceUsingMatcher(input,checkPattern));
    }
}