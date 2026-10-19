
class Solution {
    public boolean searchMatrix(int[][] a, int target) {
       int rows=a.length;
       int cols=a[0].length;
       int low=0;
       int high=rows*cols-1;
       int flag=0;

       while(low<=high)
       {
          int mid=low+(high-low)/2;

          int r=mid/cols;
          int c=mid%cols;

          if(a[r][c]==target)
          {
            flag=1;
            break;
          }
          else if(a[r][c]>target)
          {
            high=mid-1;
          }
          else{
            low=mid+1;
          }
       }

       if(flag==0)
       {
        return false;
       }
       else{
        return true;
       }

    }
}
