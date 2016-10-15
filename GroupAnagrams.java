/*
 * Nilanshu Sharma
 * https://leetcode.com/problems/anagrams/
 */ 

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hm = new HashMap<String, List<String>>(); 
        Arrays.sort(strs); 
        List<List<String>> lists = new ArrayList<List<String>>();
        List<String> temp;
        for(String str : strs){
            char[] arr = str.toCharArray(); 
            Arrays.sort(arr); 
            String key = new String(arr); 
            if(hm.containsKey(key)){
                temp = hm.get(key);
            } else {
                temp = new LinkedList<String>();
            }
            temp.add(str);
            hm.put(key, temp);
        }
        for(String key : hm.keySet()){
            lists.add(hm.get(key)); 
        }
        return lists; 
    }
}