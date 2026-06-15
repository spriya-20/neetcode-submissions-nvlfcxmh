class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> mp = new HashMap<>();
        for(String s : strs){
            char[] sChar = s.toCharArray();
            Arrays.sort(sChar);
            String sortedS = new String(sChar);
            mp.putIfAbsent(sortedS, new ArrayList<>());
            mp.get(sortedS).add(s);
        }
        return new ArrayList<>(mp.values());
    }
}
