class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        boolean[] filled= new boolean[fruits.length];
        for(int i=0; i<fruits.length; i++){
            for(int j=0; j<baskets.length; j++){
                if(fruits[i]<=baskets[j]&&filled[j]==false){
                    filled[j]=true;
                    break;
                }
            }
        }
        int count=0;
        for(int i=0; i<filled.length; i++){
            if(filled[i]==false){
                count++;
            }
        }
        return count;
    }
}