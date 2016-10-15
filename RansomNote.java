// Time Complexity - O(m + n)
// Space Complexity - O(n)
// Hash all the characters in the string "magazine" along with their counts. And then then traverse string ransomNote, and see if all the//characters in ransomNote are present in the string "magazine"   
 
public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        for(char ch : magazine.toCharArray()){
            if(hm.containsKey(ch)){
                int count = hm.get(ch);
                hm.put(ch,count+1);
            } else {
                hm.put(ch,1);
            }
        }
        
        for(char ch : ransomNote.toCharArray()) {
            if(!hm.containsKey(ch))
                return false; 
            int count = hm.get(ch);
            if(count == 1){
                hm.remove(ch);
            } else {
                hm.put(ch,count-1);
            }
        }
        return true; 
    }
}