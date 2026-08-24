class Solution {
    public List<Integer> majorityElement(int[] a) {

        int n=a.length;
    List<Integer>list=new ArrayList<>();
    HashMap<Integer,Integer> map=new HashMap<>();
    int count=0;

    for(int i=0;i<n;i++)
    {
        if(!map.containsKey(a[i]))
        {
            map.put(a[i],count=1);
        }
        else {
            int oldCnt=map.get(a[i]);
            int newCnt=oldCnt+1;
            map.put(a[i],newCnt);
            
        }

        int current=map.get(a[i]);
        if(current>n/3 && !list.contains(a[i]))
        {
            list.add(a[i]);
        }
    }

      return list;
        
    }
}