/*
 * Nilanshu Sharma
 * https://leetcode.com/problems/reverse-words-in-a-string-ii/
 */ 

public class ReverseWords2 {
    public void reverse(char[] s, int start, int end){
        char temp;
        while(start < end){
            temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }
    public void reverseWords(char[] s) {
        if(s.length == 0 || s.length == 1){
            return;
        }
        reverse(s,0,s.length-1);
        int start;
        for(int i=0;i<=s.length-1;i++){
            start=i;
            while(i<= s.length-1 && s[i] != ' '){
                i++;
            }
            reverse(s, start, i-1);
        }
    }
}