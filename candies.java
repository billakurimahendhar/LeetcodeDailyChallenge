class Solution {
    boolean valid(int a[],int m,long k)
    {
        long re=0;
        for(int i=0;i<a.length;i++)
        {
           re=re+a[i]/m;
        }
        return re>=k;
    }
    public int maximumCandies(int[] candies, long k) {
        
      int max=Integer.MIN_VALUE;
      for(int i=0;i<candies.length;i++)
      {
        if(candies[i]>max)
        max=candies[i];
      }
      int l=1;
      int ans=0;
      while(l<=max){
        int mid=l+(max-l)/2;
        if(valid(candies,mid,k)){
        l=mid+1;
        ans=mid;
        }
        else
        max=mid-1;
      }
  return ans;
        
    }
}