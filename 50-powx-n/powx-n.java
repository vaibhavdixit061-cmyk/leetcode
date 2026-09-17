class Solution {
    public double myPow(double x, int n) {
       long temp=n;
       while(temp<0){
        x=1/x;
        temp=-temp;
       }
       double ans=1;
       while(temp>0){
        if(temp%2==1){
        ans=ans*x;
       }
       x=x*x;
       temp=temp/2;
        }
    return ans;
    }
}