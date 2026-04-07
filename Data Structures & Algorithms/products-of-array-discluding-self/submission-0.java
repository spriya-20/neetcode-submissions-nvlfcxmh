class Solution {
    public int[] productExceptSelf(int[] nums) {
        //nums =[1 2 4 6]
        int res[] = new int[nums.length];
        res[0]=1;
        for(int i = 1; i< nums.length; i++){
            res[i] = res[i-1]*nums[i-1];
        }
        // [1 1 2 8]
        int postfix =1;
        for(int i=nums.length-1;i>=0; i--){
            res[i]= postfix*res[i];
            postfix = nums[i]*postfix;
        }
        return res;
    }
}  
