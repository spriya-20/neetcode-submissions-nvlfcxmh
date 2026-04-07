class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        if(sArray.length != tArray.length){
            return false;
        }
        Arrays.sort(sArray);
        Arrays.sort(tArray);
        
        if(Arrays.equals(sArray,tArray)){
            return true;
        }
        return false;
    }
}
