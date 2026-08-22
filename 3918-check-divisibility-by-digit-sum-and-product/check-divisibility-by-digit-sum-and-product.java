class Solution {
    public int digitsum(int n){
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
        return sum;
    }
    public int product(int n){
        int product=1;
        while(n>0){
            int rem=n%10;
            product=product*rem;
            n=n/10;
        }
        return product;
    }
    public boolean checkDivisibility(int n) {
        if(n%(digitsum(n)+product(n))==0){
            return true;
        }
        return false;
    }
}