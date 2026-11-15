class Solution {
    public int numOfSubarrays(int[] arr) {
        int mod=1000000007;
        int odd=0;
        int  even=1;
        int cnt=0;
        int sum=0;
        for(int num:arr){
            sum+=num;
            if(sum%2==0){
                cnt+=odd;
                even++;
            }else {
                cnt+=even;
                odd++;
            }
            cnt %= mod;
        }
        return cnt;
    }
}