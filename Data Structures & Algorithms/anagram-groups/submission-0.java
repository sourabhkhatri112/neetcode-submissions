class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
         Map<String, List<String>> map = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char[] s = strs[i].toCharArray();
            String unsorted = new String(s);
            Arrays.sort(s);
            String sorted = new String(s);
            if(!map.containsKey(sorted)){
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(unsorted);  // always add word to its group
        }
        return new ArrayList<>(map.values());
    }
}
