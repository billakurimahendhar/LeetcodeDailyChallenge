class Solution {
    public boolean checkValidCuts(int n, int[][] rectangles) {
        Arrays.sort(rectangles,(a,b)->Integer.compare(a[0],b[0]));
        int a=rectangles[0][2];
        int c=0;
        for(int i=0;i<rectangles.length;i++)
        {
            int a1[]=rectangles[i];
            if(a<=a1[0])
            c++;
            a=Math.max(a,a1[2]);
        }
      System.out.println(c);
       if(c>=2)
       return true;
       

       c=0;
        Arrays.sort(rectangles,(d,e)->Integer.compare(d[1],e[1]));
        int b=rectangles[0][3];
        for(int i=0;i<rectangles.length;i++){
            int b1[]=rectangles[i];
            if(b<=b1[1])
            c++;
           b= Math.max(b,b1[3]);


        }
        if(c>=2)
        return true;
        else
        return false;

    }
}