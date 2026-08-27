class Solution {
    public List<List<Integer>> fourSum(int[] a, int target) 
    {
        List<List<Integer>> list=new ArrayList<>();
        
        Arrays.sort(a);
        int n=a.length;
        int left;
        int right;
      
        for(int i=0;i<n;i++)
        {
            
            int fixed1=a[i];
            for(int j=i+1;j<n;j++)
            {
                left= j+1;
                right= n-1;
               while(left<right)
             {
                int fixed2=a[j];
                long sum=(long) fixed1+fixed2+a[left]+a[right];
                if(sum==target)
                {
                    List<Integer> quad=new ArrayList<>();
                    quad.add(fixed1);
                    quad.add(fixed2);
                    quad.add(a[left]);
                    quad.add(a[right]);

                    if(!list.contains(quad))
                    {
                         list.add(quad);
                    }

                    left++;
                    right--;

                while(left<right && a[left]==a[left-1])
               {
                left++;
               }

                while(left<right && a[right]==a[right+1])
               {
                 right--;
               }

               }

               
               else if(sum<target)
                {
                    left++;
                }
                else{
                    right--;
                }

               

               
             }
                
            }


        }
        

        return list;
    }
}