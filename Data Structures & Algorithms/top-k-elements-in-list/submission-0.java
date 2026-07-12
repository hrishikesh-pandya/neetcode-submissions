class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        //maps freq of each number that appears
        Map<Integer,Integer> count=new HashMap<>();  
        
        /* 
        An array of size nums.length+1, where indexes are 0-nums.length, 
        each index is the frequency, and its value is a list of all numbers 
        that have that frequency.
        ex: [1,1,1,2,2,2,4,4] numbers 1 and 2 have frequency 3, so at freq[3]={1,2}
        */
        List<Integer>[] freq=new List[nums.length+1]; 

        for(int i=0;i<freq.length;i++)
        {
            freq[i]=new ArrayList<>(); //init empty lists at each index
        }

        for(int n:nums)
        {
            count.put(n, count.getOrDefault(n,0)+1); //init hashmap values
        }

        for(Map.Entry<Integer,Integer> entry: count.entrySet())
        {
            freq[entry.getValue()].add(entry.getKey()); //init values in freq
        }

        int res[]=new int[k];
        int index=0;
        /*
        Now we've created an array in which the indexes store the frequencies,
        and the values store the numbers which had those frequencies.
        Iterate through this array, and insert values into result array
        Continue iterating as long as k values are not reached and array still has
        indices left. 
        */
        for(int i=freq.length-1;i>0 && index<k;i--)
        {
            for(int n:freq[i])
            {
                res[index++]=n;
                if(index==k)//if current index pointer is k, ie top k values found
                {
                    return res;
                }
            }
        }

        return res;
    }
}
