class Solution {
    public String reverseVowels(String s) {
        int n=s.length();
        char a[]=s.toCharArray();

        int low=0;
        int high=n-1;

        while(low<high)
        {
         while (low < high && "aeiou".indexOf(Character.toLowerCase(a[low])) == -1) 
            {
                low++;
            }

         while (low < high && "aeiou".indexOf(Character.toLowerCase(a[high])) == -1) 
            {
                high--;
            }

        char temp=a[low];
        a[low]=a[high];
        a[high]=temp;

        low++;
        high--;
        }

        return new String(a);
    


        
    }
}