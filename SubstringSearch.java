/*
 * Nilanshu Sharma
 * https://leetcode.com/problems/implement-strstr/
 */ 

public class SubstringSearch {
    public int strStr(String haystack, String needle) {
        int i,j;
        if(needle.length() == 0) {
            return 0;
        }
        if(haystack.length() < needle.length()) {
            return -1;
        }
        for(i=0;i<=haystack.length()-needle.length();i++){
            if(haystack.charAt(i) == needle.charAt(0)){
                for(j=0;j<needle.length();j++){
                    if(needle.charAt(j) != haystack.charAt(i+j)){
                        break;
                    }
                }
                if(j==needle.length()){
                    return i;
                }
            }
        }
        return -1;
    }
}