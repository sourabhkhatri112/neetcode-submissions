class Solution {
    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length-1;

        while(start <= end){
            int mid = (start + end)/2;
            if(nums[end] < nums[mid]){
                start = mid+1;
            } else if(nums[end] > nums[mid]){
                end = mid;
            } else
                return nums[start];
        }
        return 0;
    }

/*static void main() {
        int num = new Solution().findMin(new int[]{4,5,6,7});
        System.out.println(num);
    }*/
}
