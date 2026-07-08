class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        
        boolean flag=true;
        for(int i: nums)
        {
            if(hs.contains(i))
            {
                flag=false;
                break;
            }
            else
            {
                hs.add(i);
            }
        }

        return !flag;

    }
}