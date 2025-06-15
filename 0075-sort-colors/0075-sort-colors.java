class Solution {
    public void sortColors(int[] nums) {

    
    int n = nums.length,low = 0,mid = 0,high = n -1,temp = 0;

    for(int i =0;i<n;i++) {

        if(nums[mid] == 0) {  //0-low-1 (0)
           temp = nums[mid];
           nums[mid] = nums[low];
           nums[low] = temp;
            mid ++;
            low ++;
        }
        else if(nums[mid] == 1) { //low -> mid-1
            mid++;
        } else if(nums[mid] == 2) {

            temp = nums[mid];
            nums[mid] = nums[high];
            nums[high] = temp;
            high--;
        }
    }
    }
}