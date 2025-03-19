class Solution {
    public int minOperations(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length-2;i++)
        {
            if(nums[i]==0)
            {
                nums[i]=nums[i]^1;
                nums[i+1]=nums[i+1]^1;
                nums[i+2]=nums[i+2]^1;
                c++;
            }

        }
        int j;
        for(j=0;j<nums.length-3;j++)
        {
            if(nums[j]==1)
            continue;
            else
            return -1;
        }
        if((nums[j]==0 && nums[j+1] ==0 && nums[j+2]==0)||(nums[j]==1&& nums[j+1] ==1 && nums[j+2]==1))
        return nums[j]==0?(c+1):c;
        else
        return -1;
    
        
    }
}