class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> list = new HashSet<>();
        if (nums.length == 0){
            return 0;
        }
        int streak = 1;
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        if(nums.length == 0)
            return 0;
        for (int i=1;i<nums.length;i++){
            if(nums[i] - nums[i-1] == 1 || nums[i] - nums[i-1] == 0){
                list.add(nums[i]);
                list.add(nums[i-1]);
                streak = Math.max(list.size(), streak);
            } else {
                list = new HashSet<>();
            }
        }
        return streak;
    }
    /*static void main() {
        System.out.println(new Solution().longestConsecutive(new int[]{2,20,4,10,3,4,5}));
    }*/
}
