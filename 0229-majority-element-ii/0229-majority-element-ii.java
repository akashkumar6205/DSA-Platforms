class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        List<Integer> ls =  new ArrayList<>();

        HashMap<Integer, Integer> map = new HashMap<>();

        int minm = (n/3) + 1;

        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
            if(map.get(num) == minm){
                ls.add(num);
            }
        }
        return ls;
    }
}