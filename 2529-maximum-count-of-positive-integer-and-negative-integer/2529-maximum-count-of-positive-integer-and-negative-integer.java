class Solution {
    public int maximumCount(int[] nums) {
        int n = nums.length;
        int negcount = 0;
        int poscount = 0;
        for(int i=0; i<n; i++){
            if(nums[i]<0){
                negcount++;
            }
            else if(nums[i] > 0){
                poscount++;
            }
        }
        return Math.max(negcount,poscount);
    }
}