class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
     
        int first = -1;
        int last = -1;
        
        //first occurrence
        int low = 0; 
        int high = n -1;
        while(low <= high){
            int mid = (low + high) / 2;
            if(nums[mid] > target){
                high = mid - 1;
            }
            else if(nums[mid] < target){
                low = mid + 1;
            }
            else{ //target found
                first = mid;
                high = mid - 1;
            }
        }
        
         //last occurrence
        low = 0; 
        high = n -1;
        while(low <= high) {
            int mid = (low + high)/2;
            if(nums[mid] > target){
                high = mid - 1;
            }
            else if(nums[mid] < target){
                low = mid + 1;
            }
            else{
                last = mid;
                low = mid + 1;
            }
        }
        
        return new int[]{first, last};
        
    }
}