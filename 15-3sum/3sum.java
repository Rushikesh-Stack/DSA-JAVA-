class Solution {
    public List<List<Integer>> threeSum(int[] a) 
    {
      
       int n=a.length;
       List<List<Integer>> list=new ArrayList<>();

       Arrays.sort(a);
       int left;
       int right;
       int target=0;

       for(int i=0;i<n-1;i++)
       {
        //Skip duplicate values
        if(i>0 && a[i]==a[i-1])
        {
            continue;
        }
          int fixed=a[i];
          left=i+1;
          right=n-1;

        while(left<right)
        {

        int sum= fixed+ a[left]+ a[right];
          if(sum == target)
          {
            
            List<Integer>triplet=new ArrayList<>();
            triplet.add(fixed);
            triplet.add(a[left]);
            triplet.add(a[right]);

            list.add(triplet);

            right--;
            left++;

            //skip duplicates left values
        while(left<right && a[left]==a[left-1])
        {
            left++;
        }
        //skip duplicates right values
        while(left< right &&a[right]==a[right+1])
        {
            right--;
        }
            }
          
          else if(sum<0 )
          {
            left++;
          }
          else{
            right--;
          }
        }
       }

       return list;    
    }
}