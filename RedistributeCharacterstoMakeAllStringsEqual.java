class Solution {
    public boolean makeEqual(String[] words) {
        int n = words.length;
        Map<Character, Integer> map = new HashMap<>();

        for(String s : words){
            for(char c : s.toCharArray()){
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
        }
        
        for(int freq : map.values()){
            if(freq % n != 0){
                return false;
            }
        }

        return true;
                
    }
}
