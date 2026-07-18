class Solution {
    public int[] productExceptSelf(int[] nums) {
        int totalPrefix = 1;int totalSuffix = 1;
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            totalPrefix = nums[i] * totalPrefix;
            prefix[i] = totalPrefix;
        }

        for(int i=nums.length-1; i>=0;i--){
            totalSuffix = nums[i] * totalSuffix;
            suffix[i] = totalSuffix;
        }

        System.out.println("Prefix " + Arrays.toString(prefix));
        System.out.println("Suffix " + Arrays.toString(suffix));

        for(int i=0;i<nums.length;i++){
            if(i == 0){
                nums[i] = suffix[i + 1];
            } else if(i == nums.length -1 ){
                nums[i] = prefix[i-1];
            } else {
                nums[i] = prefix[i-1] * suffix[i+1];
            }
        }
        return nums;
    }

    /*static void main() {
        int[] nums = new Solution().productExceptSelf(new int[]{-1,0,1,2,3});
        System.out.println(Arrays.toString(nums));
    }*/
}  
