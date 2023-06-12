class Solution {
        public static int lengthOfLongestSubstring(String s) {
        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();
        for(char c : s.toCharArray())
            set1.add(c);
        int length_sub = set1.size();
        while(length_sub != 1){
            for(int p = 0; p <= s.length() - length_sub;p++){
                int q = p + length_sub - 1;
                String sub = s.substring(p,q + 1);
                System.out.println(sub);
                for(char x: sub.toCharArray())
                    set2.add(x);
                if(set2.size() == length_sub)
                    return length_sub;
                set2.clear();
            }
            length_sub--;
        }
        return 1;
    }
}
