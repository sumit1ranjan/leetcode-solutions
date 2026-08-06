class Solution {
    public int countPrimes(int n) {
        if (n <= 2) {
            return 0;
        }
        int count=0;
        boolean[] prime=new boolean[n+1];
        for(int i=0; i<=n; i++){
            prime[i]=true;
        }
        prime[0]=false;
        prime[1]=false;
        for(int i=2; i<n; i++){
            if(prime[i]){
                count++;
                for(int j=i*2; j<n; j=j+i){
                    prime[j]=false;
                }
            }
        }
        return count;
    }
}