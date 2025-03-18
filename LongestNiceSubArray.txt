class Solution {
    public int longestNiceSubarray(int[] nums) {
        int c=0,xor=0,ml=0;
        int l=0;
        for(int r=0;r<nums.length;r++)
        {
            c+=nums[r];
            xor^=nums[r];
            if(c==xor){
                ml=Math.max(ml,r-l+1);
            }else{
                c=c-nums[l];
                xor=xor^nums[l];
                l++;
            }

        }
        return ml;
    }
}