class Solution {
    public int countDays(int days, int[][] meetings) {

        Arrays.sort(meetings,(a,b)->Integer.compare(a[0],b[0]));
        LinkedList<int[]> arl=new LinkedList<>();
        for(int []a:meetings)
        {
            if(!arl.isEmpty()  && a[0]<=arl.getLast()[1])
            arl.getLast()[1]=Math.max(arl.getLast()[1],a[1]);
            else
            arl.add(a);
        }
        int count=0;
         for(int i=0;i<arl.size();i++)
         {
            count+=arl.get(i)[1]-arl.get(i)[0]+1;
         }

        return days-count;
    }
}