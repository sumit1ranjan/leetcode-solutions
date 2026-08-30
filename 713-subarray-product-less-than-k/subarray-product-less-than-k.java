class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n=nums.length;
        int l=0;
        int r=0;
        int mul=1;
        int count=0;
        if (k <= 1) {
            return 0;
        }
        while(r<n){
            mul=mul*nums[r];
            while(mul>=k){
                mul=mul/nums[l];
                l++;
            }
            count=count+(r-l+1);
            r++;
        }
        return count;
    }
}