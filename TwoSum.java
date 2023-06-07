import java.util.*;
class Solution {
    public static int[] twoSum(int[] nums,int target) {
        int[] arr = new int[2];
        List<Integer> list = new ArrayList<Integer>();
        for(var item: nums)
            list.add(item);
        Arrays.sort(nums);
        int p = 0;
        int q = nums.length - 1;
        for(int i = 0; i < nums.length; i++){
            int sum = nums[p] + nums[q];
            if( sum == target){
                arr[0] = list.indexOf(nums[p]);
                arr[1] = list.lastIndexOf(nums[q]);
                return arr;
            }
            else if(sum > target)
                q--;
            else
                p++;        
        }
        return nums;
    }
}
