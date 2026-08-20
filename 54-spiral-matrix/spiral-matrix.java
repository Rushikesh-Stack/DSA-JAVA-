class Solution {
    public List<Integer> spiralOrder(int[][] a) {

        List<Integer> list = new ArrayList<>();

        int rows = a.length;
        int cols = a[0].length;

        int top = 0;
        int bottom = rows - 1;
        int left = 0;
        int right = cols - 1;

        while(top <= bottom && left <= right)
        {
           for(int i=left;i<=right;i++)
           {
            //row is fixed  Left->right
              list.add(a[top][i]);
           }
           top++;

           for(int i=top;i<=bottom;i++)
           {
            //right is fixed top->bottom
             list.add(a[i][right]);
           }
           right--;

           //to prevent from overlapping & stop at collsion
           if(top<=bottom)
           {
              for(int i=right;i>=left;i--)
              {
                //bottom  is fixed right->left
                list.add(a[bottom][i]); 
              }
              bottom--;
           }

           if(left<=right)
           {
            for(int i=bottom;i>=top;i--)
            {
             list.add(a[i][left]);
        
            }
            left++;
           }

        }

        return list;
    }
}