/*
 * Nilanshu Sharma
 * https://leetcode.com/problems/flip-game/
 */ 

public class FlipGame {
    public List<String> generatePossibleNextMoves(String s) {
        List<String> list = new ArrayList<String>();
        if(s.length() <= 1){
            return list;
        }
        
        for(int i=0;i<=s.length()-2;i++){
            if(s.charAt(i) == '+' && s.charAt(i+1) == '+'){
                char[] arr = s.toCharArray();
                arr[i] = '-';
                arr[i+1] = '-';
                list.add(new String(arr));
            }    
        }
        return list;
    }
}