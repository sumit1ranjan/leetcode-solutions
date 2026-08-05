class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> list=new ArrayList<>();
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=0; i<n; i++){
            if(nums[i]<min){
                min=nums[i];
            }
            if(nums[i]>max){
                max=nums[i];
            }
        }
        for(int i=min; i<=max; i++){
            boolean isPresent=false;
            for(int j=0; j<n; j++){
                if(nums[j]==i){
                    isPresent=true;
                    break;
                }
            }
            if(!isPresent){
                list.add(i);
            }
        }
        return list;
    }
}