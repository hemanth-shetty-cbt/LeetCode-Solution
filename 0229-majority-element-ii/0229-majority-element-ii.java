class Solution {
    public List<Integer> majorityElement(int[] nums) {

       int count1 = 0, count2 = 0;
       List<Integer> ls = new ArrayList<> ();
       int ele1 = Integer.MIN_VALUE;
       int ele2 = Integer.MIN_VALUE;
       int n = nums.length;

       for(int i=0; i<n; i++) {
        
        if(count1 ==0 && nums[i] != ele2) {
            count1++;
            ele1 = nums[i];
        } else if(count2 ==0 && nums[i] != ele1) {
            count2++;
            ele2 =nums[i];
        } else if(nums[i] == ele1) {
            count1++;
        } else if(nums[i] == ele2) {
            count2++;
        } else {
            count1--;
            count2--;
        }
       }

        count1 = 0; count2 = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == ele1) count1++;
            if (nums[i] == ele2) count2++;
        }

        int mini = (int)(n / 3) + 1;
        if (count1 >= mini) ls.add(ele1);
        if (count2 >= mini) ls.add(ele2);

       return ls;




    }
}