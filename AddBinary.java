/*
 * Nilanshu Sharma
 * https://leetcode.com/problems/add-binary/
 */ 

public class AddBinary {
    public String addBinary(String str1, String str2) {
        int[] res = new int[Math.max(str1.length(),str2.length()) + 1];
        int carry = 0, digit1=0, digit2=0, sum=0, m=str1.length()-1, n=str2.length()-1, i=res.length-1;
        while(m >= 0 || n >= 0 || carry != 0){
            digit1 = (m>=0) ? str1.charAt(m--)-'0' : 0; 
            digit2 = (n>=0) ? str2.charAt(n--)-'0' : 0;
            sum = digit1 + digit2 + carry;
            res[i--] = sum%2; 
            carry = sum/2; 
        }
        i=0; 
        while(i<=res.length-1 && res[i] == 0) i++; 
        if(i == res.length) return "0";
        StringBuilder sb = new StringBuilder(); 
        while(i<=res.length-1)
            sb.append(res[i++]);
        return new String(sb); 
     }
}