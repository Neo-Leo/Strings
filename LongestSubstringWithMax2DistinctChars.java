/*
 * Nilanshu Sharma
 * https://leetcode.com/problems/longest-substring-with-at-most-two-distinct-characters/
 */ 

public class LongestSubstringWithMax2DistinctChars {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        if(s.length() <= 2){
            return s.length();
        }
        int[] map = new int[256];
        int count=0, start=0, end=0, maxLen=Integer.MIN_VALUE; 
        while(end <= s.length()-1) {
            if(map[s.charAt(end++)]++ == 0) count++; //First appearance of the character
            while(count>2){
                if(map[s.charAt(start++)]-- == 1) //Last Character   
                    count--;
            }
            maxLen = Math.max(maxLen, end-start);
        }
        return maxLen;
    }
}