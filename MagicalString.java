/*
 * Nilanshu Sharma
 * https://leetcode.com/problems/magical-string/
 */ 

public class MagicalString {
    public int magicalString(int n) {
        if(n == 0) return 0;
        if(n <= 3) return 1; 
        StringBuilder sb = new StringBuilder(); 
        sb.append("122");
        int i=2, one_count=1;
        while(sb.length() < n){
            char ch = sb.charAt(i); 
            if(i%2 == 0) { // Turn to add 1's
                if(ch == '2') {
                    if(sb.length() == n-1) {
                        one_count++;
                        sb.append("1");
                    } else {
                        one_count += 2;
                        sb.append("11");
                    }
                } else {
                    sb.append("1");
                    one_count += 1;
                }
            } else { // Turn to add 2's
                if(ch == '2') sb.append("22");
                else sb.append("2");
            }
            i++;
        }
        return one_count;
    }
}