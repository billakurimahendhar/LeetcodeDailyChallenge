class Solution {
    boolean valid(int a[],int mid,int k){
        int c=0;
        for(int i=0;i<a.length;i++){
            if(a[i]<=mid){
                c++;
                i++;

            }
        }
        return c>=k;

    }
    public int minCapability(int[] nums, int k) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<min){
                min=nums[i];
            }
            if(nums[i]>max){
                max=nums[i];
            }
        }
        int low=min,hi=max;
        int ans=0;
        while(low<=hi)
        {
            int m=(low+hi)/2;
            if(valid(nums,m,k))
            {
                ans=m;
                hi=m-1;
            }else{
                low=m+1;
            }
        }
        return ans;
    }
}