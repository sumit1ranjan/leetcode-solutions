class Solution{
    public void rotate(int[] nums, int k){
        int n=nums.length;
        int rot=k%n;
        int[] arr=new int[n];
        int j=0;
        for(int i=n-rot; i<n; i++){
            arr[j]=nums[i];
            j++;
        }
        for(int i=0; i<n-rot; i++){
            arr[j]=nums[i];
            j++;
        }
        int l=0;
        for(int ele:arr){
            nums[l]=ele;
            l++;
        }
    }
}