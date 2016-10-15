/*
 * Nilanshu Sharma
 * https://leetcode.com/problems/reverse-string/
 */ 

public class ReverseString{
    public String reverseString(String s) {
        if(s == null || s.length() == 0)
            return s; 
        int start = 0, end = s.length()-1; 
        char[] arr = s.toCharArray(); 
        char temp; 
        while(start < end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp; 
            start++;
            end--;
        }
        return new String(arr); 
    }
}