package com.example.palindrome;

import java.util.*;

public class PalindromeFinder {
    public static class PalindromeInfo {
        String text;
        int index;
        int length;

        public PalindromeInfo(String text, int index, int length) {
            this.text = text;
            this.index = index;
            this.length = length;
        }

        @Override
        public String toString() {
            return String.format("Text: %s, Index: %d, Length: %d", text, index, length);
        }
    }

    public static List<PalindromeInfo> findLongestUniquePalindromes(String s) {
        Set<String> seen = new HashSet<>();
        List<PalindromeInfo> palindromes = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            expandAroundCenter(s, i, i, seen, palindromes);
            expandAroundCenter(s, i, i + 1, seen, palindromes);
        }

        palindromes.sort((a, b) -> Integer.compare(b.length, a.length));

        return palindromes.stream().filter(p -> p.length > 1).limit(3).toList();
    }

    private static void expandAroundCenter(String s, int left, int right, Set<String> seen, List<PalindromeInfo> list) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            String sub = s.substring(left, right + 1);
            if (!seen.contains(sub)) {
                seen.add(sub);
                list.add(new PalindromeInfo(sub, left, sub.length()));
            }
            left--;
            right++;
        }
    }

    public static void main(String[] args) {
        String input = "sqrrqabccbatudefggfedvwhijkllkjihxymnnmzpop";
        List<PalindromeInfo> result = findLongestUniquePalindromes(input);
        for (PalindromeInfo p : result) {
            System.out.println(p);
        }
    }
}