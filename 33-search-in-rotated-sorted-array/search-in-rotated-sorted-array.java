class Solution {
    public int search(int[] a, int target) 
    {
        int n=a.length;
        int low=0;
        int high=n-1;
        int mid;
        int ans=-1;
        while(low<=high)
        {
           mid=(low+high)/2;
           if(a[mid]==target)
           {
             return mid;
           }

           //Left half is sorted
           if(a[low]<=a[mid])
           {
              //Target lies in left half
              if(a[low]<=target && a[mid]>=target)
              {
                high=mid-1;
              }
              else{
                low=mid+1;
              }
           }

           //Right half is sorted
           else{
            //Target lies in left half
              if(a[mid]<=target && a[high]>=target)
              {
                low=mid+1;
              }
              else{
                high=mid-1;
              }
            
           }
          
        }   

        return -1;
    }
}