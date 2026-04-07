class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> arr = new HashSet<>();
        for(int num: nums){
            arr.add(num);
        }
        int longest =0;
        for(int num: arr){
            if(!arr.contains(num-1)){
                int length =1;
                while(arr.contains(num + length)){
                    length++;
                }
                longest = Math.max(longest, length);
            }
        }
        return longest;
        
    }
}
