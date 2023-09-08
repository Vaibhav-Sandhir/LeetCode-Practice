class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int n = nums.length;

        for(int i = 0; i < n; i++){
            int index = Math.abs(nums[i]) - 1;
            if(nums[index] < 0)
                result.add(Math.abs(nums[i]));
            else
                nums[index] = nums[index] * -1;    
        }

        return result;
    }
}
