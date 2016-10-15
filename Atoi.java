/*
 * Nilanshu Sharma
 * https://leetcode.com/problems/string-to-integer-atoi/
 */ 

public class Atoi {
    public int myAtoi(String s) {
        long result = 0; 
        int i=0; 
        boolean isNeg = false; 
        while(i<=s.length()-1 && s.charAt(i) == ' ')
            i++; 
        if(i >= s.length())
            return 0; 
        isNeg = (s.charAt(i) == '-' ? true : false);
        if(isNeg || s.charAt(i) == '+')
            i++; 
        while(i<=s.length()-1 && Character.isDigit(s.charAt(i))){
            int digit = s.charAt(i) - '0'; 
            result = result*10 + digit;
            if(result > Integer.MAX_VALUE && !isNeg) return Integer.MAX_VALUE; 
            if(result > -1 * Integer.MIN_VALUE && isNeg) return Integer.MIN_VALUE;
            i++;
        } 
        return isNeg ? -1*(int)result : (int)result; 
    }
}