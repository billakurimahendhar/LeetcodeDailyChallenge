class Solution {
    public int minimumIndex(List<Integer> nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(Integer i:nums)
        map.put(i,map.getOrDefault(i,0)+1);
        int a=0;
        int b=-1;
        for(Integer key:map.keySet())
        {
            if(map.get(key)>(nums.size()/2)){
            a=key;
            b=map.get(key);
            break;
            }
        }
        int c=0;
        int i;
        int mini=-1;
        for( i=0;i<nums.size();i++)
        {
            if(nums.get(i)==a)
            {
                c++;
                if(c>((i+1)/2))
                {
                    int z=b-c;
                    if(z>(nums.size()-i-1)/2){
                        mini=i;
                    break;
                    }
                    else
                    break;
                

                }
            }

        }
        return mini;
        
    }
}