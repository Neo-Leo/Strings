/*
 * Nilanshu Sharma
 * https://leetcode.com/problems/reverse-string-ii/
 */ 

public class Solution {
    public void reverse(char[] arr, int start, int end) {
        char temp; 
        while(start < end){
            temp = arr[start]; 
            arr[start] = arr[end]; 
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public String reverseStr(String s, int k) {
        if(s == null || k<=1) return s; 
        char[] arr = s.toCharArray();
        int start=0, end=0, mid=0, n=arr.length, tempK=2*k, midK=k; 
        while(end<=n-1) {
            tempK = 2*k;
            midK = k; 
            mid = start = end; 
            while(end<=n-1 && tempK>1){
                tempK--; 
                end++;
                if(midK > 1) {
                    mid++; 
                    midK--;
                }
            }
            if(mid == n) reverse(arr, start, mid-1);
            else reverse(arr,start,mid);
            end++;
        }
        return new String(arr); 
    }
}