/*
 * Nilanshu Sharma
 * https://leetcode.com/problems/valid-palindrome/
 */ 

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        if(s == null || s.length() == 0) return true;
        int start = 0, end = s.length()-1;
        while(start < end) {
            while((start < end) && !Character.isLetterOrDigit(s.charAt(start))) //Skip irrelevant characters,Stop at valid Letter from start
                start++; 
            while((start < end) && !Character.isLetterOrDigit(s.charAt(end))) //Stop at a valid Letter from end
                end--;
            if((start < end) && Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) {
                return false;
            } else {
                start++;
                end--;
            }
        }
        return true;
    }
}