/*
 * Nilanshu Sharma
 * https://leetcode.com/problems/reverse-vowels-of-a-string/
 */ 

public class ReverseVowels {
    public boolean isVowel(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            return true; 
        }
        if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
            return true; 
        }
        return false; 
    }
    public String reverseVowels(String s) {
        if(s == null) return s; 
        char[] a = s.toCharArray();
        char temp;
        int start = 0, end = s.length()-1;
        while(start < end){
            while((start < end) && !isVowel(a[start])) start++; 
            while((start < end) && !isVowel(a[end])) end--;
            if(start < end) {
                temp = a[start];
                a[start] = a[end];
                a[end] = temp; 
                start++;
                end--;
            }
        }
        return new String(a);
    }
}