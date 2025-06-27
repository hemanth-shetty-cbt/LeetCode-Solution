class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {


        int i =0,j =0;
        int arr[] = new int[m + n];
        int temp =0;

        while(i<m && j<n) {
             
             if(nums1[i] < nums2[j]) {
                arr[temp++] = nums1[i];
                i++;
             } else if(nums2[j] < nums1[i]) {
                arr[temp++] = nums2[j];
                j++;
             }
             else {
                arr[temp++] = nums1[i];
                arr[temp++] = nums2[j];
                i++;
                j++;
             }
        }

        while(i<m) {
            arr[temp++] = nums1[i++];
        }
        while(j<n) {
            arr[temp++] = nums2[j++];
        }
        
        for(int k=0 ; k< m + n; k++) {
            nums1[k] = arr[k]; 
        }
    }
}