class Solution {
    public int minOperations(int[][] grid, int x) {

        int m=grid.length;
        int n=grid[0].length;
        if(m*n ==1)
        return 0;
        int a[]=new int[m*n];
        int k=0;
        long sum=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                a[k++]=grid[i][j];
                sum=sum+grid[i][j];
            }
        }
        Arrays.sort(a);
        long avg=sum/(m*n);
        for(int i=0;i<a.length-1;i++)
        {
            if((a[i+1]-a[i])%x==0){
                continue;
            }else 
            return -1;
        }
         int s=a[a.length/2];
         int c=0;
         for(int i=0;i<a.length;i++){
            if(a[i]==s)
            continue;
            else{
              c+=Math.abs(a[i]-s)/x;
            }
         }
         return c;
        
    }
}
