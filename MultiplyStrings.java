/*
 * Nilanshu Sharma
 * https://leetcode.com/problems/multiply-strings/
 */ 

public class MultiplyStrings {
    public String multiply(String num1, String num2) {
        int[] res = new int[num1.length() + num2.length()]; 
        for(int i=num1.length()-1; i>=0; i--) {
            int carry = 0; 
            for(int j=num2.length()-1; j>=0; j--) {
                int a = num1.charAt(i) - '0';
                int b = num2.charAt(j) - '0';
                int product = res[i+j+1] + a*b + carry; 
                res[i+j+1] = product%10;
                carry = product/10; 
            }
            res[i] = carry; 
        }
        
        StringBuilder sb = new StringBuilder(); 
        int i=0;
        while(i<=res.length-1 && res[i] == 0) i++; 
        if(i == res.length) return "0";
        while(i <= res.length-1) sb.append(res[i++]);
        return new String(sb);
    }
}