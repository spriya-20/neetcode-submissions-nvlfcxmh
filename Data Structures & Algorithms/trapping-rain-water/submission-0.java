class Solution {
    public int trap(int[] height) {
        if(height == null || height.length ==0){
            return 0;
        }
        int l=0, r = height.length-1;
        int leftMax = height[0];
        int rightMax = height[height.length-1];
        int res = 0;
        while(l<r){
            if(leftMax < rightMax){
                l++;
                leftMax = Math.max(leftMax, height[l]);
                res = res+ leftMax- height[l];
            }
            else{
                r--;
                rightMax = Math.max(rightMax, height[r]);
                res = res+ rightMax- height[r];
            }
        }
        return res;
    }
}
