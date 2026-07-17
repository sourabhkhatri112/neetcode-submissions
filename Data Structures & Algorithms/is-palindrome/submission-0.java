class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0;
        int right = s.length()-1;
        char[] list = s.toCharArray();
        while (left < right){
            if(list[left] != list[right]){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
