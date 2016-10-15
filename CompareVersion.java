/*
 * Nilanshu Sharma
 * https://leetcode.com/problems/compare-version-numbers/
 */ 

public class Solution {
    public int compareVersion(String version1, String version2) {
       if(version1 == null || version1.length() == 0) return -1; 
       if(version2 == null || version2.length() == 0) return 1; 
       String[] v1 = version1.split("\\."); // This is O(m)
       String[] v2 = version2.split("\\."); // This is O(n)
       int i=0,j=0; 
       while(i <= v1.length-1 && j <= v2.length-1){
           //int v1Int = Integer.valueOf(v1[i]);
           //int v2Int = Integer.valueOf(v2[j]);
           //Lets not do it by converting it to int 
           String s1 = v1[i]; 
           String s2 = v2[j];
           // Skip leading 0s 
           int x=0,y=0;
           while(x <= s1.length()-1 && s1.charAt(x)=='0') x++; 
           while(y <= s2.length()-1 && s2.charAt(y)=='0') y++;
           if(s1.length()-x > s2.length()-y) {
               return 1;
           } else if(s1.length()-x < s2.length()-y) {
               return -1;
           } else {
               while(x <= s1.length()-1 && y <= s2.length()-1){
                   char ch1 = s1.charAt(x), ch2 = s2.charAt(y);  
                   if(ch1 > ch2) return 1; 
                   else if (ch1 < ch2) return -1; 
                   x++; y++; 
               }
           }
           //if(v1Int < v2Int) return -1;
           //else if(v1Int > v2Int) return 1; 
           i++;
           j++; 
       }
       
       while(i <= v1.length-1) {
            String s = v1[i++]; 
            int x = 0; 
            while(x <= s.length()-1)
            if(s.charAt(x++) != '0') return 1; 
       } 
       
       while(j <= v2.length-1) {
            String s = v2[j++]; 
            int x = 0; 
            while(x <= s.length()-1)
            if(s.charAt(x++) != '0') return -1; 
       }
       return 0; 
    }
}