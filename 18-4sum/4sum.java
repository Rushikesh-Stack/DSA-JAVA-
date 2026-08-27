class Solution {
    public List<List<Integer>> fourSum(int[] a, int target) 
    {
        
        List<List<Integer>> list=new ArrayList<>();
        int n=a.length;

        for(int i=0;i<n;i++)
        {
            int fixed1=a[i];
            for(int j=i+1;j<n;j++)
            {
                HashMap<Long,Integer>map=new HashMap<>();
                int fixed2=a[j];
                for(int k=j+1;k<n;k++)
                {
                    long needed=(long) target-fixed1-fixed2-a[k];

                    if(!map.containsKey(needed))
                    {
                        map.put((long) a[k],k);
                    }
                    else{
                        List<Integer>quad=new ArrayList<>();

                        quad.add(fixed1);
                        quad.add(fixed2);
                        quad.add((int)needed);
                        quad.add(a[k]);
                        
                        Collections.sort(quad);
                         if(!list.contains(quad))
                            {
                                list.add(quad);
                            }

                    }
                }
            }
        }
        

        return list;
    }
}