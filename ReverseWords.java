/*
 * Nilanshu Sharma
 * https://leetcode.com/problems/reverse-words-in-a-string/
 */ 

public class ReverseWords {
    
    void reverse(char[] arr, int start, int end){
        char temp; 
        while(start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp; 
            start++;
            end--;
        }
    }
    
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        if(s == null || s.length() == 0)
            return ""; 
        char ch; 
        int start = 0, end = s.length()-1; 
        while((start<=s.length()-1) && (s.charAt(start) == ' ')) start++;
        while((end >= 0) && (s.charAt(end) == ' ')) end--;
        if(start > end) return "";
        for(int i=start; i<=end; i++){
            ch = s.charAt(i);
            if((ch != ' ') || (ch == ' ' && s.charAt(i-1) != ' '))
                sb.append(ch);
        }
        sb.reverse();
        s = new String(sb);
        char[] arr = s.toCharArray(); 
        start = 0; 
        end = 0; 
        while(end<=arr.length-1){
            start = end; 
            while(end <= arr.length-1 && s.charAt(end) != ' '){
                end++; 
            }
            reverse(arr, start, end-1);
            end++; 
        }
        return new String(arr);
    }
}