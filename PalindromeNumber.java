class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0)
            return false;

        String s = Integer.toString(x);
        char[] arr = s.toCharArray();
        int n = s.length();
        for(int i = 0, j = n - 1; i < n / 2; i++, j--){
            if(arr[i] != arr[j])
                return false;
        }
        return true;
    }
}
