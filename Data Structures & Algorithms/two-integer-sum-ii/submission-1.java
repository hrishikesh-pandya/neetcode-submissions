class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length;
        int ans[]={0,0};
        for(int i=0;i<n;i++)
        {
            int j=BinarySearch(numbers,target,i);

            if(numbers[i]+numbers[j]==target)
            {
                ans[0]=i+1;
                ans[1]=j+1;
                break;
            }
        }
        return ans;
    }

    public int BinarySearch(int numbers[], int target,int i)
    {
        int low=i+1;
        int high=numbers.length-1;
        int mid=low;
        while(low<=high)
        {
            mid=low+(high-low)/2;

            if(numbers[mid]==target-numbers[i])
            {
                break;
            }

            if(numbers[mid]<target-numbers[i])
            {
                low=mid+1;
            }

            else
            {
                high=mid-1;
            }
        }

        return mid;
    }
}
