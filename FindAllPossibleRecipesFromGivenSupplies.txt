class Solution {
    public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        HashMap<String,Integer>map=new HashMap<>();
        List<String>arl=new ArrayList<>();
        int a[]=new int[recipes.length];
        for(int i=0;i<supplies.length;i++)
        map.put(supplies[i],1);
        int i,j;
        for(int k=0;k<recipes.length;k++){

          for( i=0;i<recipes.length;i++)
          {
            int c=0;
            for(j=0;j<ingredients.get(i).size();j++)
            {
                if(map.containsKey(ingredients.get(i).get(j)))
                continue;
                else{
                    c=1;
                    break;
                }

            }
            if(c==0){
            a[i]=1;
            map.put(recipes[i],1);
           }else{
            a[i]=-1;
           }
        }
    }
    for(int z=0;z<recipes.length;z++)
    {
        if(a[z]==1)
        arl.add(recipes[z]);
    }
        return arl;
        
    }
}