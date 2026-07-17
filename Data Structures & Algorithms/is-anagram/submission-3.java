class Solution {
    public boolean isAnagram(String s, String t) {
        boolean flag = true;
        if((s.length() != t.length()))
                return false;

            char[] chars1 = s.toCharArray();
            Arrays.sort(chars1);


            char[] chars2 = t.toCharArray();
            Arrays.sort(chars2);

            for(int i=0;i<chars1.length;i++){
                if(chars1[i] != chars2[i])
                    flag = false;
            }
            return flag;
    }
}
