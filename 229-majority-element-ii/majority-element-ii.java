class Solution {
    public List<Integer> majorityElement(int[] a) {

     int n=a.length;
     int count=0;
     List<Integer> list=new ArrayList<>();

     for(int i=0;i<n;i++)
     {
        if(list.contains(a[i]))
        {
            continue;
        }

        for(int j=0;j<n;j++)
        {
            if(a[j]==a[i])
            {
                count++;
            }
        }
        if(count>n/3)
        {
         list.add(a[i]);
        }
        count=0;
     }
      return list;
        
    }
}