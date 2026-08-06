class Solution {
    public int pdigit(int n){
        if (n == 0) return 0;
        int temp=n;
        int product=1;
        while(temp>0){
            int rem=temp%10;
            product=product*rem;
            temp=temp/10;
        }
        return product;
    }
    public int smallestNumber(int n, int t) {
        for(int i=n; i<=100; i++){
            if(pdigit(i)%t==0){
                return i;
            }
        }
        return -1;
    }
}