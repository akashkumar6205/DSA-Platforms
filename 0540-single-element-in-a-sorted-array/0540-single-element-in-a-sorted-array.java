class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        if(n==1) return nums[0];
        if(nums[0] != nums[1]) return nums[0];
        if(nums[n-1] != nums[n-2]) return nums[n-1];
        int lo=0, hi=n-1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1]) return nums[mid];
            int fir = mid, sec = mid;
            if(nums[mid-1] == nums[mid]) fir = mid-1;
            else sec = mid + 1;
            int leftCount = fir - lo;
            int rightCount = hi - sec;
            if(leftCount%2 == 0) lo = sec + 1;
            else hi = fir - 1;
        }
        return 234;
    }
}