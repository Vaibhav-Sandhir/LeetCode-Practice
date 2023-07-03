class Solution {
    public void rotate(int[] nums, int k) { 
        int n = nums.length;
        k = k % n;    

        reverseArray(nums, 0 , n - 1);
        reverseArray(nums, k, n - 1);
        reverseArray(nums, 0, k - 1);
    }

    public void reverseArray(int[] nums, int i, int j){
        int n = i + j;

        while(i < j){
            int temp = nums[i];
            nums[i++] = nums[j];
            nums[j--] = temp;
        }

    }
}
