class Solution {
    public boolean isAnagram(String s, String t) {
        char stemp[] = s.toCharArray();
        char ttemp[] = t.toCharArray();
        Arrays.sort(stemp);
        Arrays.sort(ttemp);
        s = new String(stemp);
        t = new String(ttemp);
        if(s.length() != t.length())
            return false;
        if(s.equals(t))
            return true;

    return false;
    }
}
