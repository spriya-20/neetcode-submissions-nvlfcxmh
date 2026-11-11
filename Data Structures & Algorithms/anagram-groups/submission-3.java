class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> mp = new HashMap<>();
        for(String s: strs){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String sortedArr = new String(ch);
            mp.putIfAbsent(sortedArr, new ArrayList<>());
            mp.get(sortedArr).add(s);
        }
        return new ArrayList<>(mp.values());
    }
}
