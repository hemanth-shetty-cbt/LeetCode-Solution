class Solution {
    public int findDuplicate(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<nums.length; i++) {
            int value = map.getOrDefault(nums[i], 0);
            if(value == 1) {
                return nums[i];
            }
            else{
                map.put(nums[i], 1);
            }
        }

        return 0;
        
    }
}