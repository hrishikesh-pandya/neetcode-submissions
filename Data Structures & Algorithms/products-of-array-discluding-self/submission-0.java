class Solution {
    public int[] productExceptSelf(int[] nums) {
        int ans[]=new int[nums.length];
        int prod=1;
        int numZero=0;
        
        for(int i:nums)
        {
            if(i!=0) prod=prod*i;
            else numZero++;
        }

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0 && numZero==1) ans[i]=prod;
            else if(nums[i]==0 && numZero>1) ans[i]=0;
            else if(numZero>0 && nums[i]!=0) ans[i]=0;
            else ans[i]=prod/nums[i];
        }

        return ans;
    }
}  
