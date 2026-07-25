class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;

        Set<List<Integer>> st = new HashSet<>(); 
        for(int i = 0; i<n; i++){
            for(int j = i+1; j<n; j++){
                HashSet<Integer> hashset = new HashSet<>();
                for(int k = j+1; k<n; k++){
                    long fourth = (long)target - nums[i] - nums[j] - nums[k];
                    if(fourth >= Integer.MIN_VALUE &&
                        fourth <= Integer.MAX_VALUE &&
                        hashset.contains((int) fourth)){
                        List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k], (int)fourth);
                        Collections.sort(temp);
                        st.add(temp);
                    }
                    hashset.add(nums[k]);
                }
            }
        }
        return new ArrayList<>(st);
    }
}