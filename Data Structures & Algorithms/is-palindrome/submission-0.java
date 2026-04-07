class Solution {
    public boolean isPalindrome(String s) {
        String ss = s.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(ss);
        String reversed = new StringBuilder(ss).reverse().toString();
        System.out.println(reversed);
        if(ss.equalsIgnoreCase(reversed)){
            return true;
        }
        return false;
    }
}
