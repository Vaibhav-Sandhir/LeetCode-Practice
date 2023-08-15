class Solution {
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        int target = 0;
        int sum = 0;
        int[] array = new int[10000000];
        int ind = 2;
        array[0] = 0;
        array[1] = nums[n - 1];

        for(int i = 0; i < n; i++){
            sum += nums[i];
        }

        if(sum % 2 == 1){
            return false;
        }
        target = sum / 2;

        for(int i = n - 2; i >= 0; i--){
            int limit = ind;
            for(int j = 0; j < limit; j++){
                    System.out.println(array[j] + " " + nums[i]);
                    if(array[j] + nums[i] == target)
                        return true;   
                    array[ind++] = array[j] + nums[i];
                } 
            }
        return false;    
        }
    }
