/*
 * Nilanshu Sharma
 * https://leetcode.com/problems/license-key-formatting/
 */

public class Solution {
    public String licenseKeyFormatting(String S, int K) {
        if(S == null || S.length() == 0 || K == 0) return S; 
        int i = S.length()-1, tempK=K; 
        StringBuilder sb = new StringBuilder(); 
        while(i>=0){
            char ch = S.charAt(i--);
            if(!Character.isDigit(ch) && (ch != '-') && Character.isLowerCase(ch)){
                ch = Character.toUpperCase(ch);
            }
            if(ch != '-') {
                sb.append(ch);
                tempK--;
            }
            if(tempK == 0){
                sb.append("-");
                tempK = K; 
            } 
        }
        int n = sb.length(); 
        if(n == 0) return "";
        if(sb.charAt(n-1) == '-') sb.deleteCharAt(n-1);
        sb.reverse();
        return new String(sb);
    }
}