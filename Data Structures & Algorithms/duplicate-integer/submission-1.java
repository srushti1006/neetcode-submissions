class Solution {
    public boolean hasDuplicate(int[] nums) {
        // for(int i=0;i<nums.length;i++)
        // {
        //     for(int j=i+1;j<nums.length;j++)
        //     {
        //         if(nums[i]==nums[j])
        //         {
        //             return true;
        //         }
        //     }
        // }
        // return false;
        HashSet s = new HashSet();
        for(int i=0;i<nums.length;i++)
        {
            s.add(nums[i]);
        }
        if(s.size()<nums.length)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}