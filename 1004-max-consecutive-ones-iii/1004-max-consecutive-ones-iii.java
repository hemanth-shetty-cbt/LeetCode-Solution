class Solution {
    public int longestOnes(int[] nums, int k) {

     int right = 0, left = 0, n = nums.length, nz =0,max =0;

     while(right < n) {

        if(nums[right] == 0) {
            nz++;
        }

        if(nz > k) {
            if(nums[left] == 0) {
                nz--;
            }
            left ++;

        }

        if(nz <= k ) {
            int len = right - left +1;
            max = Math.max(max, len);

        }

        right++;
     }


    return max;
        
        
    }
}