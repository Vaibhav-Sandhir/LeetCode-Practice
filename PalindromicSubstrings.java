class Solution {
    public int countSubstrings(String s) {
        int count = 0;
        int n = s.length();
        char array[] = s.toCharArray();

        for(int i = 0; i < n; i++){
            int left = i;
            int right = i;
            while(left >= 0 && right < n){
                if(array[left] == array[right]){
                    count++;
                    left--;
                    right++;
                }
                else{
                    break;
                }
            }
        }

        for(int i = 0; i < n; i++){
            int left = i;
            int right = i + 1;
            while(left >= 0 && right < n){
                if(array[left] == array[right]){
                    count++;
                    left--;
                    right++;
                }
                else{
                    break;
                }
            }
        }

        return count;
    }
}
