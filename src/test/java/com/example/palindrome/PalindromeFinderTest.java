package com.example.palindrome;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class PalindromeFinderTest {
    @Test
    public void testFindLongestUniquePalindromes() {
        String input = "sqrrqabccbatudefggfedvwhijkllkjihxymnnmzpop";
        List<PalindromeFinder.PalindromeInfo> result = PalindromeFinder.findLongestUniquePalindromes(input);

        assertEquals(3, result.size());
        assertEquals("hijkllkjih", result.get(0).text);
        assertEquals(23, result.get(0).index);
        assertEquals(10, result.get(0).length);
    }
}