package x.solutions.Chapter01;

import java.util.Arrays;

public class Chapter_1_2_CheckPermutation {

    private static String sort(String s) {
        char[] content = s.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }

    private static boolean permutation(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        return sort(s).equals(sort(t));
    }

    public static void main(String[] args) {
        System.out.println(permutation("dog", "god"));
    }
}
