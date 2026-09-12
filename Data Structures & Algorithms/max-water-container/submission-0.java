class Solution {
    public int maxArea(int[] heights) {
        int l=0;
        int r=heights.length-1;
        int maxAmount=-1;
        while(l<r)
        {
            int width=r-l;
            int height=Math.min(heights[l],heights[r]);

            maxAmount=Math.max(width*height,maxAmount);

            if(heights[l] < heights[r]) l++;
            else r--;
        }

        return maxAmount;
    }
}
