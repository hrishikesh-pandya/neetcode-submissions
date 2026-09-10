class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int r=numbers.length-1;
        int l=0;

        while(l<r)
        {
            int curSum=numbers[l]+numbers[r];
            if(curSum==target)
            {
                break;
            }

            else if(curSum<target)
            {
                l++;
            }

            else
            {
                r--;
            }

        }

        return new int[] {l+1, r+1};

    }
}
