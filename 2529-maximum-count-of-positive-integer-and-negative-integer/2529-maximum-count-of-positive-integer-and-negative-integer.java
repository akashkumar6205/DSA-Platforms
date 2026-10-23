class Solution {
public int maximumCount(int[] nums) {
int n = nums.length;
int lo = 0, hi = n;

    // Find the first element >= 0
    while (lo < hi) {
        int mid = lo + (hi - lo) / 2;

        if (nums[mid] < 0) {
            lo = mid + 1;
        } else {
            hi = mid;
        }
    }

    int negcount = lo;

    // Find the first element > 0
    lo = 0;
    hi = n;

    while (lo < hi) {
        int mid = lo + (hi - lo) / 2;

        if (nums[mid] <= 0) {
            lo = mid + 1;
        } else {
            hi = mid;
        }
    }

    int poscount = n - lo;

    return Math.max(negcount, poscount);
}

}
