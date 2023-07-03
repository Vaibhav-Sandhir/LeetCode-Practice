class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int frequency = 1;
        int n = nums.length;

        for(int i = 1; i < n; i++){
            if(nums[i] != nums[i - 1] && frequency > (n / 2))
                return nums[i -1];

            else if(nums[i] == nums[i - 1])
                frequency++;

            else
                frequency = 1;        
        }
        return nums[n - 1];
    }
}
