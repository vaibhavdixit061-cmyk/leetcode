class Solution {
    public int minMoves(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=max){
                max=nums[i];
            }
        }
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            cnt+=max-nums[i];
        }
        return cnt;
    }
}