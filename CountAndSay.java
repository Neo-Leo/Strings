/*
 * Nilanshu Sharma
 * https://leetcode.com/problems/count-and-say/
 */ 

public class CountAndSay {
    public String countAndSay(int n) {
        if(n == 0) return ""; 
        String res = "1";
        for(int i=2; i<=n;i++){
            res = generateCountAndSay(res);
        }
        return res; 
    }
    
    public String generateCountAndSay(String s){
        StringBuilder sb = new StringBuilder(); 
        int i=0, count=0;
        char ch; 
        while(i<=s.length()-1){
            ch = s.charAt(i); 
            count = 0;
            while(i <= s.length()-1 && s.charAt(i) == ch){
                count++;
                i++;
            }
            sb.append(count);
            sb.append(ch);
        }
        return new String(sb);
    }
}