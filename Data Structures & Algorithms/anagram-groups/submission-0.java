class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> ana = new HashMap<>();
        for(String s: strs){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String str = new String(ch);
            ana.putIfAbsent(str, new ArrayList<>());
            ana.get(str).add(s);
        }
        return new ArrayList<>(ana.values());
    }
}
