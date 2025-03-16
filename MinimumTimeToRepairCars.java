class Solution {
    boolean valid(int a[],long m,int cars)
    {
        long k=0;
        for(int i=0;i<a.length;i++)
        {
            k=k+(long)(Math.sqrt(m/a[i]));
        }
        return k>=cars;
    }
    public long repairCars(int[] ranks, int cars) {
        long l=1, h=0;
        for(int i=0;i<ranks.length;i++)
         if(ranks[i]>h)
         h=ranks[i];
         h=(long)h*cars*cars;
        long ans=0;
         while(l<=h){
            long m=l+(h-l)/2;
            if(valid(ranks,m,cars)){
                ans=m;
                h=m-1;
            }else
                l=m+1;
         }
        return ans;

        
    }
}