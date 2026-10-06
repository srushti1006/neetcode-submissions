class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hs = new HashMap();
        for(int i=0;i<nums.length;i++)
        {
            if(hs.containsKey(nums[i]))
            {
                hs.put(nums[i],hs.get(nums[i])+1);
            }
            else
            {
                hs.put(nums[i],1);
            }
        }
        List<Map.Entry<Integer,Integer>> l = new ArrayList<>(hs.entrySet());
        Collections.sort(l,(o1,o2) -> o2.getValue().compareTo(o1.getValue()));
        int[] res = new int[k];
        for(int i = 0; i< k; i++)
        {
            res[i]=l.get(i).getKey();
        }
        return res;
    }
}
