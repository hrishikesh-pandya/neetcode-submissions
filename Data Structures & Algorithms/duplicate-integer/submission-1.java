class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        
        boolean flag=false;
        for(int i: nums)
        {
            if(hs.contains(i))
            {
                flag=true;
                break;
            }
            else
            {
                hs.add(i);
            }
        }

        return flag;

    }
}