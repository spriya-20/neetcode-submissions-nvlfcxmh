class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> mp = new HashMap<>();
        for(String s : strs){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String sortedS = new String(ch);
            mp.putIfAbsent(sortedS, new ArrayList<>());
            mp.get(sortedS).add(s);
        }
        return new ArrayList<>(mp.values());
    }
}
