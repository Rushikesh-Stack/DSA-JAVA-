class Solution {

//     List<List<Integer>> a

// [
//  [1],           → Row 1
//  [1, 1],        → Row 2
//  [1, 2, 1],     → Row 3
//  [1, 3, 3, 1]   → Row 4
// ]
    
    public List<List<Integer>> generate(int n) {

        List<List<Integer>> a=new  ArrayList<>();
        for(int i=0;i<n;i++)
        {
            List<Integer> row=new ArrayList<>();
            int left=0;
            int right=1;

            for(int j=0;j<=i;j++)
            {
                if(j==0)
                {
                    row.add(1);
                }
                else if(j==i)
                {
                    row.add(1);
                }
                else{
                    int value=a.get(i-1).get(left)+a.get(i-1).get(right);

                    row.add(value);

                    right++;
                    left++;
                }

            }
            a.add(row);
        }

        return a;

    }
}