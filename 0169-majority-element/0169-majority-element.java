class Solution {
    public int majorityElement(int[] nums) {
        
     //Boores Algorithm

     int count = 0;
     int element = 0,n=nums.length;

     for(int i=0; i<n ; i++) {
         if(count == 0) {
            element = nums[i];
         }

         if(nums[i] == element) {
            count++;
         } else{
            count--;
         }
     }

     int total = 0;

     for(int i=0;i<n;i++) {
        if(nums[i] == element) {
            total++;
        } 
     }

     if(total > n/2) {
        return element;
     }
       
       return -1;
    }
}