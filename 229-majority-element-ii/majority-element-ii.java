    class Solution {
        public List<Integer> majorityElement(int[] a) {

        List<Integer>list=new ArrayList<>();
        int n=a.length;

        int ele1=0;
        int ele2=0;
        int cnt1=0;
        int cnt2=0;

        //    It tries to find the only possible elements that could be majority elements.
        //    For n/3, there can be at most 2 majority elements.
        for(int i=0;i<n;i++)
        {
            if(cnt1==0 && a[i]!=ele2)
            {
                ele1=a[i];
                cnt1++;
            }
            else if(cnt2==0 && a[i]!=ele1)
            {
                ele2=a[i];
                cnt2++;
            }
            else if(ele1==a[i])
            {
                cnt1++;
            }
            else if(ele2==a[i])
            {
                cnt2++;
            }
            else{
                cnt1--;
                cnt2--;

            }
        }

        int count1=0;
        int count2=0;
        for(int i=0;i<n;i++)
        {
            if(ele1==a[i])
            {
                count1++;
            }
            if(ele2==a[i])
            {
                count2++;
            }
          if(count1>n/3 && !list.contains(ele1))
              {
                list.add(a[i]);
              }

         if(count2>n/3 && !list.contains(ele2))
              {
                list.add(a[i]);
              }

        }

      



        return list;
            
        }
    }