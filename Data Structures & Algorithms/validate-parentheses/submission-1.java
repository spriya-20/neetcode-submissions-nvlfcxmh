class Solution {
    public boolean isValid(String s) {
        Stack<Character> sc = new Stack<>();
        for(int i =0; i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                sc.push(s.charAt(i));
            }
            else if(!sc.isEmpty() && ((sc.peek()=='(' && s.charAt(i)==')')
            || (sc.peek()=='{' && s.charAt(i)=='}') || (sc.peek()=='[' && s.charAt(i)==']')
            )){
                sc.pop();
            }
            else
                return false;
        }
        return sc.isEmpty();
    }
}
