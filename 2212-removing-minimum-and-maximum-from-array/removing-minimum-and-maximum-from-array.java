class Solution {
    public int minimumDeletions(int[] nums) {
        int n=nums.length;
        int mid;
        if(n%2==0){
          mid=n/2;
        }else{
           mid=n/2+1; 
        }
        int max=nums[0];
        int min=nums[0];
        int idxmin=0;
        int idxmax=0;
        int nfdel=0;
        for(int i=0; i<n; i++){
            if(nums[i]>=max){
                max=nums[i];
                idxmax=i;
            }
            if(nums[i]<=min){
                min=nums[i];
                idxmin=i;
            }
        }
        int left = Math.max(idxmin, idxmax) + 1;
        int right = n - Math.min(idxmin, idxmax);
        int both = (Math.min(idxmin, idxmax) + 1)+ (n - Math.max(idxmin, idxmax));
        return Math.min(right,(Math.min(left,both)));
    }
}