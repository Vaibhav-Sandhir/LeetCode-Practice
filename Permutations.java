class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        func(nums, new ArrayList<>(), result);
        return result;
    }

    private void func(int nums[], List<Integer> list, List<List<Integer>> result){
        if(list.size() == nums.length){
            result.add(new ArrayList<>(list));
            return;
        }

        for(int i = 0; i < nums.length; i++){
            if(!list.contains(nums[i])){
                list.add(nums[i]);
                func(nums, list, result);
                list.remove(list.size() - 1);
            }
        }
    }
}
