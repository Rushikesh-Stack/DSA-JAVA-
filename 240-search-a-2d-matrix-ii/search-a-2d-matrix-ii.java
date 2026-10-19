
class Solution {
    public boolean searchMatrix(int[][] a, int target) {
        int rows = a.length;
        int cols=a[0].length;

        int r=0;
        int c=cols-1;

        // here the c is on top right first idx i.e at 15 element idx
        while(r<rows && c>=0) 
        {
            if(a[r][c]==target)
            {
                return true;
            }
            else if(a[r][c]<target)
            {
                r++;
            }
            else{
                 c--;
            }
        }
        return false;
    }
}
